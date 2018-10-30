package com.rookiewzw.myo2o.service;

import com.rookiewzw.myo2o.dto.PersonInfoExecution;
import com.rookiewzw.myo2o.entity.PersonInfo;

public interface PersonInfoService {


	PersonInfo getPersonInfoById(Long userId);

	PersonInfoExecution getPersonInfoList(PersonInfo personInfoCondition,
			int pageIndex, int pageSize);

	
	PersonInfoExecution addPersonInfo(PersonInfo personInfo);

	PersonInfoExecution modifyPersonInfo(PersonInfo personInfo);
}
