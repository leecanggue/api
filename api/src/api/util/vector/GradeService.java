package api.util.vector;

import java.util.Vector;

public interface GradeService {
	public void Input(GradeVO vo);
	public void print();
	public Vector<String> SearchGradeByHak(String hak);
	public String SearchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
}
