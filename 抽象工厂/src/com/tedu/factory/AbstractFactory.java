package com.tedu.factory;
import com.tedu.inter.IBus;
import com.tedu.inter.ICar;
//���󹤳�
public abstract class AbstractFactory {
	public abstract ICar createCar();
	public abstract IBus createBus();
}
