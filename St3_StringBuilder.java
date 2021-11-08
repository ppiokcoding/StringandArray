package StringandArray;

public class St3_StringBuilder {
	
	public static void main(String[] args) {
		
		//[StringBuilder]
		
		//String vs StringBuilder
		//- 문자열 클래스
		
		//클래스의 인스턴스 생성방법 > new + 생성자
		
		String s1 = "홍길동"; //문자형 리터럴 사용
		String s3 = new String("홍길동"); //객체 생성 사용, FM 이고 정석임
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s3.length());
		
		
		//StringBuilder s2 = "홍길동";
		StringBuilder s2 = new StringBuilder("홍길동");
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.substring(0, 2));
		System.out.println(s2.indexOf("길"));
		
		
		//문자열의 특징
		//1. 불변 = 문자열 수정 작업에는 비용이 많이 발생한다.
		//2. 문자열은 잦은 수정작업에 취약하다.	(***********)
		//3. 덩치 큰 문자열의 수정작업에 취약하다.(***********)
		//4. 1-3번의 문제를 해소하기 위해 제공 > StringBuilder 클래스 
		
		
		
		String s4 = "홍길동"; //글자수 : 100만 -> 그런데 깜박해서 "."을 안찍어서 찍었다 치자 
							//     		   -> 노답됨 100만 글자 + 100만. 인스턴스 둘다 생기고 난리남(그림판) 
		
		//for(10000000번 반복){
		s4 = s4 + "."; //데이터 수정(x) -> 주소값 수정(o)
		//}
		
	
		long begin = 0;
		long end = 0;
		
		System.out.println("[String]");
		
		
		String txt1 = "홍길동";
		
		begin = System.currentTimeMillis(); //Tick값
		for(int i=0; i<300000; i++) {
			txt1 += ".";
		}
		end =System.currentTimeMillis();
		
		System.out.println("length(): " + txt1.length());
		System.out.printf("%,dms\n", (end - begin)); //약 14초 걸렸음 그래서 문자열은 
													 //이런 잦은조작에는 좋은 결과를 주지 않는다.
		
	
		
		System.out.println("[StringBuilder]");
		
		StringBuilder txt2 = new StringBuilder("홍길동");
		
		begin = System.currentTimeMillis(); //Tick값
		
		for(int i=0; i<300000; i++) {
			txt2.append("."); // txt2 = txt2 + "."
		}
		end =System.currentTimeMillis();
		
		System.out.println("length(): " + txt2.length());
		System.out.printf("%,dms\n", (end - begin)); //약 0.004초 걸렸음 그래서 이게 넘사벽임 
		
	}//main
	
}


class User{
	
	private String name;
	private int age;
	private String id;
	
	public String info() {

/*		
		String temp = "";
		temp += "이름: " + name;
		temp += "나이: " + age;
		temp += "아이디: " + id;
		
		return temp;
*/
		
		StringBuilder temp = new StringBuilder();
		
		temp.append("이름: " + name);
		temp.append("나이: " + age);
		temp.append("아이디: " + id);
	
		return temp.toString(); //StringBuilder -> String
		//이게 잘 만든 인포임
	}
	
}//class User


