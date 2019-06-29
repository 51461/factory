package com.tedu.factory;

import com.tedu.entry.LowsCar;
import com.tedu.inter.IBus;
import com.tedu.inter.ICar;

//��low������
public class LowsFactort extends AbstractFactory{
	@Override
	public ICar createCar() {
		return new LowsCar();
	}

	@Override
	public IBus createBus() {
		return null;
	}
}
