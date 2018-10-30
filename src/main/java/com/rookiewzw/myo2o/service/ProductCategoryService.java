package com.rookiewzw.myo2o.service;

import java.util.List;

import com.rookiewzw.myo2o.dto.ProductCategoryExecution;
import com.rookiewzw.myo2o.entity.ProductCategory;

public interface ProductCategoryService {

	
	List<ProductCategory> getByShopId(long shopId);
	
	
	ProductCategoryExecution batchAddProductCategory(List<ProductCategory> productCategoryList) throws RuntimeException;
	
	
	ProductCategoryExecution deleteProductCategory(long productCategoryId,long shopId) throws RuntimeException;
}

