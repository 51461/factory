package com.tedu.factory;

import com.tedu.entry.TopBus;
import com.tedu.entry.TopCar;
import com.tedu.inter.IBus;
import com.tedu.inter.ICar;
//�߼�������
public class TopFactory extends AbstractFactory{
	@Override
	public ICar createCar() {
		return new TopCar();
	}
	@Override
	public IBus createBus() {
		return new TopBus();
	}

}
