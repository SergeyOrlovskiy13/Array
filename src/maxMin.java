public class maxMin {
    public static void main(String[] args) {
        int [] a ={1,2,3,3,6,-1,3,-4,-10,56,90,1,3,4};
        int min = a[0];
        int max= a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min) {
                min = a[i];
            }
            if (a[i]>max) {
                max = a[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
