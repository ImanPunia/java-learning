package Matrix;

public class AddMatrix {
    
    public static void addMatrix(int arr1[][], int arr2[][]){

        int m = 2;
        int n = 2;
        int first[][] = arr1;
        int second[][] = arr2;
        int result[][] = new int[m][n];

        for(int i = 0; i < m; i++){

            for(int j = 0 ; j < n ; j++){
                result[i][j] = first[i][j] + second[i][j];
            }

        }

        for(int k = 0; k < m; k++){
            for(int l = 0 ; l < n; l++){
                System.out.print(result[k][l]+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        int arr1[][] = {{1,1},
                        {1,1}};
        int  arr2[][] = {{1,1},
                        {1,1}};
        addMatrix(arr1,arr2);
    }
}
