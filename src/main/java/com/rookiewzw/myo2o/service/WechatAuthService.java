package com.rookiewzw.myo2o.service;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.rookiewzw.myo2o.dto.WechatAuthExecution;
import com.rookiewzw.myo2o.entity.WechatAuth;

public interface WechatAuthService {
	WechatAuth getWechatAuthByOpenId(String openId);
	
	WechatAuthExecution register(WechatAuth wechatAuth,
			CommonsMultipartFile profileImg) throws RuntimeException;
}
