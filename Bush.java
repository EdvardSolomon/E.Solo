
public class Bush extends Nature{ //������������
	Bush(){											//������� ����������� ������� ������.
		System.out.println("����������� �����");
	}

	@Override
	void germinate() {		//���������� ����� � �������������� ��������� � �����������
		System.out.println("� ������ � � ���������");
		
	}
	
	@Override
	void grow() {		//���������� ����� � �������������� ��������� � �����������
		System.out.println("� ������ � ����� �� ������ (test = 30)");
		Nature.test = 30;
	}

}
