
public class Main {

	public static void main(String[] args) {

		Calculate c1=new Calculate();
		int result=c1.add(1,9);
		System.out.println(result);
		
		Calculate c2=new Calculate();
		float result2=c2.add(1.1f,9.9f);
		System.out.println(result2);

		Calculate c3=new Calculate();
		float result3=c3.add(1,9.9f);
		System.out.println(result3);
		
		Calculate c4=new Calculate();
		float result4=c4.add(1.1f,9);
		System.out.println(result4);
		
		Calculate c5=new Calculate();
		float result5=c5.add(1,2,3);
		System.out.println(result5);
		
	}

}
