public class MatrixEnsctypt {
    static String EncryptMatrix(String word, int[] key)
    {
        int N=key.length;
        char[][] table=new char[N][N];
        char[][] encrypted=new char[N][N];
        String encryptWord=" ";
        int position=0;

        for(int i=0; i<N; i++)
        {
            for(int j=0;j<N;j++)
            {
                if(position<word.length())
                table[i][j]=word.charAt(position++);
            }
        }

//        for(int i=0; i<N; i++)
//        {
//            for(int j=0;j<N;j++)
//            {
//               System.out.print(table[i][j]);
//            }
//            System.out.println(" ");
//        }
        int k=0;
        for(int i=0; i<N ;i++)
        {
            for (int j=0 ; j<N;j++)
            {
                if( table[i][j]!=' ' && k<N){

                    encrypted[i][j]+=table[i][key[k]-1];
                    k++;


                }
               // k=0;
            }
            k=0;
        }
//        for(int i=0; i<N; i++)
//        {
//            for(int j=0;j<N;j++)
//            {
//                System.out.print(encrypted[i][j]);
//            }
//            System.out.println(" ");
//        }
        for(int i=0; i<N; i++)
        {
            for(int j=0;j<N;j++)
            {
                if(encrypted[i][j]!=' ')
                encryptWord+=encrypted[i][j];
            }
           // System.out.println(" ");
        }
        System.out.print(encryptWord);
        return encryptWord;
    }
}
