package org.sonar.template.java.checks;

public class myException extends Exception{
	public myException(){
		super();
	}
	
	public myException(String message){
		System.out.println(message);
	}
}
