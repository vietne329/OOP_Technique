package self_study.QuyHoachDong;

import java.util.Scanner;

public class ConEch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long f[] = new long[55];
        f[1] = 1; f[2] = 2; f[3] = 4;
        for(int i=4; i<=50; i++) {
            f[i] = f[i - 1] + f[i - 2] + f[i - 3];
        }
        int  t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            System.out.println(f[n]);
        }
    }
}
