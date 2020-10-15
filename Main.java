import java.util.Scanner;
class Main {
  static int get_raise_to_power(int a, int b){
    return (int) Math.pow(a, b);  
  }

  static int get_summation(int n){
    int sum = 0;
    for (int i = 1; i <=n; i++){
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("This program is to calculate the power of a number.");
    System.out.println("Input the number");
    int num = sc.nextInt();
    System.out.println("Input the power");
    int pow = sc.nextInt();
    int result = get_raise_to_power(num, pow);
    System.out.printf("The result of %d raise to the power of %d is %d", num, pow, result);
    System.out.println(" ");
    System.out.println("The result of " + num + " raise to the power of " + pow + " is " + result);

    System.out.println("This program is to calculate the summation of a number");
    System.out.println("Input the number");
    num = sc.nextInt();

    result = get_summation(num);
    System.out.printf("The summation of the number %d  is %d", num, result);

    
  }

  
}