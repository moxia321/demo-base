package com.bx.base.util;

/**
 * 字符串工具类
 * 
 * @author xuemei
 */
public class BaseUtil {

	/**
	 * 是否为空
	 *
	 * @param arg
	 * @return
	 */
	public static boolean isEmpty(Object arg) {
		return arg == null;
	}
	
	/**
	 * 是否为空
	 * @param arg
	 * @return
	 */
	public static boolean isEmpty(Double arg) {
		return (arg == null || 0.0 == arg);
	}

	/**
	 * 是否为空
	 * @param arg
	 * @return
	 */
	public static boolean isEmpty(Integer arg){
		return (arg == null || 0 == arg);
	}

	/**
	 * 是否为空
	 *
	 * @param arg
	 * @return
	 */
	public static boolean isEmpty(String arg) {
		return (null == arg || "".equals(arg))? true: false;
	}
}
