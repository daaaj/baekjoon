package baekjoon;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		
		// ���� ������ �Է¹޾�
		// 90 ~ 100���� A,
		// 80 ~ 89���� B, 
		// 70 ~ 79���� C, 
		// 60 ~ 69���� D, 
		// ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		if(i >= 90) {
			System.out.println("A");
		} else if(i >= 80) {
			System.out.println("B");
		} else if(i >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		
	}
}
