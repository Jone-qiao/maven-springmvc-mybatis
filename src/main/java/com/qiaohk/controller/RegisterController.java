package com.qiaohk.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.qiaohk.helper.MD5;
import com.qiaohk.po.MembersCustom;
import com.qiaohk.service.MembersService;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@Autowired
	private MembersService membersService;

	@RequestMapping(value = "", method = { RequestMethod.GET })
	public String index(HttpServletRequest request, @RequestParam(value = "next", defaultValue = "/") String next) {

		request.setAttribute("next", next);
		return "auth/register";
	}

	@RequestMapping(value = "", method = { RequestMethod.POST })
	public String register(HttpServletRequest request, HttpSession session,
			@RequestParam(value = "next", defaultValue = "/") String next,
			@ModelAttribute("member") MembersCustom membersCustom) throws Exception {

		// 定义错误信息数组
		List<String> authErrors = new ArrayList<String>();
		// 表单验证
		if (membersCustom.getLoginName() == "" || membersCustom.getPasswd() == ""
				|| membersCustom.getRePasswd() == "") {
			authErrors.add("请填写必填项");
			request.setAttribute("authErrors", authErrors);
			return "auth/register";
		}
		// 判断手机号是否已经注册
		MembersCustom members = membersService.findMemberByLoginName(membersCustom.getLoginName());
		if (members != null) {
			authErrors.add("该用户名已被注册");
			request.setAttribute("authErrors", authErrors);
			return "auth/register";
		}
		// 判断两次密码是否相同
		if (!membersCustom.getPasswd().equals(membersCustom.getRePasswd())) {
			authErrors.add("两次密码不相同");
			request.setAttribute("authErrors", authErrors);
			return "auth/register";
		}
		// 添加用户
		membersCustom.setName(membersCustom.getLoginName());
		membersCustom.setPasswd(MD5.MD5str(membersCustom.getPasswd()));
		membersService.createMember(membersCustom);
		// 登录保存session
		session.setAttribute("idUser", membersCustom.getIdUser());
		session.setAttribute("name", membersCustom.getName());
		// 跳转页面
		return "redirect:" + next;
	}

}
