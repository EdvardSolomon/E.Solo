
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
		//код атаки
	 }
	
	void attack() {
		//код атаки
	}
	
	abstract void test();    //Абстрактные методы
	
	abstract void animation();
}

class Hero extends Unit {  //наследование
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
	void setSkills() {    //определяем новые методы
		//делаем скилы
	}
	
	void setTalants() {
		//код талантов
	}
	@Override
	void animation() {   //переопределяем метод
		//код анимации
		
	}
	@Override
	void test() {
		System.out.println("Я, герой " + name + ", у меня " + speed + " скорости, " + armor + " брони, " + attack + " атаки, " + hp + " здоровья, "); 		
		System.out.println(lvl + " уровень, " + mana + " маны, " + strenght + " силы, " + agility + " ловкости, " + inteligence + " интелекта.");
	}
	
}

abstract class Creeps extends Unit {
	private boolean haveSkills;    // приватная переменная
	Creeps(int mana, int lvl, int speed, int attack, int armor, int hp, String name,boolean haveSkills) {
		super(lvl, speed, attack, armor, hp, name);
		this.mana = mana;
		haveSkills = true;
	}
	
	Creeps(int lvl, int speed, int attack, int armor, int hp, String name) {
		super(lvl, speed, attack, armor, hp, name);
		
	}

	public boolean isHaveSkills() {   //  гетеры сетеры хевскилса
		return haveSkills;
	}

	public void setHaveSkills(boolean haveSkills) {
		this.haveSkills = haveSkills;
	}
	
	void getSkills(){
		//код дающий скилы если есть мана и хевскилс = тру. используем гетеры  хевскилса
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
	void animation() { //переопределили
		//код анимации
		
	}

	@Override
	void test() {
		System.out.println("Я, нейтральный крипчик " + name + ", у меня " + speed + " скорости, " + armor + " брони, " + attack + " атаки, " + hp + " здоровья, ");
		if(isHaveSkills() == false) {
			System.out.println(lvl + " уровень.");
		}
		else {
			System.out.println(lvl + " уровень, " + mana + " маны.");
		}
	}	
}
