public class DiamonSpacePattern {
    public static void main(String[] args) {
        int n = 7;
        int nsp = 1;
        int nst = n/2 +1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            if(i <= n/2){
                nsp = nsp + 2;
                nst--;
            }else {
                nsp = nsp - 2;
                nst++;
            }
            System.out.println();

        }
    }
}