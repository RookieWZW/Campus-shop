package com.rookiewzw.myo2o.service;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.rookiewzw.myo2o.dto.ShopExecution;
import com.rookiewzw.myo2o.entity.Shop;

public interface ShopService {

	ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);

	ShopExecution getByEmployeeId(long employeeId) throws RuntimeException;

	Shop getByShopId(long shopId);

	ShopExecution addShop(Shop shop, CommonsMultipartFile shopImg) throws RuntimeException;

	ShopExecution modifyShop(Shop shop, CommonsMultipartFile shopImg) throws RuntimeException;

}
