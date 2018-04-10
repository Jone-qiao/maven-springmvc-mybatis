package com.qiaohk.service;

import java.util.List;

import com.qiaohk.po.ProductsCustom;
import com.qiaohk.po.ProductsQueryVo;


public interface ProductsService {

	public List<ProductsCustom> getProductsList(ProductsQueryVo productsQueryVo) throws Exception;
	
	public ProductsCustom findProductById(Integer id) throws Exception;
	
}
