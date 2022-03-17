public class MatrixDescrypt {
   static String  DescMatrix(String word, int[] key)
    {
        int N=key.length;
        char[][] table=new char[N][N];
        char[][] decrypted=new char[N][N];
        int[] key2=new int [N];
        String decryptWord=" ";
        int position=0;
        int index=N;
        for(int i=0; i<N; i++)
        {
            if(index>0)
            {
                key2[i]=key[index-1];
                index--;
            }


        }
       return MatrixEnsctypt.EncryptMatrix(word, key2);
    }
}
