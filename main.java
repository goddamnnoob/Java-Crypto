//import monoalphabeticcipher.MonoAlphabeticCipher;
//import caesarcipher.*;
//import affinecipher.*;
//import vigenerecipher.*;
import vernamcipher.*;
class Main {
    public static void main(String[] args) {
        //MonoAlphabeticCipher m = new MonoAlphabeticCipher();
        //CaesarCipher c = new CaesarCipher();
        //AffineCipher a = new AffineCipher();
        //VigenereCipher v = new VigenereCipher();
        VernamCipher v = new VernamCipher();
        v.encrypt();
    }
}