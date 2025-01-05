public class DiamondPattert {
    public static void main(String[] args) {
        int n = 11;
        int nst = 1;
        int nsp = n/2;

        if(n%2 == 0){
            System.out.println(n +" is invalid");
        }
        else{
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= nsp; j++) {
                    System.out.print("   ");
                }
                for (int k = 1; k <= nst; k++) {
                    System.out.print(" * ");
                }
                if (i <= n/2){
                    nsp--;
                    nst = nst + 2;
                }else {
                    nsp++;
                    nst = nst - 2;
                }
                System.out.println();
            }
        }

    }
}