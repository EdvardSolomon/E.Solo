
public abstract class Nature {
	
	Nature(){ 							//������� ����������� ������� ������.
		System.out.println("����������� �������");
	}
	String vidd;
	public int height;
	public int age;
	static boolean green = true;		//�������� ���������� � ������� �������������� �������.
	private boolean fire = false;
	static int test = 42;
	
	abstract void germinate();		//���������� ����� � �������������� ��������� � �����������
	
	int giveSeeds() {
		int seedsNumber = 10;
		return seedsNumber;
	}
	
	void grow() {
		System.out.println("�����");
	}
	
	void grow(int grow) {
		System.out.println("����� �������"); //�����������
	}
	
	void grow(int grow, int grow2) {
		System.out.println("����� ��� �������");
	}
	
	static boolean greeny() {			//����������� �����
		return green;
	}
	
	private boolean fireChek() {
		return fire;
	}
	
	boolean fireAlarm() {
		boolean fireAlarm = fireChek();
		if(fireAlarm == false) {
			System.out.println("������,�� �����");
		}
		else {
			System.out.println("��������,��������!");
		}
		return fireAlarm;
	}
	
	void test() {					
		System.out.println(test);
	}

}
