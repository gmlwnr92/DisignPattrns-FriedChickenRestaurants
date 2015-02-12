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
	
	System.out.println("*********�޴��� ����մϴ�.**********");
	ChickenInformation magicians = new ChickenInformation();
	  magicians.add("(1) �Ķ��̵�ġŲ");
	  magicians.add("(2) �� ��� ġŲ");
	  magicians.add("(3) ���� ġŲ");
	  magicians.add("(4) ���� ġŲ");
	  magicians.add("(5) �ֹ��ϱ�");
	
	  
	  Iterator<String> iterator = magicians.iterator();
	  while (iterator.hasNext()) {
	   String element = iterator.next();
	   System.out.println(element);
	  }
	  System.out.println("*************************************");
	  
	  
		while(true) {
			System.out.println("���ϴ� �޴����� ��ȣ�� �Է��ϼ��� : ");
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
				System.out.println("���ϴ� ġŲ�� ����ּ��� : ");
				select = sc.nextInt();
				if (select == 1) {
					ChickenMake friMake = ChickenMakeFactory.create("�Ķ��̵�ġŲ");
					friMake.makeChicken();
				} else if (select == 2) {
					ChickenMake hotMake = ChickenMakeFactory.create("�־��ġŲ");
					hotMake.makeChicken();
				} else if (select == 3) {
					ChickenMake galicMake = ChickenMakeFactory.create("����ġŲ");
					galicMake.makeChicken();
				} else if (select == 4) {
					ChickenMake smokedMake = ChickenMakeFactory.create("����ġŲ");
					smokedMake.makeChicken();
				}else{
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				break;

			}
		}
}
}
