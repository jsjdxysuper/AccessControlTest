package com.kedong.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.kedong.annotation.UserAccessAnnotation;
import com.kedong.aop.PermissionException;
import com.kedong.beans.Axe;
import com.kedong.beans.ISLOGIN;
import com.kedong.beans.Person;
import com.opensymphony.xwork2.ActionSupport;



public class LoginAction extends ActionSupport implements RequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3087371393389821666L;
	protected Map<String, Object> request;
	private Person person;

	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

	@UserAccessAnnotation("task:search")
	public String login(){
		 try{ 
			 System.out.println("来了");
//				Boolean result = orderService.order(Quote quote); 
//				if(result) return SUCCESS; 
			 }catch(Exception e) { 
//				logger.debug(e); 
				this.addActionError(getText("user_no_permission_error")); 
			 } 
		request.put("name", "dingxuyang");
		return "ok";
	}
	@UserAccessAnnotation("task:delete")
	public String delete(){
			 System.out.println("来了");
			 throw new PermissionException("action 中抛出的异常");
//				Boolean result = orderService.order(Quote quote); 
//				if(result) return SUCCESS; 

		//request.put("name", "dingxuyang");
		//return "ok";
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
	
	
}
