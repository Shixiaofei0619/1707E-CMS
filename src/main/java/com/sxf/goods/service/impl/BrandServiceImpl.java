package com.sxf.goods.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sxf.goods.dao.BrandMapper;
import com.sxf.goods.domain.Brand;
import com.sxf.goods.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService {

	@Resource
	private BrandMapper mapper;

	@Override
	public List<Brand> selectByBrand() {
		return mapper.selectByBrand();
	}
}
