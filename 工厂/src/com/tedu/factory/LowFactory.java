package com.tedu.factory;

import com.tedu.entry.LowCar;
import com.tedu.inter.ICar;
//�ͼ�������
public class LowFactory extends AbstractFactory {
	@Override
	public ICar create() {
		return new LowCar();
	}
}
