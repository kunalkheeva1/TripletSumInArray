import java.util.Arrays;

public class TripletSumInArray {

    public static boolean tripletSumInArray(int [] arr, int n, int x){
        int i, j, k;
        Arrays.sort(arr);
        for(i=0; i<n; i++){
            j= i+1;
            k= n-1;
            while(j<k){
                int sum = arr[i]+ arr[j] + arr[k];
                if(sum==k){
                    return true;
                }
                else if(sum >k){
                    k--;
                }else{
                    j++;
                }
            }
        }return false;
    }
    public static void main(String[] args) {

    }
}
