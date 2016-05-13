package spring.aop.pojo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.pojo.core.TestService;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/pojo/applicationContext.xml");
		
		try {
			TestService service=(TestService)context.getBean("testService");
			service.setValue("½ºÇÁ¸µ AOP...");
			service.write();
		} finally {
			context.close();
		}
	}

}
