import java.lang.reflect.Array;
import java.util.Arrays;

public class sumRevers {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        int sum=0;
        int n = a.length;
        for (int i = n-1; i >=0 ; i--) {
            sum = a[i]+ sum;
        }System.out.println("sum = " + sum);
        System.out.println(" Revers " );
        int t;
        for (int i = 0; i <n/2; i++) {
            t = a[i];
            a[i]= a[n-1-i];
            a[n-1-i]= t;
        }
        System.out.println(Arrays.toString(a));
    }
}
