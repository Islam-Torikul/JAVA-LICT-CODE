public class Varargs {

	static void m1(int...arr)
	{
		System.out.println(arr.length);
		for(int x:arr)
			System.out.println(x+" ");
		System.out.println();
	}
	static void m1(boolean...arr)
	{
		System.out.println(arr.length);
		for(boolean x:arr)
			System.out.println(x+" ");
		System.out.println();
	}
	static void m1(String msg,int...arr)
	{
		System.out.println(msg+" "+arr.length);
		
	}
	public static void main(String[] args) {
	m1(1,2,3);
	m1("Jonny",10,20);
	m1(true,false,false);
	}

}
