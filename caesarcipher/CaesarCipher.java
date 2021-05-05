package caesarcipher;

import java.util.Scanner;
public class CaesarCipher{
    public void encrypt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Plain Text:");
        String plainText = input.nextLine().toLowerCase();
        System.out.println("Enter the key (1 to 25):");
        int shift = input.nextInt();
        char[] ptar = plainText.toCharArray();
        for(int i=0;i<ptar.length;i++){
            int t = ptar[i] - 96; // a=1 z=26 ascii 97 to 122
            t = (t+shift) % 26;
            if (t<=0){t=t+26;}
            ptar[i] = (char) (t+96);
            System.out.print(ptar[i]);
        }
        input.close();
        System.out.println("");
        decrypt(ptar,shift);
    }
    public void decrypt(char[] ptar,int shift) {
        System.out.println("Decryption:");
        for(int i=0;i<ptar.length;i++){
            int t = ptar[i] - 96; 
            t = (t+shift*(-1)) % 26;
            if (t<=0){t=t+26;}
            ptar[i] = (char) (t+96);
            System.out.print(ptar[i]);
        }
        System.out.println("");
    }
}
