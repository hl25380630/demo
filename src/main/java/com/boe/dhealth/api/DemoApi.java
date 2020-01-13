package com.boe.dhealth.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boe.common.sdk.dto.JsonResponse;
import com.boe.dhealth.service.DemoService;

@RestController
public class DemoApi {
	
	@Autowired
	private DemoService demoService;
	
	@PostMapping("/demo/hello")
	public JsonResponse<String> hello(@RequestBody Map<String, Object> params){
		String s = demoService.hello(params);
		return new JsonResponse<String>(s);
	}

}
