package me.prj.bean;

/**
 * 抽象类：不能实例化出来一个具体的实例,可以有自己的成员变量，可以有抽象成员方法和非抽象成员方法，继承使用,只能继承一个抽象类
 * 接口：可以理解为特殊的抽象类，不能有成员变量，不能存在非抽象成员方法，实现使用，可以实现多个
 * 
 * 集成抽象类必须重写抽象方法，可以选择实现非抽象方法
 * 实现接口，必须实现所有方法
 * @author Longlin
 *
 */
public abstract class Car {
	public String str;			//成员变量
	public void say(){			//非抽象成员方法
		
	};
	
	public abstract void sayKaiChe();
}
