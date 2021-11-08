package StringandArray;

public class Array_2 {

	
	public static void main(String[] args) {
		
		//[Array_2]
		//다차원 배열
		
		//배열의 차원
		//- 1차원 배열
		//- 2차원 배열
		//- 3차원 배열
		//...
		//- N차원 배열
		
		
		
		//m1();		//1,2,3 차원 배열 방법과 길이
		//m2();		//배열 초기화 리스트(차원수)
		m3(); 		
		
		
		
	}//main
	
	private static void m3() {
		
		
		//자바에서 배열 표기법(꼭 맨 위방법으로 쓸것!)
		//int[] num = new int[5];		//o
		//int [] num = new int[5];		//x
		//int num[] = new int[5];		//x
		
		
		//문제 풀이 베이스
		int[][] nums = new int[5][5];
		
		//요구사항] 각 방에 숫자들을 적절하게 대입하시오.
		int n = 1;
		
		//입력		
		//1.
		/*
		for (int i=0; i<nums.length; i++) {
				for (int j=0; j<nums[0].length; j++) {
				//System.out.println("i: " + i + ", j: " + j);	
				nums[i][j] = n;
				n++;
				}
		 }
		 */
		 
		//2.
		for (int i=nums.length-1; i>=0; i--) {
			for (int j=nums[0].length-1; j>=0; j--) {
				//System.out.println("i: " + i + ", j: " + j);
				nums[i][j] = n;
				n++;
			}
		}
		output(nums);
			
		
	}//m3

	private static void output(int[][] nums) {

		//출력
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[0].length; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
	}


	private static void m2() {

		//배열 초기화 리스트
		int[] nums1 = { 10, 20, 30 };
		
		int[][] nums2 = { { 10, 20, 30 }, { 40, 50, 60 } };
		
		//new int[3][2][3]
		int[][][] nums3 = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 10, 20, 30 }, { 40, 50, 60 } }, { { 10, 20, 30 }, { 40, 50, 60 } } };
		
		int[][][] nums4 = 
		{ 
			{ 
				{ 10, 20, 30 }, 
				{ 40, 50, 60 } 
			}, 
			{ 
				{ 10, 20, 30 }, 
				{ 40, 50, 60 } 
			}, 
			{
				{ 10, 20, 30 }, 
				{ 40, 50, 60 } 
			} 
		};
	}//m2
	

	private static void m1() {

		
		//1차원 배열 
		int[] nums1 = new int[3];
		
		
		//2차원 배열
		int[][]	nums2 = new int[2][3]; //2행x3열 -----행=가로, 열=세로
		
		//3차원 배열
		int[][][] nums3 = new int[2][2][3]; //2면x2행x3열
		
		
		//1차원 배열 > 차원 1개 > 첨자 1개 > 단일 for문
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;		
		
		//2차원 배열 > 차원 2개 > 첨자 2개 > 2중 for문
		nums2[0][0] = 100;
		nums2[0][1] = 200;
		nums2[0][2] = 300;
		nums2[1][0] = 400;
		nums2[1][1] = 500;
		nums2[1][2] = 600; 	//전형적인 이중 for문의 변화와 같다(작은 단위가 더 빨리변함)
		
		//3차원 배열 > 차원 3개 > 첨자 3개 > 3중 for문
		nums3[0][0][0] = 100;
		nums3[0][0][1] = 200;
		nums3[0][0][2] = 300;
		
		nums3[0][1][0] = 400;
		nums3[0][1][1] = 500;
		nums3[0][1][2] = 600;
		
		nums3[1][0][0] = 700;
		nums3[1][0][1] = 800;
		nums3[1][0][2] = 900;
		
		nums3[1][1][0] = 1000;
		nums3[1][1][1] = 1100;
		nums3[1][1][2] = 1200;
		
		
		//1차원 배열
		for (int i=0; i<nums1.length; i++) {
			System.out.printf("nums1[%d] = %d\n", i, nums1[i]);
		}
		System.out.println();
		
		
		
		//2차원 배열 > new int[2][3];
		for (int i=0; i<nums2.length; i++) {
			for (int j=0; j<nums2[0].length; j++) {
				System.out.printf("nums2[%d][%d] = %d\n", i, j, nums2[i][j]);
			}
		}
		System.out.println();
		
		
		//3차원 배열 > new int[2][2][3];
		for(int i=0; i<nums3.length; i++) {
			for (int j=0; j<nums3[0].length; j++) {
				for (int k=0; k<nums3[0][0].length; k++) {
					System.out.printf("nums3[%d][%d][%d] = %d\n", i, j, k, nums3[i][j][k]);
				}
			}
		}
		System.out.println();
		
		
		//배열의 길이(=방의 개수)***************
		//new int[3]
		System.out.println(nums1.length);	 	//1차원의 길이(3)
		System.out.println();

		//new int[2][3]
		System.out.println(nums2.length); 		//2차원의 길이(2) - 행
		System.out.println(nums2[0].length);	//1차원의 길이(3) - 열
		System.out.println(nums2[1].length);	//1차원의 길이(3) - 열
		System.out.println();
		
		//new int[2][2][3]
		System.out.println(nums3.length); 		//3차원의 길이(2)
		System.out.println(nums3[0].length);	//2차원의 길이(2)
		System.out.println(nums3[0][0].length);	//1차원의 길이(3)
		
		
	}
		
		
}//class
