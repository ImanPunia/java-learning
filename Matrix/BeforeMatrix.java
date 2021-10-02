package Matrix;

public class BeforeMatrix {
   
        public static void beforeMatrixValue(int arr[][]){

            int after[][] = arr;
            int m = after.length; //rows
            int n = after[0].length; //columns
            int before[][] = new int[m][n];

            //removed sum  because in case of m and n > 2 ,the summation is not calculated correct when you tries to fill a11 element


            for(int i = 0; i < m; i++){
                int beforeRow[] = new int[m];
                for(int j = 0; j < n ; j++){
                    //when its the first element -> a00 -> i = 0 , j =  0
                    if(i < 1 && j < 1){
                        beforeRow[j] = arr[i][j];
                    }  else if(i >= 1 && j >= 1) {
                        beforeRow[j] = arr[i][j] - arr[i][j-1] - arr[i-1][j] + arr[i-1][j-1];
                    } else if( i == 0 && j > 0){
                    //when its the top riight and bottom left element - a01 && a10
                        beforeRow[j] = arr[i][j] - arr[i][j-1];                      
                    } else if(i > 0 && j == 0){
                        beforeRow[j] = arr[i][j] - arr[i-1][j];
                    }
                }
                before[i] = beforeRow; 
            }

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

            int arr2[][] = {{2,5},
                            {7,17}};
            
            beforeMatrixValue(arr2);
            beforeMatrixValue(arr1);
        }

}

/**
   output -        
            2       3
            5       7

            10      20      30
            10      20      30
            40      10      10
 */