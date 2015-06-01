package api.util.vector;

import java.util.Vector;

import api.util.vector2.GradeService;
import api.util.vector2.GradeVO;

public class GradeMain {
	public static void main(String[] args) {
		GradeMain gm = new GradeMain() ;
		gm.inputStudent();
		
	}

	public void inputStudent() {
		GradeVO vo1 = new GradeVO() ;
		vo1.setEng(60);
		vo1.setHak("1501");
		vo1.setKor(70);
		vo1.setMath(50);
		vo1.setName("ȫ�浿");
		GradeVO vo2 = new GradeVO() ;
		vo2.setEng(60);
		vo2.setHak("1502");
		vo2.setKor(70);
		vo2.setMath(50);
		vo2.setName("��浿");
		GradeVO vo3 = new GradeVO() ;
		vo3.setEng(60);
		vo3.setHak("1503");
		vo3.setKor(70);
		vo3.setMath(50);
		vo3.setName("�ڱ浿");
		GradeService service = new GradeServiceImpl();
		service.Input(vo1);
		service.Input(vo2);
		service.Input(vo3);
		System.out.println("1501 ���� ���� ��ȸ : "
				+ service.SearchGradeByHak("1501"));
		// �÷��� ������ <Ŭ����Ÿ��> �� ���׸� �̶�� Ī��.
		// Ư���� ����� ���ϴ� ���� �ƴϰ� �÷��� ���ο���
		// Ÿ�� ĳ������ �Ѵٶ�� �����ϰ� �����ϼŵ� ������.
		Vector<String> vc = service.SearchGradeByName("��浿");
		for(int i = 0 ; i < vc.size() ; i++){
			System.out.println(vc.elementAt(i));
			
		}
		
	}
}
