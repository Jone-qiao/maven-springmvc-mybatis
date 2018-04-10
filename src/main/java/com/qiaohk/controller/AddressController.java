package com.qiaohk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qiaohk.po.AddressesCustom;
import com.qiaohk.service.AddressesService;

@Controller
@RequestMapping("/my/address")
public class AddressController {
	@Autowired
	private AddressesService addressesService;

	// 我的地址列表页面
	@RequestMapping(value = "", method = { RequestMethod.GET })
	public String index(HttpSession session, HttpServletRequest request) throws Exception {

		Integer idUser = (Integer) session.getAttribute("idUser");

		List<AddressesCustom> addresses = addressesService.getUserAddressesList(idUser);

		request.setAttribute("addresses", addresses);

		return "address/index";
	}

	// 添加地址页面
	@RequestMapping(value = "/create", method = { RequestMethod.GET })
	public String CreateAddressPage() {
		return "address/create";
	}

	// 添加地址保存方法
	@RequestMapping(value = "", method = { RequestMethod.POST })
	public String CreateAddressSubmit(HttpSession session, HttpServletRequest request,
			@Validated @ModelAttribute("address") AddressesCustom addressesCustom, BindingResult bindingResult)
			throws Exception {

		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();

			request.setAttribute("allErrors", allErrors);

			return "address/create";
		}

		Integer idUser = (Integer) session.getAttribute("idUser");
		addressesCustom.setUser_id(idUser);

		addressesService.createAddress(addressesCustom);
		// System.out.println(addressesCustom.getId());

		return "redirect:/my/address";

	}

	// 修改地址页面
	@RequestMapping(value = "/{id}/update", method = { RequestMethod.GET })
	public String updateAddressPage(HttpSession session, HttpServletRequest request, @PathVariable("id") Integer id)
			throws Exception {

		AddressesCustom address = addressesService.findAddressById(id);

		request.setAttribute("address", address);

		return "address/update";
	}

	// 修改地址保存方法
	@RequestMapping(value = "/{id}/update", method = { RequestMethod.POST })
	public String updateAddressSubmit(@PathVariable("id") Integer id, HttpSession session, HttpServletRequest request,
			@Validated @ModelAttribute("address") AddressesCustom addressesCustom, BindingResult bindingResult)
			throws Exception {

		// 表单验证
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();

			request.setAttribute("allErrors", allErrors);

			return "address/update";
		}

		addressesCustom.setId(id);

		addressesService.updateAddressById(addressesCustom);

		return "redirect:/my/address";

	}

	// 删除地址方法
	@RequestMapping(value = "/{id}/del", method = { RequestMethod.GET })
	public String deleteAddressSubmit(@PathVariable("id") Integer id) throws Exception {

		addressesService.deleteAddressById(id);
		return "redirect:/my/address";

	}
}
