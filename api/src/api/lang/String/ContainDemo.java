package api.lang.String;
/*
 * java.lang.String
 * contain(s) : s��� ���ڰ� ���� �Ǿ����� ����üũ
 */
public class ContainDemo {
	public static void main(String[] args) {
		String str = "abcde";
		/*
		 * (���ǽ�) ? "��" : "����" ;
		 */
		System.out.println(str.contains("f") ? "f �� ����" : "f �� ������");
	}
}