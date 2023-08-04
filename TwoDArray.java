public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr = {{1,2,7},{3,4,8},{5,6,9}};
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(i == 0 || i == arr.length-1 || j == 0 || j == arr[0].length-1){

                System.out.print(arr[i][j]+ " ");
                }
                else 
                {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
