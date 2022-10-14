package com.wks.caseengine.rest.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wks.caseengine.process.engine.ProcessEngineService;

@RestController
@RequestMapping("healthCheck")
public class HealthCheckController {

	@Autowired
	private ProcessEngineService processEngineService;

	@GetMapping(value = "/")
	public String check() {
		return processEngineService.healthCheck();
	}

}
