package spring.aop.pojo;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		String s = method.getName()+"메소드,"+target+" 에서 호출 후";
		s+=",인자수 : "+args.length+",리턴값: "+returnValue;
		System.out.println(s);
		
	}

}
