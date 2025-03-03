import java.util.*;
public class min_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = findmin(arr,n);
        System.out.println("The minimum value in the array is: "+min);
    }
    public static int findmin(int[] arr, int n){
        int min = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    
}
