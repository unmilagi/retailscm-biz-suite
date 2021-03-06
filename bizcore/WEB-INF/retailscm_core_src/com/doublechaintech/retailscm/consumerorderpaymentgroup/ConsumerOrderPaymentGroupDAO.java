
package com.doublechaintech.retailscm.consumerorderpaymentgroup;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import com.doublechaintech.retailscm.BaseEntity;
import com.doublechaintech.retailscm.SmartList;
import com.doublechaintech.retailscm.MultipleAccessKey;
import com.doublechaintech.retailscm.RetailscmUserContext;

import com.doublechaintech.retailscm.consumerorder.ConsumerOrder;

import com.doublechaintech.retailscm.consumerorder.ConsumerOrderDAO;


public interface ConsumerOrderPaymentGroupDAO{

	
	public ConsumerOrderPaymentGroup load(String id, Map<String,Object> options) throws Exception;
	public void enhanceList(List<ConsumerOrderPaymentGroup> consumerOrderPaymentGroupList);
	public void collectAndEnhance(BaseEntity ownerEntity);
	
	public void alias(List<BaseEntity> entityList);
	
	
	
	
	public ConsumerOrderPaymentGroup present(ConsumerOrderPaymentGroup consumerOrderPaymentGroup,Map<String,Object> options) throws Exception;
	public ConsumerOrderPaymentGroup clone(String id, Map<String,Object> options) throws Exception;
	
	
	
	public ConsumerOrderPaymentGroup save(ConsumerOrderPaymentGroup consumerOrderPaymentGroup,Map<String,Object> options);
	public SmartList<ConsumerOrderPaymentGroup> saveConsumerOrderPaymentGroupList(SmartList<ConsumerOrderPaymentGroup> consumerOrderPaymentGroupList,Map<String,Object> options);
	public SmartList<ConsumerOrderPaymentGroup> removeConsumerOrderPaymentGroupList(SmartList<ConsumerOrderPaymentGroup> consumerOrderPaymentGroupList,Map<String,Object> options);
	public SmartList<ConsumerOrderPaymentGroup> findConsumerOrderPaymentGroupWithKey(MultipleAccessKey key,Map<String, Object> options);
	public int countConsumerOrderPaymentGroupWithKey(MultipleAccessKey key,Map<String, Object> options);
	public Map<String, Integer> countConsumerOrderPaymentGroupWithGroupKey(String groupKey, MultipleAccessKey filterKey,
			Map<String, Object> options);
	public void delete(String consumerOrderPaymentGroupId, int version) throws Exception;
	public ConsumerOrderPaymentGroup disconnectFromAll(String consumerOrderPaymentGroupId, int version) throws Exception;
	public int deleteAll() throws Exception;

	
	
	
	public SmartList<ConsumerOrderPaymentGroup> queryList(String sql, Object ... parmeters);
 
 	public SmartList<ConsumerOrderPaymentGroup> findConsumerOrderPaymentGroupByBizOrder(String consumerOrderId, Map<String,Object> options);
 	public int countConsumerOrderPaymentGroupByBizOrder(String consumerOrderId, Map<String,Object> options);
 	public Map<String, Integer> countConsumerOrderPaymentGroupByBizOrderIds(String[] ids, Map<String,Object> options);
 	public SmartList<ConsumerOrderPaymentGroup> findConsumerOrderPaymentGroupByBizOrder(String consumerOrderId, int start, int count, Map<String,Object> options);
 	public void analyzeConsumerOrderPaymentGroupByBizOrder(SmartList<ConsumerOrderPaymentGroup> resultList, String consumerOrderId, Map<String,Object> options);

 
 
}


