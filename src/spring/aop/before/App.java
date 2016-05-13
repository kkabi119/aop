package spring.aop.before;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/before/applicationContext.xml");
		
		try {
			TestService service=(TestService)context.getBean("testService");
			service.save("¼­¿ï");
			service.write();
		} finally {
			context.close();
		}

	}

}
