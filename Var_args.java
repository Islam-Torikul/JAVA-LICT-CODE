public class Var_args {

	static void m1(String str,int...arr)
	{
		System.out.println(str+" "+arr.length);
		for(int x:arr)
			System.out.println(x);
	}
	
	public static void main(String[] args) {
		m1("Mexico",10,20);
		m1("alaska",10,20,30,40);
		m1("lasvagas");
		
	}

}