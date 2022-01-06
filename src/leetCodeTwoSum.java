import java.util.Arrays;

public class leetCodeTwoSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 17;
        int sum = 0;
        int [] b = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                sum= arr[i]+ arr[j];

            if (sum==target){
                b[0] = i;
                b[1] = j;
            }
        }
        }
        System.out.println(Arrays.toString(b));
        
    }
}
