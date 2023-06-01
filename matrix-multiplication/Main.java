import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int m, n;
    int p, q;

    int sum_of_products = 0;

    int i, j;
    int k;

    int first[][], second[][];
    int product[][];

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the no. of rows & cols for first matrix: ");
    m = sc.nextInt();
    n = sc.nextInt();

    first = new int[m][n];

    System.out.println("Enter the elements of first matrix: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        first[i][j] = sc.nextInt();
      }
    }

    System.out.print("Enter the no. of rows & cols for second matrix: ");
    p = sc.nextInt();
    q = sc.nextInt();

    if(n != p) {
      System.out.println("Matrices with entered orders can't be multiplied with each other.");
    } else {
      second = new int[p][q];
      product = new int[m][q];
    
      System.out.println("Enter the elements of second matrix: ");
      for (i = 0; i < p; i++) {
        for (j = 0; j < q; j++) {
          second[i][j] = sc.nextInt();
        }
      }
  
      for (i = 0; i < m; i++) {
        for (j = 0; j < q; j++) {
          for (k = 0; k < p; k++) {
            sum_of_products += first[i][k] * second[k][j];
          } 
          product[i][j] = sum_of_products;
          sum_of_products = 0;
        }
      }
  
      System.out.println("Product of entered matrices: ");
      for (i = 0; i < m; i++) {
        for (j = 0; j < q; j++) {
          System.out.print(product[i][j] + "\t");
        }
        System.out.println();
      }
    }
  }
}