/**
 * 
 */
package com.hualing365.jiuxiu.entity;

/**
 * 用户实体类（对应表：t_user）
 * @author im.harley.lee@qq.com
 * @since Mar 10, 2018 5:51:04 PM
 */
public class User {

	/**
	 * 用户Id
	 */
	int uid;
	
	/**
	 * 用户靓号
	 */
	int accountId;
	
	/**
	 * 用户昵称
	 */
	String nickName;
	
	/**
	 * 用户头像URL
	 */
	String headImage;
	
	/**
	 * 用户家族名称
	 */
	String familyBadge;
	
	/**
	 * 时间
	 */
	String dateTime;
	
	/**
	 * 备注
	 */
	String remark;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadImage() {
		return headImage;
	}

	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public String getFamilyBadge() {
		return familyBadge;
	}

	public void setFamilyBadge(String familyBadge) {
		this.familyBadge = familyBadge;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
