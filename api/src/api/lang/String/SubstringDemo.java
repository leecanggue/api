package api.lang.String;
/*
 * java.lang.String �� �ִ�
 * substring() �޼ҵ��
 * ������ġ(begin) ���� ����ġ(end) ���� ���ڿ� ����
 * begin <= x < end
 */
public class SubstringDemo {
	public static void main(String[] args) {
		// �ε����� 0���� �����ϸ� ���鵵 1�� ó���ȴ�.
		System.out.println("�Ķ���Ͱ� �Ѱ��϶� : " + "Hello Java".substring(5));
		// 6������ 7��° ���ڸ� 3���� 9��° �̸� ������ a
		// �׷��� Ja�� ����
		System.out.println("�Ķ���Ͱ� �ΰ��϶� : " + "Hello Java".substring(6,8));
	}
}
