package spring.aop.anno2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.anno2.core.TestService;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/anno2/applicationContext.xml");
		
		try {
			TestService service=(TestService)context.getBean("testService");
			service.setValue("½ºÇÁ¸µ AOP...");
			service.write();
		} finally {
			context.close();
		}
	}

}
