package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class AllAnnotation {
//	written in random order perform program to get proper order
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@Test
	public void Test() {
		System.out.println("Test run");
	}
	@Test
	public void Test1() {
		System.out.println("Test1 run");
	}
	@AfterMethod	
	public void AfterMethod() {
		System.out.println("After Method");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	@AfterSuite
	public void Suite() {
		System.out.println("After Suite");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	
	
}
