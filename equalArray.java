import java.util.*;
public class equalArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int a2[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Data of a:");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }
        System.out.println("Enter the data of a2:");
        for(int i = 0; i < a.length; i++){
            a2[i] = s.nextInt();
        }
        boolean b = Arrays.equals(a,a2);
        System.out.println("If this two arrays are equal:"+b);
    }
}
