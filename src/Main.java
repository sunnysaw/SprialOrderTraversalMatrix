/*
Question : Given an n*m matrix 'a',return all elements of the matrix in spiral order.
 */
import java.util.Scanner;
public class Main {
    static void PrintMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
    static void SpiralMatrix(int[][] arr, int a,int b){
        int topRow = 0, bottomRow = a -1, leftclo = 0 , rightclo = b -1, totalElement = 0;
        while (totalElement <= a * b){
            for (int j = leftclo; j <= rightclo; j++){
                System.out.print(arr[topRow][j] + " ");
                totalElement++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow; i++){
                System.out.print(arr[i][rightclo] + " ");
                totalElement++;
            }
            rightclo--;
            for (int j = rightclo; j >= leftclo; j--){
                System.out.print(arr[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow; i--){
                System.out.print(arr[i][leftclo] + " ");
                totalElement++;
            }
            leftclo++;
        }
        PrintMatrix(arr);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of row :");
        a = sc.nextInt();
        System.out.println("Enter the length of column :");
        b = sc.nextInt();
        int[][] arr = new int[a][b];
        System.out.println("Enter the values inside the matrix :");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Firstly, printing the original matrix :");
        PrintMatrix(arr);
        System.out.println("Now, finally printing the final result i.e spiral matrix :");
        SpiralMatrix(arr,a,b);
    }
}