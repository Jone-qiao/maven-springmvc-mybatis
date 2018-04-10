package com.qiaohk.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/order")
public class OrderController {

	@RequestMapping(value = "", method = { RequestMethod.GET })
	public String index(HttpSession session) {

		
	
		//System.out.println(products);

		return "order/create";
	}
}
