/**
 * 
 */
package com.example.common;

/**
 * @author Prolay Sarkar
 *
 */
public class Person implements IEntity {

	/* (non-Javadoc)
	 * @see com.example.common.IEntity#Create(com.example.common.IEntity)
	 */
	@Override
	public Object Create(IEntity obj) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.example.common.IEntity#Get(java.lang.Object)
	 */
	@Override
	public IEntity Get(Object primanyInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.example.common.IEntity#Delete(com.example.common.IEntity)
	 */
	@Override
	public boolean Delete(IEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.example.common.IEntity#Modify(com.example.common.IEntity)
	 */
	@Override
	public IEntity Modify(IEntity obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public int CalculateRewardPoints() {
		return 5;
	}
}
