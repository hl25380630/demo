package com.boe.dhealth.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boe.dhealth.dao.DemoDao;

@Service
public class DemoService {
	
	@Autowired
	private DemoDao demoDao;

	public String hello(Map<String, Object> params) {
		String s = demoDao.getHello();
		return s;
	}

}
