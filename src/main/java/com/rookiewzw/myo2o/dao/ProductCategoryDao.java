package com.rookiewzw.myo2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rookiewzw.myo2o.entity.ProductCategory;

public interface ProductCategoryDao {

	
	List<ProductCategory> queryByShopId(long shopId);
	
	
	int batchInsertProductCategory(List<ProductCategory> productCategoryList);
	
	int deleteProductCategory(@Param("productCategoryId")long productCategoryId,
			@Param("shopId")long shopId);
	
}
