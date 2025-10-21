//251RDC028 Roberts Preimanis

import java.util.Scanner;

class Main {
  public static void num(int count, int[] a, int i, int sum, int countp) {
    Scanner sc = new Scanner(System.in);
    if (i < count){
      a[i] = sc.nextInt();
      if (a[i] > 0){
        sum = sum + a[i];  countp ++;
      }
      num(count, a, i+1, sum, countp);
    }
    else{
      sc.close();
      System.out.print("result: ");
      System.out.printf("%.2f", sum * 1.0 /countp);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 0, sum = 0, countp = 0;
    System.out.println("251RDC028 Roberts Preimanis");
    System.out.print("count: ");
    int count = sc.nextInt();
    int[] a = new int[count];
    System.out.println("numbers: ");
    num(count, a,i, sum, countp);

    sc.close();
  }
}
