import java.util.*;
class Switch {
public static void main (String[]args){
	
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two number");
		b=sc.nextInt();
        c=sc.nextInt();
System.out.println("Enter your choice");
       a=sc.nextInt();
	
	switch (a){
	case 1:
	System.out.println(b*c);
	break;
	case 2:
	System.out.println(b-c);
	break;
	case 3:
	System.out.println(b+c);
	break;
	case 4:
	System.out.println(b/c);
	break;
	default:
		System.out.println("worng asnwer");

	}

}
}