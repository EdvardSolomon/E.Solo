
public class Tree extends Nature { //������������
	Tree(String vid,int visota,int ages){				//������� ����������� ������� ������.
		age = ages;
		height = visota;
		System.out.println("����������� ������");
		System.out.println("� " + vid + " ,������� " + visota + " ������ ,��� " + ages + " ���.");
	}

	@Override
	void germinate() {				//���������� ����� � �������������� ��������� � �����������
			System.out.println("� ������ � � ���������");
	}
	@Override
	void grow() {					//���������� ����� � �������������� ��������� � �����������
		System.out.println("� ������ ����� �� ������");
	}
}
