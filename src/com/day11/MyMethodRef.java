package com.day11;

//Default Method in Java 1.8
//Static Method in Java 1.8

interface TestInterface {
//only abstract method were allowed	
	abstract public void test();
//Non abstract in interface
	// Static --with static keyword u will be able to take static method(non abstract method)
	//use the class interface name to call the method
	// Default--any number of default method inside interface
	// these are non abstract method

	default public void show() {
		System.out.println("Hello Default method show");
	}

	default public void print() {
		System.out.println("Hello Default method print");
	}
	
	static public void showPrint()
	{
		
	}

}

class TestClass implements TestInterface {

	// Abstract Method
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method");
	}

}

public class MyMethodRef {

	public static void main(String args[]) {
		TestClass testClass = new TestClass();
		testClass.test();
		testClass.print();
		testClass.show();

		TestInterface interface1 = new TestInterface() {

			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("class");
			}
		};
		
		interface1.show();
		interface1.print();
		interface1.test();
		//interface1.
		//call the interface static method with help of interfacer name
		TestInterface.showPrint();
	}

}