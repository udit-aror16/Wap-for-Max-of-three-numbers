import java.util.Scanner;
public class Max{
  public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the First number:");
    int a=sc.nextInt();
    System.out.println("Enter the Second number:");
    int b=sc.nextInt();
    System.out.println("Enter the Third number:");
    int c=sc.nextInt();
    if (a>b && a>c) {
      System.out.println(a+" is greatest.");
    }else if(b>c && b>a) {
      System.out.println(b+" is greatest.");
    }else{
      System.out.println(c+" is greatest.");
    }
    sc.close();

  }
}