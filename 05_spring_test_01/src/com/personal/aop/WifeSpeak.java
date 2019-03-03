package com.personal.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;

public class WifeSpeak {

    public WifeSpeak() {
    }

    public void speakBefore() {
        System.out.println("说话之前 ...");
    }

    public void speakAfter() {
        System.out.println("说话之后 ...");
    }

    public void arround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕说话之前 ...");
        proceedingJoinPoint.proceed();
        System.out.println("环绕说话之后 ...");
    }

}
