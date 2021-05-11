package vigenerecipher;
import java.util.Scanner;

public class VigenereCipher {

    public void encrypt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter PlainText:");
        String pt = input.nextLine();
        System.out.println("Enter key:");
        String key = input.nextLine();
        createSquareTable();
    }
    private void createSquareTable(){
        char[][] sqtbl = new char[27][27];
        for(int i=1;i<=26;i++){
            sqtbl[0][i] = (char) (( i - 1 ) + 'a');
            sqtbl[i][0] = (char) (( i - 1 ) + 'a');
            for(int j=1;j<=26;j++){
                sqtbl[i][j] = (char) ('a' + ( ((sqtbl[i][0] - 'a') + (j - 1)) % 26 ));
            }
        } 
    }
}
