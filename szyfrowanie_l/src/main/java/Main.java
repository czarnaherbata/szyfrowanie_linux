import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Wprowadz slowo: ");
//        String word=s.nextLine();
//        System.out.println("Wprowadz kod:");
//        int key1=s.nextInt();
//       // int key2 =s.nextInt();
//        FenceEncrypt.EncryptFence(word, key1);
//       // FenceDesc.DescFence(word, key1);
        Scanner s=new Scanner(System.in);
        System.out.println("Wprowadz slowo: ");
        String word=s.nextLine();
        System.out.println("Wpisz dlugosc klucza:");
        int lenght=s.nextInt();
        int key[]=new int[lenght];

        System.out.println("Wpisz klucz:");
        for(int i=0; i<lenght;i++)
        {

               int k=s.nextInt();
               key[i]=k;

        }
        for(int i=0;i<lenght;i++)
        System.out.println(key[i]);
        MatrixEnsctypt.EncryptMatrix(word, key);


    }




}
