import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int [] a ={1,2,3,3,6,-1,3,-4,-10,56,90,1,3,4};
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int min_i = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<min){
                    min = a[j];
                    min_i=j;
                }
            }
            if (i !=min){
                int t = a[i];
                a[i]=a[min_i];
                a[min_i]=t;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
