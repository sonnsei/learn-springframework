package com.sonnsei;

import com.sonnsei.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		// 创建一个Spring容器
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.test();


//		UserService userService1 = new UserService();
//
//		for (Field field : userService1.getClass().getDeclaredFields()) {
//			if (field.isAnnotationPresent(Autowired.class)) {
//				field.set(userService1, ??);
//			}
//		}
//
//
//		for (Method method : userService1.getClass().getDeclaredMethods()) {
//			if (method.isAnnotationPresent(PostConstruct.class)) {
//				method.invoke(userService1, null);
//			}
//		}
//
//		if (userService1 instanceof InitializingBean) {
//			try {
//				((InitializingBean)userService1).afterPropertiesSet();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		ProxyFactory proxyFactory = new ProxyFactory();
//		proxyFactory.setTarget(userService1);
//		proxyFactory.addAdvice(new MethodInterceptor() {
//			@Nullable
//			@Override
//			public Object invoke(@NotNull MethodInvocation invocation) throws Throwable {
//				System.out.println("切面逻辑 before...");
//				Object result = invocation.proceed();
////				Object result = invocation.getMethod().invoke(invocation.getThis(), invocation.getArguments());
//				System.out.println("切面逻辑 after...");
//				return result;
//			}
//		});
//		UserService userService2  = (UserService) proxyFactory.getProxy();
//		userService2.test();

	}
}







