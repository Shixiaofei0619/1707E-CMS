package com.sxf.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sxf.goods.domain.Brand;
import com.sxf.goods.domain.Goods;

public interface GoodsMapper {

	List<Goods> selects(@Param("gname")String gname);

	boolean insert(Goods goods);

	List<Goods> selectGoods(Integer gid);

	List<Brand> selectByBrand();
}
