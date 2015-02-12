package com.chicken.factory.menu;

/*�մ��� �ֹ��� �ϸ� �ֹ�(Factory)���� ġŲ�� ������ݴϴ�.*/
public class ChickenMakeFactory {

	public static ChickenMake create(String chicken) {


		if (chicken == null) {
			throw new IllegalArgumentException("null�� �� ������~");
		}
		if (chicken.equals("�Ķ��̵�ġŲ")) {
			return new FriedChickenMake(); // �Ķ��̵� ��ü: �޴�����.
		} else if (chicken.equals("�־��ġŲ")) {
			return new HotSeasonedChickenMake();
		} else if (chicken.equals("����ġŲ")) {
			return new GarlicChickenMake();
		} else if (chicken.equals("����ġŲ")) {
			return new SmokedChickenMake();
		} else {
			return null;
		}
	}
}
