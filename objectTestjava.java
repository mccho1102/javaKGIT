package control;
import java.lang.*;
import java.util.Date;

public class objectTestjava {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("���� �ð���" + hour);
		System.out.println(date.getDay());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear()+1900);
		System.out.println(date.get);
		System.out.println("������ ����̾�  " + hour);
	}

}
