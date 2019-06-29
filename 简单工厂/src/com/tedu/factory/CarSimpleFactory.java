package com.tedu.factory;
//工厂对象

import com.tedu.entry.LowCar;
import com.tedu.entry.MidCar;
import com.tedu.entry.TopCar;
import com.tedu.inter.ICar;

public class CarSimpleFactory {
	public static final String TOP_TYPE="top";
	public static final String MID_TYPE="mid";
	public static final String LOW_TYPE="low";
	//构造方法私有化可以防止客户端无谓的创造工厂对象
	private CarSimpleFactory() {
	}
	public static ICar create(String mark) {
		ICar obj=null;
		switch (mark) {
		case TOP_TYPE:
			obj=(ICar) new TopCar();
			break;
		case MID_TYPE:
			obj=(ICar) new MidCar();
			break;
		default:
			obj=(ICar) new LowCar();
			break;
		}
		return obj;
	}
}
