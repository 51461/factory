package com.tedu.factory;

import com.tedu.entry.TopCar;
import com.tedu.inter.ICar;
//�߼�������
public class TopFactory extends AbstractFactory{
	@Override
	public ICar create() {
		return new TopCar();
	}

}
