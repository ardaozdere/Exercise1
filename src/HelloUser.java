
public class HelloUser {
	private String userName;
	
	public HelloUser(String pUserName) {
		this.userName = pUserName;
	}
	
	public void greetUser() {
		System.out.print("Hello " + this.userName);
	}
}
