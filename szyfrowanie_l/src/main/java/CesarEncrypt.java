import java.lang.reflect.Array;
import java.util.ArrayList;

public class CesarEncrypt {
    static String EncryptCesar(String word, int key)
    {
        Character[] alphabetLow = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Character[] alphabetUp = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        char character;
        String encryptedWord=" ";
        char[] tab=new char[word.length()];
       // int k=0;


        for(int i=0; i<word.length();i++)
        {
            for(int j=0; j<alphabetLow.length;j++)
            {
                if(word.charAt(i)==alphabetLow[j])
                {
                    encryptedWord+=alphabetLow[(j+key)%26];
                }
                if(word.charAt(i)==alphabetUp[j])
                {
                    encryptedWord+=alphabetUp[(j+key)%26];
                }
            }
        }
//
        System.out.println(encryptedWord);
        return encryptedWord;
    }
}
