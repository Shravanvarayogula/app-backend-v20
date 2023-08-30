package com.ahs.queueconfigurationapp.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ahs.queueconfigurationapp.entity.ParagonQueue;

public interface CustomConfigRepository {
	
		boolean getAutoCallerConfigStatus(String queuename);
		
		ParagonQueue fetchQueueConfigByName(String queuename);
		
		List<ParagonQueue> fetchQueueByTenantId(int tenantId);
		
		ParagonQueue fetchAutoCallingConfigs(String queuename);	
		
		public void serializeConfigAttributes();
		
		public void deserializeConfigAttributes();
		
		
}
