package com.tedu.factory;

import com.tedu.entry.LowsCar;
import com.tedu.inter.ICar;

//��low������
public class LowsFactort extends AbstractFactory{
	@Override
	public ICar create() {
		return new LowsCar();
	}
	
}
