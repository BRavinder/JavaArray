import java.util.*;
public class evenNumber {
        public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};
                //Even number
            System.out.println("evenNumber:");
        for(int i = 0; i <arr.length; i++) {
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }
                //Even Index
        // for(int i = 0; i < arr.length; i++) {
        //     if(i%2 == 0)
        //     System.out.println(i);
        // }
    }
}

