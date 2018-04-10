package com.qiaohk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qiaohk.mapper.ProductsMapperCustom;
import com.qiaohk.po.ProductsCustom;
import com.qiaohk.po.ProductsQueryVo;
import com.qiaohk.service.ProductsService;

public class ProductsServiceImpl implements ProductsService{

	@Autowired
	private ProductsMapperCustom productsMapperCustom;

	@Override
	public List<ProductsCustom> getProductsList(ProductsQueryVo productsQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return productsMapperCustom.getProductsList(productsQueryVo);
	}

	@Override
	public ProductsCustom findProductById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return productsMapperCustom.findProductById(id);
	}
	
	
	
}
