package api.util.vector2;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		// ������ setter ����Ⱑ ������.
		// �����ڷ� �� ���� ��������..
		// �Ʒ�ó�� ���̰� ����.. ���߿� ���ٰ�..
		GradeVO g1 = new GradeVO("1111","ȫ�浿",70,80,90);
		GradeVO g2 = new GradeVO("2222","��浿",75,90,40);
		GradeVO g3 = new GradeVO("3333","��浿",10,10,10);
		service.Input(g1);
		service.Input(g2);
		service.Input(g3);
		service.print();
		/*
		 * ����ǥ [�й� = , �̸� = , ���� = 0, ����= 0, ���� = 0]
		 * �� ��������..
		 * ����� ���ϱ� grade�� ����� �ϴµ�, ���Ϳ� ����ִ� �༮��
		 * �ƴ϶� �׳� �ΰ��̴���
		 * �׷� ���Ϳ� �ִ� grade�� �������� ���?
		 * grade ��ſ� vc.toString()�ؾ߰ڴ�...
		 *  
		 */
		String dummy = service.SearchGradeByHak("1111");
		System.out.println(dummy);
		Vector<String> temp = new Vector<String>();
		temp = service.SearchGradeByName("��浿");
		System.out.println(temp.toString());
		
		
	}
}
