import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Hero Furion = new Hero(24,45,22, 800, 8, 320, 65, 12, 600, "Фурион");
		Hero Tusk = new Hero(40,15,20, 300, 2, 280, 45, 15,900,"Тускар");
		Hero AntiMage = new Hero(35,20,46,200, 12, 340, 78,20, 750, "Анти-маг");
		Hero drowRanger = new Hero(22,23,38,300,10, 300, 80, 25, 600, "Дровка");
		Hero Axe = new Hero(68,45,52, 800, 20, 320, 87, 29, 1400, "Акс");
		
		neutralCreeps MiniCentaur = new neutralCreeps(3, 260, 24, 4, 600, "Маленький кентвар из леса пиздюк");
		neutralCreeps BigCentaur = new neutralCreeps(200, 7, 260, 38, 6, 900, "Большой папа кентварище", true);
		neutralCreeps SmallCreep = new neutralCreeps(2, 300, 12, 2, 300, "Мелкий пидрилка сo смол спота");
		neutralCreeps Satyr = new neutralCreeps(450, 8, 295, 36, 3, 900, "Сатир", true);
		neutralCreeps Ursa = new neutralCreeps(150,10, 325, 45, 12, 850, "Красная доебистая урса из леса", true);
		
		ArrayList<Unit> AllUnitList = new ArrayList<Unit>();
		AllUnitList.add(Furion);
		AllUnitList.add(Tusk);
		AllUnitList.add(AntiMage);
		AllUnitList.add(drowRanger);
		AllUnitList.add(Axe);
		AllUnitList.add(MiniCentaur);
		AllUnitList.add(BigCentaur);
		AllUnitList.add(SmallCreep);
		AllUnitList.add(Satyr);
		AllUnitList.add(Ursa);
		
		allUnitCall(AllUnitList);
	}
	
	static void allUnitCall(ArrayList<Unit> AllUnitList) {
		for(int i = 0; i < AllUnitList.size(); i++) {
			AllUnitList.get(i).test();
		}
	}

}
