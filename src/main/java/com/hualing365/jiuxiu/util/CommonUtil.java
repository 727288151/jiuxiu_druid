package com.hualing365.jiuxiu.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 公共工具类
 * @author im.harley.lee@qq.com
 * @since 2018-3-10 
 */
public class CommonUtil {
	
	/**
	 * Unicode转 汉字字符串
	 * @param str \u6728
	 * @return '木' 26408
	 */
	public static String unicodeToString(String str) {

		Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
		Matcher matcher = pattern.matcher(str);
		char ch;
		while (matcher.find()) {
			// group 6728
			String group = matcher.group(2);
			// ch:'木' 26408
			ch = (char) Integer.parseInt(group, 16);
			// group1 \u6728
			String group1 = matcher.group(1);
			str = str.replace(group1, ch + "");
		}
		return str;
	}
    
    /**
	 * 毫秒转化时分秒毫秒 
	 */  
	public static String formatDuration(Long ms) {  
	    Integer ss = 1000;  
	    Integer mi = ss * 60;  
	    Integer hh = mi * 60;  
	    Integer dd = hh * 24;  
	  
	    Long day = ms / dd;  
	    Long hour = (ms - day * dd) / hh;  
	    Long minute = (ms - day * dd - hour * hh) / mi;  
	    Long second = (ms - day * dd - hour * hh - minute * mi) / ss;  
	    //Long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;  
	      
	    StringBuffer sb = new StringBuffer();  
	    if(day > 0) {  
	        sb.append(day+"天");  
	    }  
	    if(hour > 0) {  
	        sb.append(hour+"小时");  
	    }  
	    if(minute > 0) {  
	        sb.append(minute+"分");  
	    }  
	    if(second > 0) {  
	        sb.append(second+"秒");  
	    }
	    return sb.toString();  
	}
	
	/**
	 * 根据给定的pattern格式化日期
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String formatDate(Date date, String pattern){
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	/**
	 * 等级描述
	 */
	public static String getWealthLevelDesc(int wealthLevel){
		String weathLevelDesc = "";
		if(wealthLevel == 0){
			return "布衣";
		}
		if(wealthLevel <= 10){
			weathLevelDesc = "富";
		}else{
			switch(wealthLevel){
			case 11:
				weathLevelDesc = "男爵";
				break;
			case 12:
				weathLevelDesc = "子爵";
				break;
			case 13:
				weathLevelDesc = "伯爵";
				break;
			case 14:
				weathLevelDesc = "侯爵";
				break;
			case 15:
				weathLevelDesc = "公爵";
				break;
			case 16:
				weathLevelDesc = "郡公";
				break;
			case 17:
				weathLevelDesc = "国公";
				break;
			case 18:
				weathLevelDesc = "王爵";
				break;
			case 19:
				weathLevelDesc = "藩王";
				break;
			case 20:
				weathLevelDesc = "郡王";
				break;
			case 21:
				weathLevelDesc = "亲王";
				break;
			case 22:
				weathLevelDesc = "诸侯";
				break;
			case 23:
				weathLevelDesc = "国王";
				break;
			case 24:
				weathLevelDesc = "皇帝";
				break;
			case 25:
				weathLevelDesc = "大帝";
				break;
			case 26:
				weathLevelDesc = "天王";
				break;
			case 27:
				weathLevelDesc = "神";
				break;
			case 28:
				weathLevelDesc = "天尊";
				break;
			case 29:
				weathLevelDesc = "神皇";
				break;
			}
		}
		return wealthLevel+weathLevelDesc;
	}
}
