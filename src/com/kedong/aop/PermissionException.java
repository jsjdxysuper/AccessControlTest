package com.kedong.aop;

public class PermissionException extends RuntimeException{

	String msg;
	public PermissionException(String msg){
		super(msg);
		this.msg = msg;
	}
}
