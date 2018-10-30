package com.rookiewzw.myo2o.service;

import com.rookiewzw.myo2o.dto.UserShopMapExecution;
import com.rookiewzw.myo2o.entity.UserShopMap;

public interface UserShopMapService {

	UserShopMapExecution listUserShopMap(UserShopMap userShopMapCondition,
			int pageIndex, int pageSize);

}
