package com.bx.base.web.form;

import com.bx.base.web.form.validator.NotValue;

/**
 * demo表单
 */
public class DemoForm {
	
	private Integer id;
	
	/** 类型 */
	@NotValue(message = "请输入类型")
	private String type;
	
	private String value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
