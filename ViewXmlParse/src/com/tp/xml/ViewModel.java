package com.tp.xml;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class ViewModel {
	
	private String id;
	private String typeName ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "ViewModel [id=" + id + ", typeName=" + typeName + "]";
	}
	
	
	
	
}
