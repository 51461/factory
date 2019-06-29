package com.tedu.factory;

import com.tedu.entry.LowCar;
import com.tedu.inter.ICar;
//低级车工厂
public class LowFactory extends AbstractFactory {
	@Override
	public ICar create() {
		return new LowCar();
	}
}
