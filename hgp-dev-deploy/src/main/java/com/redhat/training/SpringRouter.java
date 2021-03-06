package com.redhat.training;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRouter {

	public static void main(String[] args) throws Exception {
		AbstractXmlApplicationContext springCtx = new ClassPathXmlApplicationContext("META-INF/camelContext.xml");
		springCtx.start();
		Thread.sleep(10000);
		springCtx.close();
		springCtx.stop();
		springCtx.destroy();
	}

}
