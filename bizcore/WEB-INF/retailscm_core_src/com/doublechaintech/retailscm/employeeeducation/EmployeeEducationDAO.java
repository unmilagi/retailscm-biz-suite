
package com.doublechaintech.retailscm.employeeeducation;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import com.doublechaintech.retailscm.BaseEntity;
import com.doublechaintech.retailscm.SmartList;
import com.doublechaintech.retailscm.MultipleAccessKey;
import com.doublechaintech.retailscm.RetailscmUserContext;

import com.doublechaintech.retailscm.employee.Employee;

import com.doublechaintech.retailscm.employee.EmployeeDAO;


public interface EmployeeEducationDAO{

	
	public EmployeeEducation load(String id, Map<String,Object> options) throws Exception;
	public void enhanceList(List<EmployeeEducation> employeeEducationList);
	public void collectAndEnhance(BaseEntity ownerEntity);
	
	public void alias(List<BaseEntity> entityList);
	
	
	
	
	public EmployeeEducation present(EmployeeEducation employeeEducation,Map<String,Object> options) throws Exception;
	public EmployeeEducation clone(String id, Map<String,Object> options) throws Exception;
	
	
	
	public EmployeeEducation save(EmployeeEducation employeeEducation,Map<String,Object> options);
	public SmartList<EmployeeEducation> saveEmployeeEducationList(SmartList<EmployeeEducation> employeeEducationList,Map<String,Object> options);
	public SmartList<EmployeeEducation> removeEmployeeEducationList(SmartList<EmployeeEducation> employeeEducationList,Map<String,Object> options);
	public SmartList<EmployeeEducation> findEmployeeEducationWithKey(MultipleAccessKey key,Map<String, Object> options);
	public int countEmployeeEducationWithKey(MultipleAccessKey key,Map<String, Object> options);
	public Map<String, Integer> countEmployeeEducationWithGroupKey(String groupKey, MultipleAccessKey filterKey,
			Map<String, Object> options);
	public void delete(String employeeEducationId, int version) throws Exception;
	public EmployeeEducation disconnectFromAll(String employeeEducationId, int version) throws Exception;
	public int deleteAll() throws Exception;

	
	
	
	public SmartList<EmployeeEducation> queryList(String sql, Object ... parmeters);
 
 	public SmartList<EmployeeEducation> findEmployeeEducationByEmployee(String employeeId, Map<String,Object> options);
 	public int countEmployeeEducationByEmployee(String employeeId, Map<String,Object> options);
 	public Map<String, Integer> countEmployeeEducationByEmployeeIds(String[] ids, Map<String,Object> options);
 	public SmartList<EmployeeEducation> findEmployeeEducationByEmployee(String employeeId, int start, int count, Map<String,Object> options);
 	public void analyzeEmployeeEducationByEmployee(SmartList<EmployeeEducation> resultList, String employeeId, Map<String,Object> options);

 
 
}


