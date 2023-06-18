package com.sonnsei.service;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Author Sonnsei
 * @Date 2023/6/18 1:06 PM
 * Have a great day!
 **/
@Component
public class TestMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		System.out.println("MergedBeanDefinitionPostProcessor");
	}
}
