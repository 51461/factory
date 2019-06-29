package com.tedu.factory;

import com.tedu.entry.MidCar;
import com.tedu.inter.ICar;
//中级车工厂
public class MidFactory extends AbstractFactory {

	@Override
	public ICar create() {
		return new MidCar();
	}

}
