package Matrix;

public class BeforeMatrix {
   
        public static void beforeMatrixValue(int arr[][]){

            int after[][] = arr;
            int m = after.length;
            int n = after[0].length;
            int before[][] = new int[m][n];

            //keep the sum of common repetitive matrix element
            int sum = 0;

            for(int i = 0; i < m; i++){
                int beforeRow[] = new int[2];
                for(int j = 0; j < n ; j++){
                    //when its the first element - a00
                    if(i < 1&& j < 1){
                        beforeRow[j] = arr[i][j];
                        sum = sum +  arr[i][j];
                    }  else if(i > 0 && j > 0){
                    //when its the last element  - a11
                        beforeRow[j] = arr[i][j]  - sum ;
                    } else {
                    //when its the top riight and bottom left element - a01 && a10
                        beforeRow[j] = arr[i][j] - arr[0][0];
                        sum = sum + arr[i][j] - arr[0][0];
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
            int arr1[][] = {{2,5},
                            {7,17}};
            
            beforeMatrixValue(arr1);
        }

}
