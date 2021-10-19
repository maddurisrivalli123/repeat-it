import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t>100 || t<1) System.exit(0);
        char[] c = {'E','Q','U','I','N','O','X'};
        while(t-- >0){
            int S = 0,A = 0;
            boolean flag = false;
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(n>100 || n<1) System.exit(0);
            if(a>1000000000 || a<1) System.exit(0);
            if(b>1000000000 || b<1) System.exit(0);
            while(n-- >0){
                String s = sc.next();
                if(s.length() > 100 || s.length() < 1) System.exit(0);
                char[] sar = s.toCharArray();
                for (char d : c)
                    if(sar[0] == d)
                    flag = true;
                if(flag) S += a;
                else A += b;
            }
            if(S > A) System.out.println("SARTHAK");
            else if(S == A) System.out.println("DRAW");
            else System.out.println("ANURADHA");
    }
}
}
