package com.tedu.factory;

import com.tedu.entry.SuperCar;
import com.tedu.inter.IBus;
import com.tedu.inter.ICar;

//超级车工厂
public class SuperFactory extends AbstractFactory{
	@Override
	public ICar createCar() {
		return new SuperCar();
	}

	@Override
	public IBus createBus() {
		return null;
	}

}
