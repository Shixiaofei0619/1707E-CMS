package com.sxf.goods.service;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sxf.goods.domain.Brand;
import com.sxf.goods.domain.Goods;

public interface GoodsService {

	PageInfo<Goods> selects(String gname,Integer page,Integer pageSize);

	boolean insert(Goods goods);

	List<Goods> selectGoods(Integer gid);

	List<Brand> selectByBrand();

}
