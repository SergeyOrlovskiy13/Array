import java.lang.reflect.Array;
import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int [] a ={1,2,3,3,6,-1,3,-4,-10,56,90,1,3,4};
        Arrays.sort(a);
        int n = a.length;
        int [] b = new int[n];
        for (int i = 0; i <n-1 ; i++) {
            if (a[i]!=a[i+1]){
                b[i]=a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
