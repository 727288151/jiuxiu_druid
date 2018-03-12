package com.hualing365.jiuxiu.wx;

import java.util.Arrays;

/**
 * 微信校验签名
 * @author im.harley.lee@qq.com
 * @since Mar 12, 2018 8:19:18 PM
 */
public class SignUtil {

	/** 
     * @param signature 
     * @param timestamp 
     * @param nonce 
     * @return 
     * @Author：harley   
     * @Description: 微信权限验证 
     */  
    public static boolean checkSignature(String signature, String timestamp, String nonce) {  
        String[] arr = new String[] { Config.TOKEN, timestamp, nonce };  
        //按字典排序  
        Arrays.sort(arr);  
        StringBuilder content = new StringBuilder();    
        for (int i = 0; i < arr.length; i++) {    
            content.append(arr[i]);    
        }  
        //加密并返回验证结果  
        return signature == null ? false : signature.equals(Encrypt.encrypt(content.toString(), "SHA-1"));  
    } 
}
