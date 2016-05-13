package spring.aop.anno1.core;

public class TestServiceImpl implements TestService {
	private String value;
	
	public TestServiceImpl(){
		value="Å×½ºÆ®...";
	}
	
	@Override
	public void setValue(String value) {
		System.out.println("set...");
		this.value=value;
		
	}

	@Override
	public String getValue() {
		System.out.println("get...");
		return value;
	}

	@Override
	public void write() {
		//System.out.println(Integer.parseInt(value));
		System.out.println("value:"+value);
		
	}
	

}
