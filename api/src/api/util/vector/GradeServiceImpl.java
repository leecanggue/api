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
	 * 성적표를 출력하는 메소드
	 * vo.toString() 으로 처리 예상하고 있음.
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 학번으로 검색하는 기능을 가진 메소드
	 */
	@Override
	public String SearchGradeByHak(String hak) {
		
		String result = "";
		for(GradeVO vo : grades){
			if(vo.getHak().equalsIgnoreCase(hak)){
				result = vo.toString();
			}else{
				result = "조회된 학생이 없습니다.";
			}
		}
		return result; 
	}
	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
	 */
	@Override
	public Vector<String> SearchGradeByName(String name) {
		Vector<String> vc = new Vector<String>();
		for(GradeVO vo : grades){
			if(vo.getName().equalsIgnoreCase(name)){
				/*
				 * 파라미터로 넘어온 이름과 동일한 VO 객체를
				 * 찾아서 String 향태로 벡터에 저장한다.
				 * 즉 vc 는 String 타입이란 것 주의 하세요!!
				 * GradeVO 타입이 아닙니다.
				 */
				vc.add(vo.toString());
			}
		}
		return vc;
	}
	/*
	 * 종합점수 기준으로 내림차순으로 정렬시키는 메소드
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 종합점수 기준으로 내림차순으로 정렬시키는 메소드
	 */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	
}
