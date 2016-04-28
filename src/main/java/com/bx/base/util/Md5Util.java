package com.bx.base.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * md5加密工具类
 * 
 * @author xuemei
 */
public class Md5Util {
	
	private static final Logger log = LogManager.getLogger(Md5Util.class);

	/**
	 * 16位加密
	 * @param srcText
	 * @return
	 */
	public static String get16Md5String(String srcText) {
		String md5String = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(srcText.getBytes());
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			md5String = buf.toString().substring(8, 24);
		} catch (NoSuchAlgorithmException e) {
			log.error(e.getMessage());
			return md5String;
		}
		return md5String;
	}
	
	/**
	 * 32位加密
	 * @param srcText
	 * @return
	 */
	public static String get32Md5String(String srcText) {
		String md5String = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(srcText.getBytes());
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			md5String = buf.toString();
		} catch (NoSuchAlgorithmException e) {
			log.error(e.getMessage());
			return md5String;
		}
		return md5String;
	}
}
