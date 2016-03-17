package com.kedong.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import com.kedong.beans.ISLOGIN;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface UserAccessAnnotation { 
	 /** 
	 * User has been login or not. 
	 * 
	 */ 
	String value();
}
