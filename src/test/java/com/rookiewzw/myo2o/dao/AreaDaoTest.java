package com.rookiewzw.myo2o.dao;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import com.rookiewzw.myo2o.entity.Area;



public class AreaDaoTest {
	
	@Autowired
	private AreaDao areaDao;
	
	
	@Test
	public void testBQueryArea()  throws Exception{
		
		
		List<Area> areaList = areaDao.queryArea();
		assertEquals(4, areaList.size());
	}
}
