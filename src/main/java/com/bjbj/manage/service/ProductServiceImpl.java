package com.bjbj.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjbj.manage.mapper.ProductMapper;
import com.bjbj.manage.pojo.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductMapper productMapper;
	@Override
	public List<Product> selectPageProducts(int sellerId, int page, int size) {
		int startIndex = (page-1)*size;
		List<Product> products = productMapper.selectPageProducts(startIndex, size);
		return products;
	}
	
	@Override
	public void insertProduct(int sellerid, Product product) {
		
	}

}
