
public abstract class Nature {
	
	Nature(){ 							//сделать конструктор каждого класса.
		System.out.println("Конструктор природы");
	}
	String vidd;
	public int height;
	public int age;
	static boolean green = true;		//обьявить переменные с разными модификаторами доступа.
	private boolean fire = false;
	static int test = 42;
	
	abstract void germinate();		//определить метод и переопределить оерайдинг и оверлоадинг
	
	int giveSeeds() {
		int seedsNumber = 10;
		return seedsNumber;
	}
	
	void grow() {
		System.out.println("Расту");
	}
	
	void grow(int grow) {
		System.out.println("Расту быстрее"); //оверлоадинг
	}
	
	void grow(int grow, int grow2) {
		System.out.println("Расту еще быстрее");
	}
	
	static boolean greeny() {			//статический метод
		return green;
	}
	
	private boolean fireChek() {
		return fire;
	}
	
	boolean fireAlarm() {
		boolean fireAlarm = fireChek();
		if(fireAlarm == false) {
			System.out.println("Нормас,не горим");
		}
		else {
			System.out.println("Потушите,помогите!");
		}
		return fireAlarm;
	}
	
	void test() {					
		System.out.println(test);
	}

}
