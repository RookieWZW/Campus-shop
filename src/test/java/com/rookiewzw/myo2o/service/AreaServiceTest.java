package com.rookiewzw.myo2o.service;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rookiewzw.myo2o.BaseTest;
import com.rookiewzw.myo2o.entity.Area;

public class AreaServiceTest extends BaseTest {

	@Autowired
	private AreaService areaService;

	@Test
	public void testGetAreaList() throws JsonParseException, JsonMappingException, IOException {
		List<Area> areaList = areaService.getAreaList();

		assertEquals(4, areaList.size());
	}
}
