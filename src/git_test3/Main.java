package git_test3;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	// 랜덤 데이터 생성기능을 구현
	static int[] createArray(int size, int minValue, int maxValue) {
		
		Random random = new Random();
		
		int[] a = new int[size];
		
		for(int i=0; i<a.length; i++) {
			a[i] = random.nextInt(maxValue-minValue+1)+1;
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {4, 8, 2, 6, 10, 3, 1, 7, 9, 5};
		Sort.sort(a);
		System.out.println(Arrays.toString(a));
		
	}	// main 메소드
}	// main 클래스
