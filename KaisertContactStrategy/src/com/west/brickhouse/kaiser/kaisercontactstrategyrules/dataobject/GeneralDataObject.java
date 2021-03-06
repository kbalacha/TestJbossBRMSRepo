package com.west.brickhouse.kaiser.kaisercontactstrategyrules.dataobject;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GeneralDataObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Map<String, String> dataMap = new HashMap<>();

	public Map<String, String> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, String> dataMap) {
		this.dataMap = dataMap;
	}

	public String getValue(String key){
		return this.dataMap.get(key);
	}
}
