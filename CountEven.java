public class CountEven {
    public static void main(String[] args) {
    int arr[] = new int[]{5,12,4,21,8,3,7,9,11};
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]%2 == 0)
        count++;
    }
    System.out.println("Even:"+ count);

    int count1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0)
                count1++;
    }
    System.out.println("Odd:"+ count1);


    }
}
