package api.util.collections;

import java.util.Vector;

public interface GradeService {
	/*
	 * vo ��ü�� ���Ϳ� �����ϴ� ���
	 */
	public void Input(GradeVO vo);
	public void print();
	public String SearchGradeByHak(String hak);
	public Vector<String> SearchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
}
