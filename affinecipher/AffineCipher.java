package affinecipher;
import java.util.Scanner;
public class AffineCipher {
    //E(x) = (ax + b) mod m
    public void encrypt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Plain Text:");
        char[] ptar = input.nextLine().toCharArray();
        char[] ctar = new char[ptar.length];
        System.out.println("Enter key 'a': ");
        int a = input.nextInt();
        System.out.println("Enter the shift:");
        int b =input.nextInt();
        if( gcd(a, 26) != 1){
            System.out.println("a and m are not coprimes:");
        }
        else{
            for(int i=0;i<ptar.length;i++){
                int x = ptar[i] - 'a';
                x = (a*x + b) % 26;
                if(x <0){
                    x = x+26;
                }
                ctar[i] = (char)(x + 'a');
                System.out.print(ctar[i]);
            }
        }
        input.close();
        System.out.println("");
        decrypt(ctar,a,b);

    }
    public int gcd(int a,int b){
        int r = 0;
        while(b % a !=0 ){
            r = b % a;
            b = a;
            a = r;
        }
        return r;
    }
    public void decrypt(char[] ctar,int a,int b){
        
        //D(x) = a^-1 (x-b) mod m
        //aa^-1 mod m = 1
        System.out.println("Decryption:");
        int ainv =0;
        for(int i =0;i<25;i++){
            if((i*a) % 26 == 1){
                ainv = i;
            }
        }
        for(int i=0;i<ctar.length;i++){
            int x = ctar[i] - 'a';
            x = ainv*(x-b) % 26;
            if(x<0){
                x = x+26;
            }
            System.out.print((char)(x+'a'));
        }
    }
}
