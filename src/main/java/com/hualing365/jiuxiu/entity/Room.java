/**
 * 
 */
package com.hualing365.jiuxiu.entity;

/**
 * 直播间实体类（对应表t_room）
 * @author im.harley.lee@qq.com
 * @since Mar 10, 2018 5:59:06 PM
 */
public class Room {

	/**
	 * 直播间房间号
	 */
	int roomId;
	
	/**
	 * 直播间名称
	 */
	String roomName;
	
	/**
	 * 在线总人数
	 */
	int totalCount;
	
	/**
	 * 真实在线人数
	 */
	int realCount;
	
	/**
	 * 管理员在线人数
	 */
	int adminCount;
	
	/**
	 * 机器人在线人数
	 */
	int robotCount;
	
	/**
	 * 空号在线人数
	 */
	int blankCount;
	
	/**
	 * 排序号
	 */
	int sort;
	
	/**
	 * 是否活动（如果是活动的，表示允许监听当前直播间）
	 */
	boolean active;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getRealCount() {
		return realCount;
	}

	public void setRealCount(int realCount) {
		this.realCount = realCount;
	}

	public int getAdminCount() {
		return adminCount;
	}

	public void setAdminCount(int adminCount) {
		this.adminCount = adminCount;
	}

	public int getRobotCount() {
		return robotCount;
	}

	public void setRobotCount(int robotCount) {
		this.robotCount = robotCount;
	}

	public int getBlankCount() {
		return blankCount;
	}

	public void setBlankCount(int blankCount) {
		this.blankCount = blankCount;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}


}
