package spring.aop.inter;

public class TestServiceImpl implements TestService {
	private String message;
	
	public TestServiceImpl() {
		message="�׽�Ʈ...";
	}
	
	@Override
	public void save(String value) {
		System.out.println("save �޼ҵ� ȣ��...");
		message=value;
		
	}

	@Override
	public void write() {
		System.out.println(message);
		
	}
	
}
