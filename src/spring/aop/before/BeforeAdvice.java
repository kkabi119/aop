package spring.aop.before;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/*
 * Advice:��������� ������ Ŭ����
 */

public class BeforeAdvice implements MethodBeforeAdvice {
	
	/**
	 * 	method : ȣ��Ǵ� �޼ҵ�
	 *  args : ȣ��Ǵ� �޼ҵ� ����
	 *  target : �޼ҵ带 ȣ���� ���
	 */
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		String s=method.toString()+"�޼ҵ�:"+target+"���� ȣ�� ���� ����";
		
		if(args!=null)
			s+=",���� ���� : "+args.length;
		System.out.println(s);
		
	}
	
}
