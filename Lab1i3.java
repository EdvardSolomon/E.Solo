import java.util.ArrayList;

//import pakage.proverka;


public class Lab1i3 {
	

	public static void main(String[] args) {
		boolean test = Nature.greeny();			//статический метод
		System.out.println(test);
			
		Tree Derevo = new Tree("Секвоя", 100, 215);
		
		boolean test2 = Derevo.fireAlarm();
		System.out.println(test2);

		Derevo.germinate();
		Derevo.grow();
		Derevo.grow(1);
		Derevo.grow(1,2);
		
		Bush Kyst = new Bush();
		
		Kyst.test();
		Derevo.test();
		Kyst.grow();
		Kyst.test();
		Derevo.test();
		
		ArrayList<Nature> list1 = new ArrayList<Nature>();
		list1.add(Derevo);
		list1.add(Kyst);
		System.out.println(list1.size());
		for(int i = 0; i < list1.size(); i++) {
			list1.get(i).grow();
		}
		
	}	
}
