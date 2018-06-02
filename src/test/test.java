package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Admin;
import service.AdminService;


public class test {

	public static void main(String[] args) {
		student();
	}
	public static void student(){
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext-jdbc.xml");
		AdminService service=(AdminService) con.getBean("AdminService");
		List<Admin> user= service.getAdmin();
		System.out.println(user.size());
	}
	
}
