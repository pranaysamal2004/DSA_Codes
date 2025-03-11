import java.util.*;
public class sats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < 10001;i++){
            System.out.println("Select the query you want to perform");
            System.out.println("1. mean of the array");
            System.out.println("2. median of the array");
            System.out.println("3. mode of the array");
            System.out.println("4. standard deviation of the array");
            System.out.println("5. variance of the array");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mean of the array is " + mean(arr));
                    break;
                case 2: {
                    System.out.println("Median of the array is " + median(arr));
                    break;
                }
                case 3: {
                    System.out.println("Mode of the array is " + mode(arr));
                    break;
                }
                case 4: {
                    System.out.println("Standard deviation of the array is " + standardDeviation(arr));
                    break;
                }
                case 5: {
                    System.out.println("Variance of the array is " + variance(arr));
                    break;
                }
                default:
                    System.out.println("Invalid choice");
        }
        }
    
  }
  public static int mean(int[] arr){
    int n = arr.length;
    int sum  = 0;
    for(int i = 0 ; i < n ;i++){
        sum += arr[i];
    }
    return sum/n;
  }
  public static int median(int[] arr){
    Arrays.sort(arr);
    int n = arr.length;
    if(n%2 == 0){
        return (arr[n/2] + arr[n/2 - 1])/2;
    }
    return arr[n/2];
  }
  public static int mode(int[] arr){
    int n = arr.length;
    int max = 0;
    int res = -1;
    for(int i = 0 ; i < n ; i++){
        int count = 0;
        for(int j = 0 ; j < n ; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        if(count > max){
            max = count;
            res = arr[i];
        }
    }
    return res;
  }
  public static int standardDeviation(int[] arr){
    int n = arr.length;
    int mean = mean(arr);
    int sum = 0;
    for(int i = 0 ; i < n ; i++){
        sum += (arr[i] - mean)*(arr[i] - mean);
    }
    return (int)Math.sqrt(sum/n);
  }
  public static int variance(int[] arr){
    int n = arr.length;
    int mean = mean(arr);
    int sum = 0;
    for(int i = 0 ; i < n ; i++){
        sum += (arr[i] - mean)*(arr[i] - mean);
    }
    return sum/n;
  }
}
