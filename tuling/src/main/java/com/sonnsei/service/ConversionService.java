package com.sonnsei.service;

import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.stereotype.Component;

/**
 * @Author Sonnsei
 * @Date 2023/6/15 11:30 PM
 * Have a great day!
 **/
@Component
public class ConversionService implements LoadTimeWeaverAware {
	@Override
	public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {

	}
}
