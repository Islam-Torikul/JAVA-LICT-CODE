import java.util.*;
class fordemo{
	public static void main (String[]args){
		
		
			int a,i;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
			for (i=2;i<a;i++){
				if (a%i==0){
	
	System.out.println("The number is not prime"+a);
	break;
	}
			}
	if (a==i){
		System.out.println("The number is  prime "+a);}
			
	
}
}