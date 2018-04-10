package com.qiaohk.mapper;

import java.util.List;

import com.qiaohk.po.ProductsCustom;
import com.qiaohk.po.ProductsQueryVo;


public interface ProductsMapperCustom {

	public List<ProductsCustom> getProductsList(ProductsQueryVo productsQueryVo) throws Exception;
		
	public ProductsCustom findProductById(Integer id) throws Exception;
	
}
