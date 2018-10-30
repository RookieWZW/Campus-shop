package com.rookiewzw.myo2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rookiewzw.myo2o.entity.Shop;

public interface ShopDao {

	List<Shop> queryShopList(@Param("shopCondition") Shop shopCondition, @Param("rowIndex") int rowIndex,
			@Param("pageSize") int pageSize);

	int queryShopCount(@Param("shopCondition") Shop shopCondition);

	List<Shop> queryByEmployeeId(long employeeId);

	Shop queryByShopId(long shopId);

	int insertShop(Shop shop);

	int updateShop(Shop shop);

	int deleteShopByName(String shopName);

}
