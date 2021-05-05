package monoalphabeticcipher;
import java.util.Scanner;

public class MonoAlphabeticCipher {
    String original = "abcdefghijklmnopqrstuvwxyz";
    char[] o = original.toCharArray();
    String substitution = "qwertyuiopasdfghjklzxcvbnm";
    char[] s = substitution.toCharArray();
    Scanner input = new Scanner(System.in);
    public void encrypt(){
        System.out.println("Enter the Plain Text:");
        char[] ptar = input.nextLine().toCharArray();
        char[] ctar = new char[ptar.length];
        for(int i=0;i<ptar.length;i++){
            for(int j=0;j<o.length;j++){
                if(o[j]==ptar[i]){
                    System.out.print(s[j]);
                    ctar[i] = s[j]; 
                }
            }
        }
        input.close();
        System.out.println("");
        decrypt(ctar);
    }
    public void decrypt(char[] ctar){
        System.out.println("Decryption:");
        for(int i=0;i<ctar.length;i++){
            for(int j=0;j<s.length;j++){
                if(ctar[i]==s[j]){
                    System.out.print(o[j]);
                }
            }
        }
    }
}
