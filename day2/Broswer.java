package week1.day2;

public class Broswer {
	
	public String launchBrowser(String name) {
		
		return name;
		
		//System.out.println("broswer launched successfully");
	}
	 protected String loadUrl(String url) {
		 
		 return url;
		 
		// System.out.println("URL is protected");
	 }
public static void main(String[] args) {
	
	
	Broswer sun=new Broswer();
	
	System.out.println(sun.launchBrowser("my browser is launched"));
	System.out.println(sun.loadUrl("Protected url is loaded"));
	
}
}
