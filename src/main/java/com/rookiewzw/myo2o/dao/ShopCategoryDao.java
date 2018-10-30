package com.rookiewzw.myo2o.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rookiewzw.myo2o.entity.ShopCategory;

public interface ShopCategoryDao {
	
	List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition")ShopCategory shopCategoryCondition);
	
	
	ShopCategory queryShopCategoryById(long shopCategory);
	
	List<ShopCategory> queryShopCategoryByIds(List<Long> shopCategoryIdList);
	
	int insertShopCategory(ShopCategory shopCategory);
	
	int updateShopCategory(ShopCategory shopCategory);
	
	
	int deleteShopCategory(long shopCategory);
	
	int batchDeleteShopCategory(List<Long> shopCategoryIdList);
}
