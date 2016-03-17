package com.kedong.action;

import com.kedong.annotation.UserAccessAnnotation;
import com.opensymphony.xwork2.ActionSupport;

public class TestAspectj extends ActionSupport{

	@UserAccessAnnotation("test:search")
	public String init(){
		return "ok";
	}
}
