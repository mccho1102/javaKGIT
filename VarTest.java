package variable;

/*
 * ���α׷���: ������
 * ����������¥: 2019.03.19
 * ������������: ���� Ȯ��
 */
public class VarTest {

	public static void main(String[] args) {
		//�ڹ��� �⺻ (1���ּ�)
		System.out.println("������ �ι�° ���Դϴ�.");
		System.out.println("---------------");
		
		byte time = 15; // = ���Կ�����, �Ҵ翬����
		//����ŸŸ�� ������ = ��;
		int seconds = 5123432;
		
		final double PI = 3.14123456; //���
		//PI = 3; ����� ���� ������ �� ����.
		//����� �Ϲ������� ��������� �빮�ڷ� ����.(final)
		
		char lastName = '��';
		boolean lunch = true; //��: true, ����: false
		
		System.out.println("���� �ð���:" + time); 
		// + => ���� ������
		System.out.println("��ħ���� ���� �ʴ�:" + seconds);
		System.out.println("PI�� ����:" + PI);
		System.out.println("���� �̸� ù���ڴ�:" + lastName);
		System.out.println("������ �Ծ�����:" + lunch);
		
		String name = "���ƹ���"; //String => "
		System.out.println("���� ��ü �̸��� " + name);
		
	}

}
