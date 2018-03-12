/**
 * 
 */
package com.hualing365.jiuxiu.wx;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 加密
 * @author im.harley.lee@qq.com
 * @since Mar 12, 2018 8:17:28 PM
 */
public class Encrypt {

	public static String encrypt(String str, String encName){  
        String reStr = null;  
        try {  
            MessageDigest md5 = MessageDigest.getInstance(encName);  
            byte[] bytes = md5.digest(str.getBytes());  
            StringBuffer stringBuffer = new StringBuffer();  
            for (byte b : bytes){  
                int bt = b&0xff;  
                if (bt < 16){  
                    stringBuffer.append(0);  
                }   
                stringBuffer.append(Integer.toHexString(bt));  
            }  
            reStr = stringBuffer.toString();  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
        }  
        return reStr;  
    }
}
