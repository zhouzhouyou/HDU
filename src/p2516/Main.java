package p2516;

import java.util.Scanner;

/**
 * http://acm.hdu.edu.cn/showproblem.php?pid=2516
 *
 * 1堆石子有n个,两人轮流取.先取者第1次可以取任意多个，但不能全部取完.
 * 以后每次取的石子数不能超过上次取子数的2倍。取完者胜.
 * 先取者负输出"Second win".先取者胜输出"First win".
 *
 * 输入有多组.每组第1行是2<=n<2^31. n=0退出.
 *
 * 先取者负输出"Second win". 先取者胜输出"First win".
 *
 *
 * 思路：
 * 当A行动时，如果面前的n是斐波那契数（n>=2），那么A必输。
 */

public class Main {
    public static void main(String[] args) {
        int max = 51;
        Scanner sc = new Scanner(System.in);
        int[] fb = new int[max];
        fb[1] = fb[2] = 1;
        for (int i = 3; i < max; i++) {
            fb[i] = fb[i-1] + fb[i-2];
        }


        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) break;
            boolean find = false;
            for (int i = 1; i < max; i++) {
                if (n == fb[i]) {
                    find = true;
                    break;
                }
            }
            System.out.println(find ? "Second win" : "First win");
        }
    }
}
