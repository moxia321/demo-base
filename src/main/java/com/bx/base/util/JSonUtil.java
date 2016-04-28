package com.bx.base.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

/**
 * Json工具
 * 
 * @author xuemei
 */
public class JSonUtil {

	/**
	 * 对象转JSON字符串
	 * @param obj 转换的对象
	 * @return 转换后的字符串
	 */
	public static String object2String(Object obj) {
		return JSON.toJSONString(obj);
	}

	/**
	 * JSON字符串转对象
	 * @param str 转换的字符串
	 * @param clazz 转换后的对象类型
	 * @return 转换后的对象
	 */
	public static <T> T string2Object(String str, Class<T> clazz) {
		return (T) JSON.parseObject(str, clazz);
	}

	/**
	 * 字符串转对象
	 * @param str
	 * @param type
	 * @return
	 */
	public static <T> T string2Object(String str, TypeReference<T> type) {
		return JSON.parseObject(str, type);
	}
	
	/**
	 * JSON串 转 Map<String, String>
	 * @param jsonData
	 * @return
	 */
	public  static List<Map<String, String>> stringToListMap(String jsonData) {
		if(BaseUtil.isEmpty(jsonData)){
			return null;
		}
		JSONObject jsonObject = JSonUtil.string2JSON(jsonData);
		if(BaseUtil.isEmpty(jsonObject.getString("data"))){
			return null;
		}
		return JSonUtil.string2Object(jsonObject.getString("data"), new TypeReference<List<Map<String, String>>>() {});
	}

	/**
	 * JSON字符串转JSON对象
	 * @param str 转换的字符串
	 * @return 转换后的JSON对象
	 */
	public static JSONObject string2JSON(String str) {
		return JSON.parseObject(str);
	}
	
	/**
	 * 合并转JSON串
	 * @param state
	 * @param msg
	 * @return
	 */
	public static String returnJson(String state, String msg){
		return returnJson(state, msg, null);
	}
	
	/**
	 * 合并转JSON串
	 * @param state
	 * @param msg
	 * @param data
	 * @return
	 */
	public static String returnJson(String state, String msg, Object data){
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("state", state);
		result.put("msg", msg);
		result.put("data", data);
		return object2String(result);
	}
}
