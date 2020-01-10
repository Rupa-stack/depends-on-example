package com.cts.spring.dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		FirstBean bean = context.getBean(FirstBean.class);
		bean.populateBeans();
	}
}
