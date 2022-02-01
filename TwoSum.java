import java.util.*;
public class TwoSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,target;
        System.out.println("Enter the size of number");
        n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target number");
        target=sc.nextInt();
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(target == (arr[j] + arr[k])){
                    System.out.println(arr[j] +" "+ arr[k]);
                }
            }
        }
    }
}