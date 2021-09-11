package spack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo1 {
	
	
	@AfterMethod
	public void close() {
		System.out.println("the shop was closed yesterday");
		System.out.println("this is my first modify");
	}
@BeforeMethod
public void start() {
	System.out.println("today 12pm match start");
	
}
@Test(priority=1)
	public void hii() {
	System.out.println("hii team how is work is going on");
}
	@Test(priority=2)
	public void hello() {
		System.out.println("i will joining in this company tomarrow");
	}
	@Test(priority=3)
	public void thank() {
		System.out.println("wel come to it");
	}
}

