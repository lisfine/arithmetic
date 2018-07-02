/**
 * 入门桶排序
 * 时间复杂度为
 * Created by LHR on 2018/7/2.
 */
//   53528 从大到小排序， 排序后是 8 5 5 3 2
public class demo1 {
    public static void main(String[] args) {
        int[] a = new int[11];
        int[] b = {5,3,5,2,8};

        //给数字每个数赋值为0
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }

        for (int i = 0; i < b.length; i++) {
            a[b[i]] ++ ;
        }

        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i]; i1++) {
                System.out.println(i);
            }
        }
    }
}
