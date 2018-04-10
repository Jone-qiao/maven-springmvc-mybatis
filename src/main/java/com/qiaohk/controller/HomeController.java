package com.qiaohk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qiaohk.po.ProductsCustom;
import com.qiaohk.po.ProductsQueryVo;
import com.qiaohk.service.ProductsService;

@Controller
public class HomeController {

	@Autowired
	private ProductsService productsService;

	@RequestMapping("/")
	public String home(ProductsQueryVo productsQueryVo, HttpServletRequest request) throws Exception {
		
		List<ProductsCustom> products = productsService.getProductsList(productsQueryVo);
		request.setAttribute("products", products);

		return "index";

	}

}
