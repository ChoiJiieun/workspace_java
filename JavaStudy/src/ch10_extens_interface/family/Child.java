package ch10_extens_interface.family;

// child는 parent를 상속받음 (extends)
public class Child extends Parent{

	public Child(String name, int age) {
		super(name, age);
	}

	public Child() {
		super();
	}

	@Override  // 부모의  
	public void sayHello() {
		System.out.println("자식 입니다.");
	}

	@Override
	public String toString() {
		return "Child [toString()=" + super.toString() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
