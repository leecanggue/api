package api.util.vector2;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	/*�޼ҵ帶�� �����ϴ� �ټ��� ��(�л��� �������̴�)�� �ʿ��ѵ�,
	 �ѱ����� ������ �÷����� �ʵ忡 �����ؾ� �ڴ�.
	 �ʵ忡 �����ؾ� �޼ҵ���� ���� ������ �� �����ϱ�....*/
	
	private Vector<GradeVO>vc = new Vector<GradeVO>();
	GradeVO grade = new GradeVO();
	
	/*
	 *  1-input () // �л����� ������ �Է¹޴� ���ΰ�.. �׷� �Է¹޾Ƽ�
		 			������ ������ �ʿ��ϰڴµ�... �迭�� ���� ������ 
		 			�����ϴ� �����ε� �ѹ� �����ϸ� �߰��� �ø��� 
		 			������ ��������Ȯ���ϴ� �÷����� �����ؾ߰ڱ�. 
		 			�׷��� ���� ���� �ƴ°� �b�� ���̴� ���Ϳ� �־����.
	 */
	@Override
	public void Input(GradeVO vo) {
		vc.add(vo);
	}
	/*
	 *  2-print() // ����ϴ� ���ΰ�?  �׷� vo ��ü�� toString() �����;���.
	 */
	@Override
	public void print() {
		System.out.println(vc.toString());
		
	}
	/*
	 *  3-searchGradeByHak()
		 	// �й����� ������ ��ȸ�ϴ� ����̱�
		 	// �й��� ���� �� �л����Ը� �����ϹǷ�
		 	// ���ϰ��� String ���״� ������ for loop + ���ο� if�� �غ��� �ڴ�.
	 */
	@Override
	public String SearchGradeByHak(String hak) {
		// for �� �ȿ� ���������� �����ߴ���...
		// ���ϵǴ� ��ġ�� ������ �޶� ������ ����.
		// ���� for �� ������ ���������� ���߰ڴ�.
		String msg = ""; //���������ϱ� �ʱ�ȭ
		for(int i = 0 ; i < vc.size() ; i ++){
			/*
			 * myHak�� ���Ϳ��� i ��° ��ҿ��� �й��� 
			 * �����Ͽ� ���� ����.. Ÿ���� String
			 */
			String myHak = vc.elementAt(i).getHak();
			/*
			 * �Ķ���ͷ� �޾ƿ� hak�� ���Ϳ� ����ִ�
			 * myHak �� ��ġ�ϴ��� ���θ� üũ�ϴ� ����
			 */
			System.out.println("�Ķ���� ���� : " + hak);
			System.out.println("�������� : " + myHak);
			if(hak.equalsIgnoreCase(myHak)){
				msg = hak;
				break ;
			}else{
				msg = "��ȸ�Ǵ� �й��� �����ϴ�.";
			}
		}
		return msg;
	}
/*
 *  4-searchGradeByName()
		 	// �̸����� ������ȸ�ε� ���ϰ��� ������ ���� ����
		 	// �������� String �� ó���ϰԲ� ����Ǿ���.
		 	// ���ϰ��� �ϳ� �� �������� for loop + if �����ۿ���
		 	// ���� ��� ��·����� ������ �װ� ��߰ڴ�.
 */
	@Override
	public Vector<String> SearchGradeByName(String name) {

		Vector<String> local = new Vector<String>();
		for(int i = 0 ; i < vc.size() ; i ++){
			/*
			 * myHak�� ���Ϳ��� i ��° ��ҿ��� �й��� 
			 * �����Ͽ� ���� ����.. Ÿ���� String
			 */
			String myname = vc.elementAt(i).getName();
			/*
			 * �Ķ���ͷ� �޾ƿ� hak�� ���Ϳ� ����ִ�
			 * myHak �� ��ġ�ϴ��� ���θ� üũ�ϴ� ����
			 */
			if(name.equalsIgnoreCase(myname)){
				local.removeAllElements();
				local.add(name);
				break ;
			}else{
				
				local.add("��ȸ�ϴ� �̸��� �����ϴ�.");
				
			}
		}
		return local;
	}
	/*
	 *  5-descGradeTotal()
		 	// ���������ΰ�����.
		 	// Collections.sort ���� �ȴٴµ� ���� �׶� ó���ؾ߰ڴ�.
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	/*
	 *  6-ascGradeTotal()
		 	// ���������̸� Arrays.sort �� ���� �ǰڱ�.
	 */
	@Override
	public void ascGradeTotal() {
		//
		
	}

}
