import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        System.out.println(binaryGap(8));
    }

    static int binaryGap(int N) {
        int tail = -1, dis = 0;
        for (int i = 0; i < 32; ++i) {
            if (((N >> i) & 1) > 0) {
                if (tail >= 0) {
                    dis = Math.max(dis, i - tail);
                }
                tail = i;
            }
        }
        return dis;
    }
}
