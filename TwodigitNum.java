public class TwodigitNum {
    public static void main(String[] args) {
        int arr[] = new int[]{2,4,7,88,12,34,58,99,01,55};
        // Two digit number
        System.out.println("Two digit numbers:");
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > 9 && arr[i] < 100)
            System.out.print(arr[i]+ " ");
        }
        // Print One digit Number
        System.out.println();
        System.out.println("One digit number:");
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] < 10)
            System.out.print(arr[i]+ " ");
        }
        
    }
}
