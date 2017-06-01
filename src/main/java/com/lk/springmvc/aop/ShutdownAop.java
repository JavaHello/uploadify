package com.lk.springmvc.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/24.
 */
@Aspect
@Component
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class ShutdownAop {

    @Pointcut("execution(* com.lk.springmvc.service.SystemService.shoutdownApp())")
    public void shutdownPointcut(){
    }

    @Before("shutdownPointcut()")
    public void sync(){
        System.out.println("同步资源");
    }
}
