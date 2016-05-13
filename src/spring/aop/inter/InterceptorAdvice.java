package spring.aop.inter;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// �޼ҵ� ���� ���� ��, �Ǵ� ���� �߻� ������ ���� �� �������
public class InterceptorAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invo) throws Throwable {
		// �޼ҵ� ȣ�� ��
		System.out.println(invo.getMethod().getName()+"�޼ҵ� ȣ�� ��...");
		
		// ��� �޼ҵ� ȣ��
		Object returnValue = invo.proceed();
		
		//��� �޼ҵ� ȣ�� ��
		System.out.println(invo.getMethod().getName()+"�޼ҵ� ȣ�� ��, ���ϰ�:"+returnValue);
		
		return returnValue;
	}
	
}
