package com.sxf.goods.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sxf.goods.domain.Goods;
import com.sxf.goods.service.GoodsService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class GoodsServiceImplTest {

	@Resource
	private GoodsService service;
	@Test
	public void testInsert() {
		Goods goods = new Goods();
		
		boolean b = service.insert(goods);
		System.out.println(b);
	}

	
	@Test
	public void testSelects() {
		Goods good = new Goods();
		
	}

}
