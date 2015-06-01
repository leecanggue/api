package api.util.collections;

import java.util.Vector;

public interface GradeService {
	/*
	 * vo 객체를 벡터에 저장하는 기능
	 */
	public void Input(GradeVO vo);
	public void print();
	public String SearchGradeByHak(String hak);
	public Vector<String> SearchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
}
