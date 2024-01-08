package week1.day2;

public class LearnMethod {
	
	public void browserName() {
		
		System.out.println("chrome");
		
	}
	public int add(int a,int b) {
		return a+b;
	}
	
	public String regDetails(String name,int rollNo) {
		
		return name+" "+rollNo;
	
	}

	private void pinNo() {
		System.out.println("my pin is:xxxx");
	}
	void browserVersion() {
		System.out.println("browser name default modifier");
	}
	
	protected void name() {
		System.out.println("my pin is protected");
	}
	
	
	public static void main(String[] args) {
		
		LearnMethod ss=new LearnMethod();
		System.out.println(ss.add(29,04));
		ss.browserName();
		//System.out.println(ss.regDetails("sunil bandi", 2904));
		
		String regDetails = ss.regDetails("sunil bandi", 2904);
		
		System.out.println(regDetails);
		ss.pinNo();
		ss.browserVersion();
		ss.name();
		
	}
}
