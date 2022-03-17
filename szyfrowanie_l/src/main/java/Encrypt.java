import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Wprowadz slowo: ");
        String word=s.nextLine();
        System.out.println("Wprowadz kod:");
        int key=s.nextInt();
          EncryptFence(word, key);
       // DescFence(word, key);
        
    }

    static String EncryptFence(String word, int key)
    {
        String enctyptWord="";
        int position=0;
        boolean directionDown=false;// czy poruszamy sie w dol czy w gore
        int x=key; //ilosc wierszy
        int y=word.length(); //ilosc kolumn

        char[][] fence=new char[x][y]; //tablica na ktorej szygrujemy
        for(int i=0; i<x; i++)
        {
            for (int j=0; j<y;j++)
            {
                fence[i][j]='0'; //poczatkowo wypelniam tablice 0 bo tak mi wygodniej

            }
            System.out.println();
        }

        for(int i=0; i<y;i++)
        {
            if(position==0 || position==key-1) //jesli jestem w pierzym lub ostanim rzecie macierzy
            {
                directionDown=!directionDown;//zmieniam pozycje z gory na dol albo odwrotnie
            }

            fence[position][i]=word.charAt(i);//wpisuje sobie znaczki

            if(directionDown)//jak ide w dol to numer rzedu rosnie
            {
                position++;
            }
            else //a jak do gory to maleje
            {
                position--;
            }
        }
        for(int i=0; i<x; i++)
        {
            for (int j=0; j<y;j++)
            {
                if(fence[i][j]!='0')
                    System.out.print(fence[i][j] + " ");

            }
        }
        return enctyptWord;
    }

    static String DescFence(String word, int key)
    {
//
        String descryptWord="";
        int position=0;
        boolean directionDown=false;// czy poruszamy sie w dol czy w gore
        int x=key; //ilosc wierszy
        int y=word.length(); //ilosc kolumn

        char[][] fence=new char[x][y]; //tablica na ktorej szygrujemy

        for(int i=0; i<x; i++)
        {
            for (int j=0; j<y;j++)
            {
                fence[i][j]='0'; //poczatkowo wypelniam tablice 0 bo tak mi wygodniej

            }
            System.out.println();
        }

        for(int i=0; i<y;i++)
        {
            if(position==0 || position==key-1) //jesli jestem w pierzym lub ostanim rzecie macierzy
            {
                directionDown=!directionDown;//zmieniam pozycje z gory na dol albo odwrotnie
            }

            fence[position][i]='*';//wpisuje sobie znaczki

            if(directionDown)//jak ide w dol to numer rzedu rosnie
            {
                position++;
            }
            else //a jak do gory to maleje
            {
                position--;
            }
        }
       // position=0;
       // directionDown=false;
//        for(int i=0; i<x;i++)
//        {
//            for (int j=0; j<y; j++)
//            {
//                System.out.print(fence[i][j]);
//            }
//            System.out.println(" ");
//        }
        int p=0;
        for(int i=0; i<x; i++)
        {
            for(int j=0;j<y;j++)
                if(fence[i][j]=='*' && p<y )
                {
                    fence[i][j]=word.charAt(p++);

                }
        }
//        for(int i=0; i<x; i++)
//        {
//            for(int j=0; j<y;j++)
//            {
//                System.out.print(fence[i][j]);
//            }
//
//            System.out.println(" ");
//        }
        directionDown=false;
        position=0;
        for(int i=0; i<y;i++)
        {
            if(position==0 || position==key-1) //jesli jestem w pierzym lub ostanim rzecie macierzy
            {
                directionDown=!directionDown;//zmieniam pozycje z gory na dol albo odwrotnie
            }

            descryptWord+=fence[position][i];//wpisuje sobie znaczki

            if(directionDown)//jak ide w dol to numer rzedu rosnie
            {
                position++;
            }
            else //a jak do gory to maleje
            {
                position--;
            }
        }
    System.out.print(descryptWord);
        return descryptWord;
        //return null;
    }

}
