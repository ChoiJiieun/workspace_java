package ch10_extens_interface.family;

public class FamilyMain {

	public static void main(String[] args) {
		// 슈퍼클래스(부모)
		// 서브클래스(자식) 서브클래스는 슈퍼클래스의 모든 필드와 메소드를 상속받음.
		Parent papa = new Parent("아부지", 65);
		System.out.println(papa.toString());
		papa.sayHello();
		
		Child baby = new Child("아가라구용", 10);
		/*baby.setAge(10);		// child에 필드는 정의 하지 않았음. [상속 받아서 사용 가능]
		baby.setName("아가라구용");
		baby.sayHello();*/
		System.out.println(baby.toString());
	}

}
