package com.bx.base;

/**
 * 公共常量
 * @author xuemei
 */
public interface Constants {
	
	/** 返回前段状态标识*/
	/** 成功*/
	String RETURN_STATE_SUCCESS = "200"; //成功
	/** 服务器异常*/
	String RETURN_STATE_FAIL = "500"; //服务器异常
	/** 没有数据 400*/
	String RETURN_STATE_NODATA = "400";//没有数据
	/** 没有权限 403*/
	String RETURN_STATE_NOPOWER = "403";//没有权限
	
	/** 提示文字*/
	/** 参数校验不通过*/
	String PARAM_VALIDATE_FAIL = "参数校验不通过";
	/** 系统异常*/
	String SYSTEM_ERROR = "服务器异常";
	/** 成功*/
	String SYSYTEM_OK = "成功";
	/** 没有数据*/
	String SYSYTEM_NODATA = "没有数据";
	/** 没有权限*/
	String SYSYTEM_NOPOWER = "没有权限，别乱玩了哦～";
	
}
