import java.util.*;
class UserInputCommand{
public static void main (String[]args){
int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		if (a==1){
		System.out.println("Saterday");
		}
		else if(a==2){
					System.out.println("Sunday");
		}
		else if(a==3){
					System.out.println("Monday");
		}
		else if(a==4){
					System.out.println("Tuseday");
		}
		else if(a==5){
					System.out.println("Wednesday");
		}
		else if(a==6){
					System.out.println("Thusday");
		}
		else if(a==7){
					System.out.println("Friday");
		}
		else {
					System.out.println("This day  is not include us");
		}
}
}