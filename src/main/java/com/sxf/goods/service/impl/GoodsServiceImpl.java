package com.sxf.goods.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxf.goods.dao.GoodsMapper;
import com.sxf.goods.domain.Brand;
import com.sxf.goods.domain.Goods;
import com.sxf.goods.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {

	//注入
	@Resource
	private GoodsMapper mapper;

	@Override
	public PageInfo<Goods> selects(String gname, Integer page, Integer pageSize) {
		//分页
		PageHelper.startPage(page, pageSize);
		//list页面
		List<Goods> list = mapper.selects(gname);
		
		return new PageInfo<Goods>(list);
	}

	@Override
	public boolean insert(Goods goods) {
		return mapper.insert(goods);
	}

	@Override
	public List<Goods> selectGoods(Integer gid) {
		return mapper.selectGoods(gid);
	}

	@Override
	public List<Brand> selectByBrand() {
		return mapper.selectByBrand();
	}

}
