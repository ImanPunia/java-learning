package Matrix;

public class BeforeMatrix2 {
    public static void beforeMatrixValue(int arr[][]){

        int after[][] = arr;
        int m = after.length; //rows
        int n = after[0].length; //columns
        int before[][] = new int[m][n]; 

        //first element will be same 
        before[0][0]= arr[0][0];

        //when column > 0 and row = 0 means, first row, i = 0 && j > 0 
        for(int j = 1; j < n; j++){
            before[0][j] = arr[0][j] - arr[0][j-1];
        }
        //when row > 0 and column = 0 , firts column, i > 0 && j = 0
        for(int i = 1;  i < m; i++){
            before[i][0] = arr[i][0] - arr[i-1][0];
        }

        //find the values of left over cells , i >= 1 and j >=1  , except  firts row and column
        for(int i =  1; i < m ; i++) {
            for(int j = 1; j < n; j++){
                before[i][j] = arr[i][j] - arr[i][j-1] - arr[i-1][j] + arr[i-1][j-1];
            }
        }

        //print the matrix
        for(int k = 0; k < m; k++){
            for(int l = 0 ; l < n; l++){
                System.out.print(before[k][l]+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        int arr1[][] = {{10,30,60},
                        {20,60,120},
                        {60,110,180}};
        
        beforeMatrixValue(arr1);
    }
}
