package git_test3;

public class Sort {
	public static void sort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int value = a[i];
			int j;
			for(j = i-1; j>=0; j--) {
				if(a[j] > value) {
					a[j+1] = a[j];
				} else {
					break;
				}	// if 문 
			} // 안쪽 for
			a[j+1] = value;
		}	// 바깥 for
	}	// sort 메소드
}	// sort 클래스
