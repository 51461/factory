package com.tedu.factory;

import com.tedu.entry.SuperCar;
import com.tedu.inter.ICar;

//����������
public class SuperFactory extends AbstractFactory{
	@Override
	public ICar create() {
		return new SuperCar();
	}

}
