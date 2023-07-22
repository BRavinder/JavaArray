public class Array2D {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        int count;
        count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                arr[i][j] = count;
                count++;
                    System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
    }
}
