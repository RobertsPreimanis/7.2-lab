//251RDC028 Roberts Preimanis

import java.util.Scanner;

class Main {
  static public double apr(double a, double guess){
    if (Math.abs(guess - a/guess) > 0.0001){
      return apr(a, (guess + a/guess)/2);
    }else{
      return guess;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    double guess = x/2;
    sc.close();
    System.out.printf("%.2f", apr(x, guess));
  }
}
