class swapWithoutThird{
public static void main(String[] args){
int a=50;
int b=100;
System.out.println("Before Swapping a="+a+" b="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping a="+a+" b="+b);
}
}
