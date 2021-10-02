package Matrix;

public class PrintMatrix {
    
    public static void PrintMatrixValue(int arr[][]){

        int rows  = arr.length;
        int column = arr[0].length;

        for(int i=0; i < rows ; i++){
            for(int j = 0; j < column;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(){

        int n = 2;
        int m = 2;
        int first[][] = new int[n][m];
        int k = 0;

        int arr[] = {2,3,4,5};

        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < m; j++){
                first[i][j] = arr[k];
                k++;
            }
        }
        
        return first;
    }

   public static void main(String[] args) {
       int result[][] = generateMatrix();
       PrintMatrixValue(result);
    }
}
