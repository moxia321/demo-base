package com.bx.base.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 字符串工具类
 * 
 * @author xuemei
 */
public class StringUtil {

	/**
	 * 字符串转数据
	 * @param srcString 字符串
	 * @param sign 分隔符
	 * @return
	 */
	public static String[] explode(String srcString, String sign){
		return srcString.split(sign);
	}
	
	/**
	 * 数组转字符串
	 * @param src 字符串数组
	 * @param sign 分隔符
	 * @return
	 */
	public static String implode(String[] srcStrings, String sign){
		String returnString = "";
		int i = 1;
		for (String src : srcStrings) {
			if(i == srcStrings.length){
				returnString += src;
			}else{
				returnString += src + ",";
			}
			i++;
		}
		return  returnString;
	}

	/**
	 * 数组转字符串
	 * @param src 字符串数组
	 * @param sign 分隔符
	 * @return
	 */
	public static String implode(List<String> srcStrings, String sign){
		String returnString = "";
		int i = 1;
		for (String src : srcStrings) {
			if(i == srcStrings.size()){
				returnString += src;
			}else{
				returnString += src + ",";
			}
			i++;
		}
		return  returnString;
	}
	
	/**
	 * Map转paramsString
	 * @param params
	 * @return name=value&name=value
	 */
	public static String mapToParamString(Map<String, String> params){
		String returnString = "";
		for (String key : params.keySet()) {
			returnString += key + "=" + params.get(key) + "&";
		}
		if(!BaseUtil.isEmpty(returnString)){
			returnString = returnString.substring(0, returnString.length()-1);
		}
		return returnString;
	}
	
	/**
	 * paramsString转Map
	 * @param srcString  name=value&name=value
	 * @param splitString &
	 * @return
	 */
	public static Map<String, String> StringToMap(String srcString, String splitString){
		Map<String, String> map  = new HashMap<String, String>();
		String[] srcs = srcString.split(splitString);
		for (String src : srcs) {
			String[] configs = src.split("=");
			if(!BaseUtil.isEmpty(configs) && configs.length > 1){
				map.put(configs[0], configs[1]);
			}
		}
		return map;
	}
	
	/**
	 * 把List<String>转换为一个用逗号分隔的字符串
	 */
	public static String listToString(List<String> list) {
	    StringBuilder sb = new StringBuilder();
	    if (list != null && list.size() > 0) {
	        for (int i = 0; i < list.size(); i++) {
	            if (i < list.size() - 1) {
	                sb.append(list.get(i) + ",");
	            } else {
	                sb.append(list.get(i));
	            }
	        }
	    }
	    return sb.toString();
	}
}
