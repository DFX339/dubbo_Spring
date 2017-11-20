package service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartService {
	
	public static void main(String[] args) throws IOException{
		ClassPathXmlApplicationContext app = new 
				ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		app.start();
		
		System.out.println("服务者啊。。。");
		System.in.read();
	}
}
