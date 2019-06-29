package com.tedu.factory;

import com.tedu.entry.MidBus;
import com.tedu.entry.MidCar;
import com.tedu.inter.IBus;
import com.tedu.inter.ICar;
//�м�������
public class MidFactory extends AbstractFactory {

	@Override
	public ICar createCar() {
		return new MidCar();
	}
	@Override
	public IBus createBus() {
		return new MidBus();
	}

}
