public class array{
    public static void main(String[] args) {
        int arr[]= new int[6];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = count;
            count++;
            System.out.print(arr[i]+ " " );
            
        }
        System.out.println();
    }
}