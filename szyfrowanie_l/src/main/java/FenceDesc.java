public class FenceDesc {
    static String DescFence(String word, int key)
    {
//
        String descryptWord="";//slowo odszyfrowane
        int position=0; //czy jestemy w pierwszym czy ostatnim rzedzie
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

            fence[position][i]='*';//wpisuje sobie znaczki dla ulatwienia

            if(directionDown)//jak ide w dol to numer rzedu rosnie
            {
                position++;
            }
            else //a jak do gory to maleje
            {
                position--;
            }
        }

        int p=0; //numer literki z zakodowanego slowa
        for(int i=0; i<x; i++)
        {
            for(int j=0;j<y;j++)
                if(fence[i][j]=='*' && p<y ) //jezeli wstawiłam znaczek to jestem na przekatnej
                {                               //musze tam wstawiac literki tak dlugo jak mi sie nie skoncza
                    fence[i][j]=word.charAt(p++);

                }
        }

        directionDown=false;//ustawiam na false aby ponownie przejsc po szlaczku
        position=0;//ustawiam na 0 zeby ponownie przejsx
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
