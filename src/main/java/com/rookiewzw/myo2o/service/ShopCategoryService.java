package com.rookiewzw.myo2o.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.rookiewzw.myo2o.dto.ShopCategoryExecution;
import com.rookiewzw.myo2o.entity.ShopCategory;

public interface ShopCategoryService {

	
	List<ShopCategory> getFirstLevelShopCategoryList() throws IOException;
	
	List<ShopCategory> getShopCategoryList(Long parentId) throws IOException;
	
	List<ShopCategory> getAllSecondLevelShopCategory() throws IOException;
	
	ShopCategory getShopCategoryById(Long shopCategoryId);
	
	ShopCategoryExecution addShopCategory(ShopCategory shopCategory,CommonsMultipartFile thumbnail);
	
	ShopCategoryExecution modifyShopCategory(ShopCategory shopCategory,CommonsMultipartFile thumbnail,boolean thumbnailChange);
	
	ShopCategoryExecution removeShopCategory(long shopcategoryId);
	
	ShopCategoryExecution removeShopCategoryList(List<Long> shopCategoryIdList);
}
