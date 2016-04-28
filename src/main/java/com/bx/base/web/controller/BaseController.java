package com.bx.base.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bx.base.util.JSonUtil;

/**
 * 控制层基础类
 */
public class BaseController {	
	
	/** 日志 */
	private static final Logger log = LogManager.getLogger(BaseController.class);
	
	/**
	 * AJAX请求输出
	 */
	public void outPrint(String state, String msg, Object data, HttpServletResponse response){
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/xml;charset= UTF-8 ");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			String returnString = JSonUtil.returnJson(state, msg, data);
			out.print(returnString);
			out.close();
		} catch (IOException e) {
			log.error(e.getMessage());
		}
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
