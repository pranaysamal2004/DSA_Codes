import java.util.*;
public class max_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = findmax(arr,n);
        System.out.println("The maximum value in the array is: "+max);
    }
    public static int findmax(int[] arr, int n){
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
