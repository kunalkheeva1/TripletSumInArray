import java.util.Arrays;

public class TripletSumInArray {
// method to check if given array contains the triplet whose sum is equals to x
    public static boolean tripletSumInArray(int [] arr, int n, int x){
        int i, j, k;
        //firstly sort the array
        Arrays.sort(arr);
        //run a loop from i to n
        for(i=0; i<n; i++){
            // i and then j and k start from the end
            j= i+1;
            k= n-1;
            //move j and k accordingly
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
            }//if nothing matches return false
        }return false;
    }
    public static void main(String[] args) {

    }
}
