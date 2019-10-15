import java.util.*;

public class nCr {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();;
        System.out.println(nCr(n, r));
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) *
                      fact(n - r));
    }

    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
}
