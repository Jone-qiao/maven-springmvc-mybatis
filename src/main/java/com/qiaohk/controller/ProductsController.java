package com.qiaohk.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qiaohk.po.ProductsCustom;
import com.qiaohk.service.ProductsService;

@Controller
@RequestMapping(value = "/product")
public class ProductsController {

	@Autowired
	private ProductsService productsService;

	@RequestMapping(value = "/{id}", method = { RequestMethod.GET })
	public String index(HttpServletRequest request, @PathVariable("id") Integer id) throws Exception {

		ProductsCustom productsCustom = productsService.findProductById(id);

		if (productsCustom == null) {
			request.setAttribute("message", "商品不存在");
			return "error";
		}

		request.setAttribute("product", productsCustom);

		return "products/product";
	}

	@RequestMapping(value = "/buy", method = { RequestMethod.POST })
	public @ResponseBody String buy(Integer id, Integer num, HttpSession session) throws Exception {

		Map<Integer, Integer> products = new HashMap<Integer, Integer>();

		products.put(id, num);
		products.put(2, 3);

		session.setAttribute("order_products", products);

		return "success";
	}
}
