
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class lab2q3 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mat[][] = new int[3][3];
        System.out.println("Enter elements of 3*3 matrix :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter element at " + i + "th row & " + j + "th column : ");
                mat[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("The 3*3 matrix is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of elements of left diagonal : " + (mat[0][0] + mat[1][1] + mat[2][2]));
        System.out.println("Sum of elements of right diagonal : " + (mat[0][2] + mat[1][1] + mat[2][0]));
    }
}
