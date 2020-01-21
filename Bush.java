
public class Bush extends Nature{ //наследование
	Bush(){											//сделать конструктор каждого класса.
		System.out.println("Конструктор куста");
	}

	@Override
	void germinate() {		//определить метод и переопределить оерайдинг и оверлоадинг
		System.out.println("Я кустик и я проростаю");
		
	}
	
	@Override
	void grow() {		//определить метод и переопределить оерайдинг и оверлоадинг
		System.out.println("Я кустик и расту по своему (test = 30)");
		Nature.test = 30;
	}

}
