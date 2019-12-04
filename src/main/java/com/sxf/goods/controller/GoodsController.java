package com.sxf.goods.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sxf.goods.domain.Brand;
import com.sxf.goods.domain.Goods;
import com.sxf.goods.service.BrandService;
import com.sxf.goods.service.GoodsService;

@Controller
public class GoodsController {

	//注入
	@Resource
	private GoodsService service;
	@Resource
	private BrandService brandservice;
	
	/**
	 * 列表展示
	 * @param model
	 * @param 模糊
	 * @param 分页
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("select")
	public String selects(Model model,String gname,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "3")Integer pageSize) {
	
		PageInfo<Goods> info = service.selects(gname, page, pageSize);
		
		model.addAttribute("info", info);
		model.addAttribute("gname", gname);
		
		return "selects";
	}
	@ResponseBody
	@GetMapping("/selectByBrand")
	public String selectByBrand(){
		List<Brand> list = service.selectByBrand();
		
		System.out.println(list);
		return "/toAdd";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd(Model m) {
		return "add";
	}
	
	@ResponseBody
	@RequestMapping("/add")
	public boolean add(Goods goods) {
		
		boolean good = service.insert(goods);
		return good;
	}
	
	@RequestMapping("/selectGoods")
	public String selectGoods(Model m,Integer gid){
		List<Goods> goods = service.selectGoods(gid);
		m.addAttribute("goods", goods);
		return "list";
		
	}
	
	@RequestMapping("update")
	public String update() {
		return "update";
	}
}
