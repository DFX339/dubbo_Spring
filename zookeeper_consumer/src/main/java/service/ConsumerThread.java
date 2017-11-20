package service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerThread implements Runnable{

	@Override
	public void run() {
		ClassPathXmlApplicationContext app = new 
				ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		app.start();
		ISomeService someService = (ISomeService)app.getBean("someService2");	
		String result = someService.something();
		System.out.println("消费者获得的结果："+result);
		
		 try {
	            Thread.sleep(1000*20);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println(Thread.currentThread().getName() );  

		}
	
	public static void main(String[] args){
		new Thread(new ConsumerThread()).start();
		new Thread(new ConsumerThread()).start();
		new Thread(new ConsumerThread()).start();
	}

}
