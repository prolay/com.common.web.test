package com.example.common;

public interface IEntity {

	Object Create(IEntity obj);
	
	IEntity Get(Object primanyInfo);
	
	boolean Delete(IEntity obj);
	
	IEntity Modify(IEntity obj);
}
