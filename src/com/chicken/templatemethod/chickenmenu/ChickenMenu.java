package com.chicken.templatemethod.chickenmenu;

public abstract class ChickenMenu {
	public abstract void doMenu();
	public final void info(){
		System.out.println("<<�޴�����>>");
		doMenu();
	}
	
}