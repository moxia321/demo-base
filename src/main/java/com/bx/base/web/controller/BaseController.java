package com.bx.base.web.controller;

import com.bx.base.Constants;
import com.bx.base.web.ReturnResult;

/**
 * 控制层基础类
 */
public class BaseController {	
	
	/**
	 * 成功输出
	 * @param data
	 * @return
	 */
	public Object printSuccess(Object data){
		return new ReturnResult(true, Constants.RETURN_STATE_SUCCESS, Constants.SYSYTEM_OK, data);
	}
	
	/**
	 * 成功输出
	 * @return
	 */
	public Object printSuccess(){
		return new ReturnResult(true, Constants.RETURN_STATE_SUCCESS, Constants.SYSYTEM_OK, null);
	}
	
	/**
	 * 异常输出
	 * @param code
	 * @param msg
	 * @param data
	 * @return
	 */
	public Object printError(String state, String msg){
		return printError(state, msg, null);
	}
	
	/**
	 * 异常输出
	 * @param code
	 * @param msg
	 * @param data
	 * @return
	 */
	public Object printError(String state, String msg, Object data){
		return new ReturnResult(false, state, msg, data);
	}	
	/**
	 * 获取客户端IP
	 * @param request
	 * @return
	 */
	public String getRemoteHost(javax.servlet.http.HttpServletRequest request){
	    String ip = request.getHeader("x-forwarded-for");
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
	        ip = request.getHeader("Proxy-Client-IP");
	    }
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
	        ip = request.getHeader("WL-Proxy-Client-IP");
	    }
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
	        ip = request.getRemoteAddr();
	    }
	    return ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip;
	}
}
