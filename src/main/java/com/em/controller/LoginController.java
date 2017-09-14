package com.em.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.em.pojo.UserInfo;
import com.em.service.AnthorityService;
import com.em.service.UserInfoService;

@Controller
public class LoginController {

	/**
	 * 用户信息业务
	 */
	@Autowired
	private UserInfoService userservice;

	@Autowired
	private AnthorityService anthorityService;

	@RequestMapping("login.do")
	public String login(UserInfo user, HttpSession session, Model model) {

		UserInfo userinfo = userservice.login(user);

		// 如果用户为空
		if (StringUtils.isEmpty(userinfo)) {

			// 重定向到登录页面
			return "redirect:login.jsp";
		}

		// 存在用户 放入session中
		session.setAttribute("user", userinfo);

		@SuppressWarnings("rawtypes")
		List<Map> list = anthorityService.getMenuList(userinfo.getRoleId());
		session.setAttribute("menulist", list);
		return "main/index";
	}
}
