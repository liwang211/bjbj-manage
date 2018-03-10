package com.bjbj.manage.service;

import java.util.List;

import com.bjbj.manage.pojo.Product;

public interface ProductService {
	
	List<Product> selectPageProducts(int sellerId,int page,int size);
	
	void insertProduct(int sellerid,Product product);

}
