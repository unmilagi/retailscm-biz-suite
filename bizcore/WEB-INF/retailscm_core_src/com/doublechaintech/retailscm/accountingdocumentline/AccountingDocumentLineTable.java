
package com.doublechaintech.retailscm.accountingdocumentline;
import com.doublechaintech.retailscm.AccessKey;


public class AccountingDocumentLineTable{


	public static AccessKey withId(Object value){
		AccessKey accessKey = new AccessKey();
		accessKey.setColumnName(COLUMN_ID);
		accessKey.setValue(value);
		return accessKey;
	}
	//Add extra identifiers
	

	//only this package can use this, so the scope is default, not public, not private either nor protected
	public static final String TABLE_NAME="accounting_document_line_data";
	static final String COLUMN_ID = "id";
	static final String COLUMN_NAME = "name";
	static final String COLUMN_CODE = "code";
	static final String COLUMN_DIRECT = "direct";
	static final String COLUMN_AMOUNT = "amount";
	static final String COLUMN_BELONGS_TO = "belongs_to";
	static final String COLUMN_ACCOUNTING_SUBJECT = "accounting_subject";
	static final String COLUMN_VERSION = "version";
 
	public static final String []ALL_CLOUMNS = {COLUMN_ID, 
		COLUMN_NAME, COLUMN_CODE, COLUMN_DIRECT, COLUMN_AMOUNT, COLUMN_BELONGS_TO, COLUMN_ACCOUNTING_SUBJECT, 
		COLUMN_VERSION};
	public static final String []NORMAL_CLOUMNS = {
		COLUMN_NAME, COLUMN_CODE, COLUMN_DIRECT, COLUMN_AMOUNT, COLUMN_BELONGS_TO, COLUMN_ACCOUNTING_SUBJECT
		};
	
	
}


