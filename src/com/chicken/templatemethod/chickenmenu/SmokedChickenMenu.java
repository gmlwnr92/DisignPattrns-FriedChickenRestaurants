package com.chicken.templatemethod.chickenmenu;

public class SmokedChickenMenu extends ChickenMenu {
	@Override
	public void doMenu() {
		System.out.println("<<훈제치킨>>");
		System.out.println("*가격: 13000원");
		System.out
				.println("*설명: 독특한 훈제기법으로 한입 베어 물면 야들야들 속살의 촉촉한 육즙이 입안 한 가득!!");
		System.out.println("*매운정도: ☆☆☆☆☆");
	}
}
