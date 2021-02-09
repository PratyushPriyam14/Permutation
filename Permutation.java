import java.util.*;
//using function
public class Permutation {
    public static void display(int n,int r,int npr) {
        System.out.println(n + "P" + r + "=" + npr);
    }
    public static int Fact(int n){
        int rv=1;
        for(int i=1;i<=n;i++){
            rv=rv*i;
        }
        return rv;
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        int nfact=Fact(n);
        int nmrfact=Fact(n-r);
        int npr=nfact/nmrfact;
        display(n,r,npr);
    }
}
