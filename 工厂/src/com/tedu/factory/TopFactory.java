package com.tedu.factory;

import com.tedu.entry.TopCar;
import com.tedu.inter.ICar;
//高级车工厂
public class TopFactory extends AbstractFactory{
	@Override
	public ICar create() {
		return new TopCar();
	}

}
