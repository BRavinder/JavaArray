import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter randm Numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
                
        }
        System.out.print("Enterd Number:");
        for(int num : arr){
            System.out.print(num+ " ");
            System.out.println();
        }
        System.out.println("sorted array:");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
        }

    }
}
