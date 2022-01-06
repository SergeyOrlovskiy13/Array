import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] a ={1,2,3,3,6,-1,3,-4,-10,56,90,1,3,4};
        int t;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]>a[j]){
                    t = a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }System.out.println(Arrays.toString(a));

    }
}
