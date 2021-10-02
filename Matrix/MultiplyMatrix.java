package Matrix;

public class MultiplyMatrix {
    
    public static void multiply(int arr1[][],int arr2[][]){

        int m = 2; //rows of arr1
        int n = 2; // column of arr1
        int first[][] = arr1;
        int second[][] = arr2;
        int p = 2; //rows of arr2
        int q = 2; //columns of arr2
        int multiply[][]= new int[m][q];
        int sum = 0;
        
        //row 1 of matrix 1 will ierate 2 columns of matrix 2
        for(int i =0; i < m; i++)// number of rows of matrix 1
        {
            for(int j = 0;j < q; j++)// columns of matrix 2 ,to change column
            {
                for (int k = 0 ; k < p ; k++ ) //no of rows of matrix 2 , to fetch ele at q*p of matrix 2
                {
                    // col vallue of forts matrix is equal to row  value of second matrix thst why we used k to acess data from first matrix
                   sum = sum + first[i][k]*second[k][j];
                }

                multiply[i][j] = sum;
                sum = 0;
            }
        }

        for(int k = 0; k < m; k++){
            for(int l = 0 ; l < n; l++){
                System.out.print(multiply[k][l]+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        int arr1[][] = {{1,1},
                        {1,1}};
        int  arr2[][] = {{1,1},
                        {1,1}};
        multiply(arr1,arr2);
    }


}
