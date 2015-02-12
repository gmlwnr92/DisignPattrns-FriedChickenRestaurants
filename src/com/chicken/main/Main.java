package com.chicken.main;

import java.util.Iterator;
import java.util.Scanner;

import com.chicken.factory.menu.ChickenMake;
import com.chicken.factory.menu.ChickenMakeFactory;
import com.chicken.iterator.information.ChickenInformation;
import com.chicken.templatemethod.chickenmenu.ChickenMenu;
import com.chicken.templatemethod.chickenmenu.FrideChickenMenu;
import com.chicken.templatemethod.chickenmenu.GarlicChickenMenu;
import com.chicken.templatemethod.chickenmenu.HotSeasonedChickenMenu;
import com.chicken.templatemethod.chickenmenu.SmokedChickenMenu;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("*********메뉴를 출력합니다.**********");
	ChickenInformation magicians = new ChickenInformation();
	  magicians.add("(1) 후라이드치킨");
	  magicians.add("(2) 핫 양념 치킨");
	  magicians.add("(3) 마늘 치킨");
	  magicians.add("(4) 훈제 치킨");
	  magicians.add("(5) 주문하기");
	
	  
	  Iterator<String> iterator = magicians.iterator();
	  while (iterator.hasNext()) {
	   String element = iterator.next();
	   System.out.println(element);
	  }
	  System.out.println("*************************************");
	  
	  
		while(true) {
			System.out.println("원하는 메뉴정보 번호를 입력하세요 : ");
			int select = sc.nextInt();

			if (select == 1) {
				ChickenMenu friMenu = new FrideChickenMenu();
				friMenu.doMenu();
			} else if (select == 2) {
				ChickenMenu hotMenu = new HotSeasonedChickenMenu();
				hotMenu.doMenu();
			} else if (select == 3) {
				ChickenMenu galicMenu = new GarlicChickenMenu();
				galicMenu.doMenu();
			} else if (select == 4) {
				ChickenMenu smokedMenu = new SmokedChickenMenu();
				smokedMenu.doMenu();
			} else if (select == 5) {
				System.out.println("*************************************");
				System.out.println("원하는 치킨을 골라주세요 : ");
				select = sc.nextInt();
				if (select == 1) {
					ChickenMake friMake = ChickenMakeFactory.create("후라이드치킨");
					friMake.makeChicken();
				} else if (select == 2) {
					ChickenMake hotMake = ChickenMakeFactory.create("핫양념치킨");
					hotMake.makeChicken();
				} else if (select == 3) {
					ChickenMake galicMake = ChickenMakeFactory.create("마늘치킨");
					galicMake.makeChicken();
				} else if (select == 4) {
					ChickenMake smokedMake = ChickenMakeFactory.create("훈제치킨");
					smokedMake.makeChicken();
				}else{
					System.out.println("잘못 입력하셨습니다.");
				}
				break;

			}
		}
}
}
