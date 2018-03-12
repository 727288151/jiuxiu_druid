/**
 * 
 */
package com.hualing365.jiuxiu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hualing365.jiuxiu.wx.SignUtil;

/**
 * 微信验证入口
 * @author im.harley.lee@qq.com
 * @since Mar 12, 2018 7:36:38 PM
 */
@RestController
public class WxController {

	@RequestMapping("/wxVerify")
	public String wxVerify(String signature, String timestamp, String nonce, String echostr){
		// 1、微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。   
        // 2、时间戳   
        // 3、随机数   
        // 4、随机字符串
		System.out.println("come in verify...");
		if(SignUtil.checkSignature(signature,timestamp, nonce)){
			System.out.println("come in verify...pass");
			return echostr;
		}else{
			System.out.println("come in verify...failed");
		}
		return null;  
	}
	
}
