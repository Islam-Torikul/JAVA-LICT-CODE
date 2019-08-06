import java.util.*;
class whileDemo{
public static void main (String[]args){
	int a,i=2;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();


while (i<a){

if (a%i==0){
	
	System.out.println("The number is not prime"+a);
	break;
}
i++;
}
if (a==i){
		System.out.println("The number is  prime "+a);

}}
}

//LICT_TUP-OFF-US-23