class LogicalDemo{
public static void main (String[]args){
int a=10,b=20;
boolean b=a++ + --a + a++ + ++a;
System.out.println(b+","+a);
}
}