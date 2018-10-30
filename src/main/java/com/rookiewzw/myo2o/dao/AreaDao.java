package com.rookiewzw.myo2o.dao;

import java.util.List;

import com.rookiewzw.myo2o.entity.Area;

public interface AreaDao {
		
	
	List<Area> queryArea();
	
	
	int insertArea(Area area);
	
	
	int updateArea(Area area);
	
	
	int deleteArea(long areaId);
	
	int batchDeleteArea(List<Long> areaIdList);
}
