
public class CarExample {

	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println("car1.company : "+ car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("택시");
		System.out.println("car2.company : "+ car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		System.out.println();
		
	
		Car car3 = new Car("영업용", "빨강");
		System.out.println("car3.company : "+ car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company : "+ car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
		
		

		
//--------------------------------------------------------------
//		// Car 클래스를 이용하여 Car 객체 생성
//		Car car1 = new Car();
//		System.out.println("car1.company: " + car1.company);
////		System.out.println("car1.model : " + car1.model);
//		System.out.println();
//		
//		Car car2 = new Car("자가용");
//		System.out.println("car2.company : "+ car2.company);
//		System.out.println("car2.model : " + car2.model);
//		System.out.println();
//	
//		Car car3 = new Car("자가용", "빨강");
//		System.out.println("car3.company : "+ car3.company);
//		System.out.println("car3.model : " + car3.model);
//		System.out.println("car3.color : " + car3.color);
//		System.out.println();
//		
//		
//		Car car4 = new Car("택시", "빨강", 200);
//		System.out.println("car4.company : "+ car4.company);
//		System.out.println("car4.model : " + car4.model);
//		System.out.println("car4.color : " + car4.color);
//		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
//		System.out.println();
//		
//		
		
		
		
//		-------------------------------------------------------------------
//		
//		System.out.println("제조회사 : " + myCar.company);
//		System.out.println("모델명 : " + myCar.model);
//		System.out.println("색깔 : " + myCar.color);
////		System.out.println("시동여부 : " + myCar.start);
//		System.out.println("최고속도 : " + myCar.maxSpeed);
//		System.out.println("현재속도 : " + myCar.speed);
//		
//		
//			// myCar 객체의 필드값 변경
//		myCar.speed = 60;
//		System.out.println("현재속도: " + myCar.speed);
		
		
		
	}

}
