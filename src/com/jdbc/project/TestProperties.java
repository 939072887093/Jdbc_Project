package com.jdbc.project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {   // class 

	public static void main(String[] args) throws IOException {
	FileInputStream f=new FileInputStream("person.properties");
	Properties p=new Properties();
    p.load(f);
    String name=p.getProperty("name");
    String gender=p.getProperty("gender");
    int age=Integer.parseInt(p.getProperty("age"));
    System.out.println("Name   :" +name);
    System.out.println("Gender :" +gender);
    System.out.println("Age    :" +age);
	}

}
