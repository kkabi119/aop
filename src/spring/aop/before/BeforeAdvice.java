package spring.aop.before;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/*
 * Advice:공통사항을 구현한 클래스
 */

public class BeforeAdvice implements MethodBeforeAdvice {
	
	/**
	 * 	method : 호출되는 메소드
	 *  args : 호출되는 메소드 인자
	 *  target : 메소드를 호출한 대상
	 */
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		String s=method.toString()+"메소드:"+target+"에서 호출 전에 실행";
		
		if(args!=null)
			s+=",인자 개수 : "+args.length;
		System.out.println(s);
		
	}
	
}
