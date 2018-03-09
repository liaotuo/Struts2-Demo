package com.lt.action;

public class HelloAction {
	private String msg;

	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	/***
	 * 默认的action执行方法为excute
	 * @return 
	 */
	public String execute() {
		System.out.println("执行excute方法");
		this.setMsg("hello struts2...");
		return "success";
	}
	
	/***
	 * 动态方法调用demo
	 * @return
	 */
	public String dynamic() {
		this.setMsg("hello struts2-dynamicMethod...");
		return "success";
	}
}
