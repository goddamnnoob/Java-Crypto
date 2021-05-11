package vigenerecipher;
import java.util.Scanner;

public class VigenereCipher {

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
        char[][] sqtbl = createSquareTable();
        for(int i=0;i<pt.length;i++){
            int r = pt[i] - 'a';
            int c = key[i] - 'a';
            ct[i] = sqtbl[r +1 ][c + 1];
            System.out.print(ct[i]);
        }
        input.close();
    }
    private char[][] createSquareTable(){
        char[][] sqtbl = new char[27][27];
        for(int i=1;i<=26;i++){
            sqtbl[0][i] = (char) (( i - 1 ) + 'a');
            sqtbl[i][0] = (char) (( i - 1 ) + 'a');
            for(int j=1;j<=26;j++){
                sqtbl[i][j] = (char) ('a' + ( ((sqtbl[i][0] - 'a') + (j - 1)) % 26 ));
            }
        } 
        return sqtbl;
    }
}
