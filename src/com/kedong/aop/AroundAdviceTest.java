package com.kedong.aop;

import java.lang.reflect.Method;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import com.kedong.annotation.UserAccessAnnotation;

@Aspect
public class AroundAdviceTest {

	@Around("@annotation(com.kedong.annotation.UserAccessAnnotation)")
	public Object processTxt(ProceedingJoinPoint jp) throws Throwable{
		Signature signature = jp.getSignature();
		Class<?> targetClazz = jp.getTarget().getClass();
		String permission = getMethodPermission(targetClazz, signature.getName());
		System.out.println(permission+"¿πΩÿ¡À");
		//jp.
		if(permission.compareTo("task:search")==0){
			throw new PermissionException("don't have permission!");
		}
		Object rvt = jp.proceed();
		return rvt;
	}
	private String getMethodPermission(Class<?> clazz, String methodName) {
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			if (methodName.equals(method.getName())) {
				if (method.isAnnotationPresent(UserAccessAnnotation.class)) {
					UserAccessAnnotation permission = method.getAnnotation(UserAccessAnnotation.class);
					String value = permission.value();
					return value;
				}
			}
		}
		return null;
	}
}
