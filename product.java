public class product {
    public static void main(String[] args) {
        int arr[] = new int[]{5,12,4,21,8,2,3,7,9,11};
        double prod = 1;
    for(int i = 0; i < arr.length; i++){
        if(arr[i]%2 == 0)
        prod = prod * arr[i];
    }
    System.out.println("Even: " + prod);
}
}

