package com.bjbj.manage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjbj.common.util.CookieUtils;
import com.bjbj.common.vo.SysResult;
import com.bjbj.manage.service.SellerService;

@Controller
@RequestMapping("/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping("/doLogin")
	@ResponseBody
	public SysResult doLogin(
			String username,
			String password,
			HttpServletRequest request,
			HttpServletResponse response) {
		Integer sellerId = sellerService.selectSeller(username, password);
		if(sellerId == null) {
			return SysResult.build(201, "账号密码错误");
		}
		CookieUtils.setCookie(request, response, "sellerId", sellerId.toString());
		return SysResult.oK();
	}

}
