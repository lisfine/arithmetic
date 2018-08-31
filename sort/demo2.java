import java.util.Arrays;

/**
 *  冒泡算法
  * Created by LHR on 2018/7/5.
 */
public class demo2 {
    public static void main(String[] args) {
        int[] a = {5,3,9,1};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length -1 ; j++) {
                if (a[j] < a[j+1]){
                    int x = a[j];
                    a[j] = a[j+1];
                    a[j+1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
