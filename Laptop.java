package com.training.sdet.day3.io;

import java.io.Serializable;
public class Laptop implements Serializable {

	private int modelNum;
	private String modelName;
	private String make;
	public Laptop(int modelNum, String modelName, String make) {
		this.make=make;
		this.modelName=modelName;
		this.modelNum=modelNum;
	}
	public int getModelNum() {
		return modelNum;
	}
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}

	public Object getObject(){
		return null ;
	}
}
