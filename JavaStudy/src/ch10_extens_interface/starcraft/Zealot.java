package ch10_extens_interface.starcraft;

public class Zealot extends StarUnit{
	private int shield; // 질럿은 보호막이 있음.

	public Zealot() {
		super();
	}

	public Zealot(String name, int damage, int hp, int armor, int shield) {
		// 이럴 경우는 부모 생성자가 무조건 위에 와야함.
		super(name, damage, hp, armor);
		this.shield = shield;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	@Override
	public String toString() {
		return "Zealot [shield=" + shield + ", getName()=" + getName() + ", getDamage()=" + getDamage() + ", getHp()="
				+ getHp() + ", getArmor()=" + getArmor() + "]";
	}
	
}
