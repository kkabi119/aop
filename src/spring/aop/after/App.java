package spring.aop.after;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/after/applicationContext.xml");
		
		try {
			TestService service=(TestService)context.getBean("testService");
			service.save("ÀÚ¹Ù");
			service.write();
		} finally {
			context.close();
		}
	}

}
