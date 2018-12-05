package com.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import sun.rmi.log.LogHandler;

public class Cardhandler implements InvocationHandler{
	
	private Object target;
	
	public Cardhandler (Object object) {
		this.target = object;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//增强处理
		Object o = method.invoke(target, args);
		return o;
	}
	
	public static void main(String[] args) {
		 Moveable move =  (Moveable) Proxy.newProxyInstance(Card.class.getClassLoader(), Card.class.getInterfaces(), (InvocationHandler) new Cardhandler(new Card()));
		 System.out.println("代理对象:"+move.getClass().getName());
		    System.out.println("执行方法:"+move.move());
	}
	
}
