package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Userpagehooks {
@Before(order=0)
	public void search() {
	System.out.println("user search Google page to letcode loginfunctionality");	
	}
@After(order=1)
	public void logout() {
	System.out.println("finally user completed All login data should be logout successfully");	
	}

@Before(order=1)
public void googlesearch() {
System.out.println("user type the computer Google page to letcode loginfunctionality");	
}
@After(order=0)
public void letxpathlogout() {
System.out.println("finally user clear c All login data should be logout successfully");	
}
}
