
public abstract class Unit {
	static int unitCount;
	int speed;
	int attack;
	int armor;
	int hp;
	int lvl;
	int mana;
	String name;
	Unit(int lvl, int speed, int attack, int armor, int hp, String name){
		this.speed = speed;
		this.attack = attack;
		this.armor = armor;
		this.hp = hp;
		this.name = name;
		unitCount++;
	}
	 void move() {
		//��� �����
	 }
	
	void attack() {
		//��� �����
	}
	
	abstract void test();    //����������� ������
	
	abstract void animation();
}

class Hero extends Unit {  //������������
	int strenght;
	int inteligence;
	int agility;
	static int heroCount;
	
	Hero(int strenght,int inteligence,int agility, int mana, int lvl, int speed, int attack, int armor, int hp, String name) {
		super(lvl, speed, attack, armor, hp, name);
		this.mana = mana;
		this.inteligence = inteligence;
		this.strenght = strenght;
		this.agility = agility;
		heroCount++;
	}
	void setSkills() {    //���������� ����� ������
		//������ �����
	}
	
	void setTalants() {
		//��� ��������
	}
	@Override
	void animation() {   //�������������� �����
		//��� ��������
		
	}
	@Override
	void test() {
		System.out.println("�, ����� " + name + ", � ���� " + speed + " ��������, " + armor + " �����, " + attack + " �����, " + hp + " ��������, "); 		
		System.out.println(lvl + " �������, " + mana + " ����, " + strenght + " ����, " + agility + " ��������, " + inteligence + " ���������.");
	}
	
}

abstract class Creeps extends Unit {
	private boolean haveSkills;    // ��������� ����������
	Creeps(int mana, int lvl, int speed, int attack, int armor, int hp, String name,boolean haveSkills) {
		super(lvl, speed, attack, armor, hp, name);
		this.mana = mana;
		haveSkills = true;
	}
	
	Creeps(int lvl, int speed, int attack, int armor, int hp, String name) {
		super(lvl, speed, attack, armor, hp, name);
		
	}

	public boolean isHaveSkills() {   //  ������ ������ ���������
		return haveSkills;
	}

	public void setHaveSkills(boolean haveSkills) {
		this.haveSkills = haveSkills;
	}
	
	void getSkills(){
		//��� ������ ����� ���� ���� ���� � �������� = ���. ���������� ������  ���������
		}
}

class neutralCreeps extends Creeps {
	neutralCreeps(int lvl, int speed, int attack, int armor, int hp, String name) {
		super(lvl, speed, attack, armor, hp, name);
	}

	neutralCreeps(int mana, int lvl, int speed, int attack, int armor, int hp, String name,boolean haveSkills) {
		super(mana, lvl, speed, attack, armor, hp, name, haveSkills);
		this.mana = mana;
		haveSkills = true;
		this.setHaveSkills(haveSkills);
	}

	@Override
	void animation() { //��������������
		//��� ��������
		
	}

	@Override
	void test() {
		System.out.println("�, ����������� ������� " + name + ", � ���� " + speed + " ��������, " + armor + " �����, " + attack + " �����, " + hp + " ��������, ");
		if(isHaveSkills() == false) {
			System.out.println(lvl + " �������.");
		}
		else {
			System.out.println(lvl + " �������, " + mana + " ����.");
		}
	}	
}
