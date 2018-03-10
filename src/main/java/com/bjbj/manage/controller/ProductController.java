package com.bjbj.manage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjbj.common.util.CookieUtils;
import com.bjbj.common.vo.SysResult;
import com.bjbj.manage.pojo.Product;
import com.bjbj.manage.service.ProductService;

@Controller
@RequestMapping("/item")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/query")
	@ResponseBody
	public SysResult selectItems(
			int page,
			int rows,
			HttpServletRequest request) {
		String cookieValue = CookieUtils.getCookieValue(request, "sellerId");
		int sellerId = 0;
		try {
			sellerId = Integer.parseInt(cookieValue);
		} catch (Exception e) {
			System.out.println("获取商家id失败");
			return null;
		}
		List<Product> products = productService.selectPageProducts(sellerId, page, rows);
		return SysResult.oK(products);
	}
	
	@RequestMapping("/add")
	public SysResult insertItem(Product product,HttpServletRequest request) {
		String cookieValue = CookieUtils.getCookieValue(request, "sellerId");
		int sellerId = 0;
		try {
			sellerId = Integer.parseInt(cookieValue);
		} catch (Exception e) {
			System.out.println("获取商家id失败");
			return null;
		}
		
		return null;
	}
	

}
