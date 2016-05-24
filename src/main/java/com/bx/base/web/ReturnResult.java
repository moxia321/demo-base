package com.bx.base.web;

public class ReturnResult {
	
	/**
	 * 返回结果
	 */
	private Boolean result;
	/**
	 * 返回编码
	 */
	private String state;
	/**
	 * 提示信息描述
	 */
	private String msg;
	/**
	 * 返回数据
	 */
	private Object data;
	
	public ReturnResult(){}
	
	public ReturnResult(Boolean result, String state, String msg, Object data){
		this.result = result;
		this.state = state;
		this.msg = msg;
		this.data = data;
	}
	
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
