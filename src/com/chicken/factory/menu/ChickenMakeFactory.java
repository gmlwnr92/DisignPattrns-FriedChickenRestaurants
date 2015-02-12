package com.chicken.factory.menu;

/*손님이 주문을 하면 주방(Factory)에서 치킨을 만들어줍니다.*/
public class ChickenMakeFactory {

	public static ChickenMake create(String chicken) {


		if (chicken == null) {
			throw new IllegalArgumentException("null은 안 되지롱~");
		}
		if (chicken.equals("후라이드치킨")) {
			return new FriedChickenMake(); // 후라이드 객체: 메뉴포함.
		} else if (chicken.equals("핫양념치킨")) {
			return new HotSeasonedChickenMake();
		} else if (chicken.equals("마늘치킨")) {
			return new GarlicChickenMake();
		} else if (chicken.equals("훈제치킨")) {
			return new SmokedChickenMake();
		} else {
			return null;
		}
	}
}
