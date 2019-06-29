package com.tedu.factory;

import com.tedu.entry.LowBus;
import com.tedu.entry.LowCar;
import com.tedu.inter.IBus;
import com.tedu.inter.ICar;
//�ͼ�������
public class LowFactory extends AbstractFactory {
	@Override
	public ICar createCar() {
		return new LowCar();
	}
	@Override
	public IBus createBus() {
		return new LowBus();
	}
}
