package spring.aop.pojo;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		String s = method.getName()+"�޼ҵ�,"+target+" ���� ȣ�� ��";
		s+=",���ڼ� : "+args.length+",���ϰ�: "+returnValue;
		System.out.println(s);
		
	}

}
