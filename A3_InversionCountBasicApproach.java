package A13_Advance_Sorting;

public class A3_InversionCountBasicApproach {
    public static void main(String[] args) {
        int []arr = {5,2,9,1,4};
        int count =0;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for (int j =i+1; j <n; j++) {
                if(arr[i] > arr[j]) count ++;
            }
        }
        System.out.println(count);
    }
}
