package com.abinash.model;

public class IntraDay extends Transaction {
	public IntraDay(int eId, int cId, String sId, String tType, String tDate, int value) {
		this.eId = eId;
		this.cId = cId;
		this.sId = sId;
		this.tType = tType;
		this.tDate = tDate;
		this.value = value;
	}
}
