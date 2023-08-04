public class sqrt {
    public static void main(String[] args) {
        int arr[] = new int[]{5,12,4,21,8,3,7,9,11};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.2f\n", Math.sqrt(arr[i]));
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.2f\n", Math.pow(arr[i],3));
        }
    }
    
}
