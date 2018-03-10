package com.bjbj.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bjbj.manage.pojo.Product;

public interface ProductMapper {
	
	List<Product> selectPageProducts(
			@Param("startIndex")
			int startIndex,
			@Param("pageSize")
			int pageSize);
	
	int insertProduct(Product product);

}
