package com.tedu.factory;

import com.tedu.entry.MidCar;
import com.tedu.inter.ICar;
//�м�������
public class MidFactory extends AbstractFactory {

	@Override
	public ICar create() {
		return new MidCar();
	}

}
