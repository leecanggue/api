package api.lang.system;

import java.text.SimpleDateFormat;
import java.util.Date;



/*
 * java.lang.System 에 속한
 * CurrentTime
 * ROM 에 내장된 시간을 리턴한다.
 */
public class CurrentTimeDemo {
	public static void main(String[] args) {
		long CurTime = System.currentTimeMillis();
		System.out.println("curTime : " + CurTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		/*
		 * new Date() 시에 import 제안이 두가지 인데
		 * 그중 java.util.Date 를 선택한다.
		 */
		String nowtime = sdf.format(new Date(CurTime));
		System.out.println("현재시간 : " + nowtime);
	}
}
