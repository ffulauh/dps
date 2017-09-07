package com.prs.dps.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class ApplicationUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //根应用上下文
        this.applicationContext=applicationContext;
    }

    public static Object getBean(String name) {
        return applicationContext.getBean(name);

    }

    public static ApplicationContext getParent(){
        return applicationContext.getParent();
    }

    public static String getContextName(){
        return applicationContext.getDisplayName();
    }
}

