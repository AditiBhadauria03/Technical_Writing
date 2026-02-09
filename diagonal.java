//WAP to print sum of diagonal elements of a matrix
//INPUT:[1 2 3 4 5 6 7 8 9]
//OUTPUT:15

//OBSERVATION:
//The diagonal elements of a matrix are those elements which have the same row and column index. For example, in a 3x3 matrix, the diagonal elements are at positions (0,0), (1,1), and (2,2).

//ALGORITHM:
//1.Take input from the user for number of rows and columns of the matrix.
//  2.Create a 2D array to store the matrix elements.
//  3.Take input from the user to fill the matrix.
//  4.Initialize a variable sum to 0.
//  5.Iterate through the matrix using nested loops. For each element, check if the row index is equal to the column index (i.e., if i == j). If it is, add the element to the sum.
//  6.After the loops, print the value of sum, which will be the sum of the diagonal elements of the matrix.

import java.util.Scanner;
class diagonal
{
    public static void main(String args[])
    {
        int rows,cols;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        rows=sc.nextInt();

        System.out.println("Enter number of columns");
        cols=sc.nextInt();

        int mat[][]=new int[rows][cols];
        System.out.println("Enter elements of the matrix");
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(i==j)
                {
                    sum=sum+mat[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements is:"+sum);
    }
}