package com.tedu.test;

import com.tedu.factory.AbstractFactory;
import com.tedu.factory.LowFactory;
import com.tedu.factory.LowsFactort;
import com.tedu.factory.MidFactory;
import com.tedu.factory.SuperFactory;
import com.tedu.factory.TopFactory;

public class CarTest {
	public static void main(String[] args) {
		AbstractFactory obj0=new TopFactory();
		obj0.create();
		AbstractFactory obj1=new MidFactory();
		obj1.create();
		AbstractFactory obj2=new LowFactory();
		obj2.create();
		AbstractFactory obj3=new SuperFactory();
		obj3.create();
		AbstractFactory obj4=new LowsFactort();
		obj4.create();
	}
}
