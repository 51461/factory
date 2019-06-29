package com.tedu.test;

import com.tedu.factory.CarSimpleFactory;
import com.tedu.inter.ICar;

public class CarTest {
	public static void main(String[] args) {
		ICar obj0=CarSimpleFactory.create("top");
		ICar obj1=CarSimpleFactory.create("mid");
		ICar obj2 = CarSimpleFactory.create("low");
		System.err.println(obj0);
		System.err.println(obj1);
		System.err.println(obj2);
	}
}
