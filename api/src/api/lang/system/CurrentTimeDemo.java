package api.lang.system;

import java.text.SimpleDateFormat;
import java.util.Date;



/*
 * java.lang.System �� ����
 * CurrentTime
 * ROM �� ����� �ð��� �����Ѵ�.
 */
public class CurrentTimeDemo {
	public static void main(String[] args) {
		long CurTime = System.currentTimeMillis();
		System.out.println("curTime : " + CurTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		/*
		 * new Date() �ÿ� import ������ �ΰ��� �ε�
		 * ���� java.util.Date �� �����Ѵ�.
		 */
		String nowtime = sdf.format(new Date(CurTime));
		System.out.println("����ð� : " + nowtime);
	}
}
