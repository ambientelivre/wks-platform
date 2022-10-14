package com.wks.caseengine.process.instance;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wks.bpm.engine.client.ProcessEngineClient;
import com.wks.bpm.engine.model.spi.ActivityInstance;
import com.wks.bpm.engine.model.spi.ProcessInstance;

@Component
public class ProcessInstanceServiceImpl implements ProcessInstanceService {

	@Autowired
	private ProcessEngineClient processEngineClient;

	@Override
	public ProcessInstance create(final String processDefinitionKey) {
		return processEngineClient.startProcess(processDefinitionKey);
	}

	@Override
	public ProcessInstance create(final String processDefinitionKey, final String businessKey) {
		return processEngineClient.startProcess(processDefinitionKey, businessKey);
	}

	@Override
	public void delete(final String processInstanceId) {
		processEngineClient.deleteProcessInstance(processInstanceId);
	}

	@Override
	public void delete(final List<ProcessInstance> processInstances) {
		processInstances.forEach(o -> delete(o.getId()));
	}

	@Override
	public List<ProcessInstance> find(Optional<String> businessKey) {
		return Arrays.asList(processEngineClient.findProcessInstances(businessKey));
	}

	@Override
	public List<ActivityInstance> getActivityInstances(String processInstanceId) {
		return Arrays.asList(processEngineClient.findActivityInstances(processInstanceId));
	}

	public void setProcessEngineClient(ProcessEngineClient processEngineClient) {
		this.processEngineClient = processEngineClient;
	}

}
