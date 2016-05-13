package spring.aop.inter;

public class TestServiceImpl implements TestService {
	private String message;
	
	public TestServiceImpl() {
		message="테스트...";
	}
	
	@Override
	public void save(String value) {
		System.out.println("save 메소드 호출...");
		message=value;
		
	}

	@Override
	public void write() {
		System.out.println(message);
		
	}
	
}
