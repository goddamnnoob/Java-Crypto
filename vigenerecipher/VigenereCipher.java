package vigenerecipher;
import java.util.Scanner;

public class VigenereCipher {
    char[][] sqtbl = new char[27][27];

    public void encrypt(){ 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter PlainText:");
        char[] pt = input.nextLine().toCharArray();
        char[] ct = new char[pt.length];
        char[] key = new char[pt.length];
        System.out.println("Key: ");
        for(int i=0;i<pt.length;i++){
            key[i] = (char) ('a' + i );
            System.out.print(key[i]);
        }
        System.out.println(" ");
        createSquareTable();
        for(int i=0;i<pt.length;i++){
            int r = pt[i] - 'a';
            int c = key[i] - 'a';
            ct[i] = sqtbl[r +1 ][c + 1];
            System.out.print(ct[i]);
        }
        input.close();
        System.out.println("");
        decrypt(ct, key);
    }
    private void createSquareTable(){
        for(int i=1;i<=26;i++){
            sqtbl[0][i] = (char) (( i - 1 ) + 'a');
            sqtbl[i][0] = (char) (( i - 1 ) + 'a');
            for(int j=1;j<=26;j++){
                sqtbl[i][j] = (char) ('a' + ( ((sqtbl[i][0] - 'a') + (j - 1)) % 26 ));
            }
        } 
    }
    public void decrypt(char[] ct,char[] key){
        char[] pt = new char[ct.length];
        for(int i=0;i<ct.length;i++){
            int r = key[i] - 'a';
            for(int c=1;c<27;c++){
                if(sqtbl[r+1][c]==ct[i]){
                    pt[i] = sqtbl[0][c];
                }
            }
            System.out.print(pt[i]);
        }
        System.out.println("");
    }
}
