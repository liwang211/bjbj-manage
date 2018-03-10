package com.bjbj.manage.service;

import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService{

	@Override
	public Integer selectSeller(String username, String password) {
		if("admin".equals(username) && "admin".equals(password)) {
			return 11;
		}
		return null;
	}
	

}
