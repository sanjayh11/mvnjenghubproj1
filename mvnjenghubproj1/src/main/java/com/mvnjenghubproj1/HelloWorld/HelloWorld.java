package com.mvnjenghubproj1.HelloWorld;

public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String greetings() {
		
		CustomerClass cc = new CustomerClass();
		((CustomerClass) cc).setCust_fname("Ravi");
		cc.setCust_lname("Bajaj");
		cc.setCust_addr1("Avenue Road - Jodhpur");
		
		String retstr = cc.getCust_fname().concat(cc.getCust_lname()).concat(cc.getCust_addr1());
				
		return "Hello World!!" + retstr;
		
	}

}
