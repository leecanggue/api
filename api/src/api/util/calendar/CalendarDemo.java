package api.util.calendar;

import java.util.Calendar;

import api.lang.object.ToStringDemo;

/*
 * java.util.Calendar
 * 
 */
public class CalendarDemo {
	public static void main(String[] args) {
		String[] months = {"1��", "2��", "3��", "4��", 
				"5��", "6��", "7��", "8��", 
				"9��", "10��", "11��", "12��"};
		// Calendar.getInstance() �� ����������
		// ����ƽ�� �̱��� �������� ��ü�� �����ϴ� ����̴�.
		// �������� �ν��Ͻ��� �������� �ʵ��� �����Ϸ���
		// �������� �ڵ��Ǿ���.
		Calendar date = Calendar.getInstance() ;
		System.out.print("ù��° ���� ��¥ : ");
		System.out.print(date.get(Calendar.YEAR) + "��");
		System.out.print((date.get(Calendar.MONTH) + 1) + "��");
		System.out.println(date.get(Calendar.DATE) + "��");
		
		System.out.print("�ι�° ���� ��¥ : ");
		System.out.print(date.get(Calendar.YEAR) + "��");
		System.out.print((Calendar.MONTH+3) + "��");
		System.out.println(date.get(Calendar.DATE) + "��");
		
		System.out.print("�ð� : ");
		System.out.print(date.get(Calendar.HOUR) + "��");
		System.out.print(date.get(Calendar.MINUTE) + "��");
		System.out.println(date.get(Calendar.SECOND) + "��");
		
		System.out.println("===����� 1�� �� ���� ������� ������ ��===");
		date.add(Calendar.MONTH, 1); // ���� ��¥�� 1�� ���� ���
		System.out.println(toString(date));
		/*
		 * ��µ� ����� : java.util.GreforianCalendar �� ��µ�
		 */
		System.out.println("=== 7�� ��===");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));
		
		System.out.println("Ư�� �ð����� ����");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 46);
		
		System.out.println("������ �ð� ���");
		System.out.print(Calendar.HOUR);
		System.out.print(Calendar.MINUTE);
		System.out.print(Calendar.SECOND);
		/*
		 * ������ �ð� ��°�� ���� 101213 ó�� �Ǿ� �������̵��� �ʿ��ϴ�.
		 */

	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR) + "��" 
		+ date.get(Calendar.MONTH ) + "��" // ���� 0���� �����ϹǷ� +1 �� �ؾ��Ѵ�.
		+ date.get(Calendar.DATE) + "��" ;
	}
}






















