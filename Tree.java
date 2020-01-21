
public class Tree extends Nature { //наследование
	Tree(String vid,int visota,int ages){				//сделать конструктор каждого класса.
		age = ages;
		height = visota;
		System.out.println("Конструктор дерева");
		System.out.println("Я " + vid + " ,высотой " + visota + " метров ,мне " + ages + " лет.");
	}

	@Override
	void germinate() {				//определить метод и переопределить оерайдинг и оверлоадинг
			System.out.println("Я дерево и я проростаю");
	}
	@Override
	void grow() {					//определить метод и переопределить оерайдинг и оверлоадинг
		System.out.println("Я дерево расту по своему");
	}
}
