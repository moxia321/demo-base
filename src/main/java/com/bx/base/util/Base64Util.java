package com.bx.base.util;

import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

/**
 * BASE64加解密工具类
 * 
 * @author xuemei
 *
 */
@SuppressWarnings("restriction")
public class Base64Util {
	 
	 
	/**    
     * BASE64解密   
     * @param key          
     * @return          
     * @throws Exception          
     */              
    public static byte[] decryptBASE64(String key) throws Exception {               
        return (new BASE64Decoder()).decodeBuffer(key);               
    }               
                  
    /**         
     * BASE64加密   
     * @param key          
     * @return          
     * @throws Exception          
     */              
    public static String encryptBASE64(byte[] key) throws Exception {               
        return (new BASE64Encoder()).encodeBuffer(key);               
    }  
}
