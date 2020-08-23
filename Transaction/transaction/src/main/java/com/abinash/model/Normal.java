package com.abinash.model;

public class Normal extends Transaction {
	public Normal(int eId, int cId, String tType, String tDate, int value, boolean flag) {
		this.eId = eId;
		this.cId = cId;
		this.tType = tType;
		this.tDate = tDate;
		this.value = value;
		this.flag = flag;
	}
}
