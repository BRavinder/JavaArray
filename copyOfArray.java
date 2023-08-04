import java.util.*;
import java.util.Arrays;
public class copyOfArray {
    public static void main(String[] args) {
        
        int a[] = new int[5];
        Scanner s = new Scanner(System.in);
            System.out.println("Enter data in array:");
            for(int i = 0; i < a.length;i++){
                a[i]=s.nextInt();
            }
            int a2[] = Arrays.copyOf(a,5);
            System.out.println("Data in array2:");
            for (int i = 0; i < a2.length; i++) {
                System.out.print(a2[i]+" ");
            }
        }
    }
