package api.util.vector;

import java.util.Vector;

import api.util.vector2.GradeService;
import api.util.vector2.GradeVO;

public class GradeServiceImpl implements GradeService{
	Vector<GradeVO> grades = new Vector<GradeVO>(); 
	@Override
	public void Input(GradeVO vo) {
		grades.add(vo);
	}
	/*
	 * ����ǥ�� ����ϴ� �޼ҵ�
	 * vo.toString() ���� ó�� �����ϰ� ����.
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * �й����� �˻��ϴ� ����� ���� �޼ҵ�
	 */
	@Override
	public String SearchGradeByHak(String hak) {
		
		String result = "";
		for(GradeVO vo : grades){
			if(vo.getHak().equalsIgnoreCase(hak)){
				result = vo.toString();
			}else{
				result = "��ȸ�� �л��� �����ϴ�.";
			}
		}
		return result; 
	}
	/*
	 * �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	 */
	@Override
	public Vector<String> SearchGradeByName(String name) {
		Vector<String> vc = new Vector<String>();
		for(GradeVO vo : grades){
			if(vo.getName().equalsIgnoreCase(name)){
				/*
				 * �Ķ���ͷ� �Ѿ�� �̸��� ������ VO ��ü��
				 * ã�Ƽ� String ���·� ���Ϳ� �����Ѵ�.
				 * �� vc �� String Ÿ���̶� �� ���� �ϼ���!!
				 * GradeVO Ÿ���� �ƴմϴ�.
				 */
				vc.add(vo.toString());
			}
		}
		return vc;
	}
	/*
	 * �������� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * �������� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	 */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	
}
