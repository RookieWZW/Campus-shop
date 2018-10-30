package com.rookiewzw.myo2o.service;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.rookiewzw.myo2o.dto.LocalAuthExecution;
import com.rookiewzw.myo2o.entity.LocalAuth;

public interface LocalAuthService {
	
	LocalAuth getLocalAuthByUserNameAndPwd(String userName, String password);

	
	LocalAuth getLocalAuthByUserId(long userId);

	
	LocalAuthExecution register(LocalAuth localAuth,
			CommonsMultipartFile profileImg) throws RuntimeException;

	LocalAuthExecution bindLocalAuth(LocalAuth localAuth)
			throws RuntimeException;

	
	LocalAuthExecution modifyLocalAuth(Long userId, String userName,
			String password, String newPassword);
}
