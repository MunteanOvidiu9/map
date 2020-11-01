public class pr124 {
    public static void main(String[] args) {
        int [] Array3 = {3,5,8,9,10,1,22,7,13};
        int [] Noten = {14,64,15,22,33,40,54,60};
        int [] Tastatur = {40,35,70,15,45};
        int Buget = 120;
        int [] USB = {20,15,40,15};

        //Problem 1
        nichtausreichendeNoten(Noten);
        durchnitt(Noten);
        abgerundet(Noten);
        maximaleabgerundet(Noten);

        //Problem2
        maxim(Array3);
        minim(Array3);
        maxsum(Array3); // 77
        minsum(Array3); // 56

        //Problem4
        billigsteTastatur(Tastatur);
        teursteGegenstand(Tastatur, USB);
        teuersteUSBBuget(USB, Buget);
        beidekaufen( Buget, Tastatur, USB);
    }

    private static void nichtausreichendeNoten(int [] Array){
        int j = 0;
        int Array2[]=new int[100];
        for ( int i = 0; i < Array.length; i++)
            if ( Array[i] < 40)
            {
                Array2[j] = Array[i];
                j++;
            }
        System.out.print("Nicht ausreichende Noten: ");
        for (int k=0;k< Array2.length;k++)
            if(Array2[k]!=0)
                System.out.println(Array2[k]);

    }

    private static void durchnitt(int [] Array){
        int sum=0;
        int d=0;
        for (int i = 0; i< Array.length;i++)
            sum=sum + Array[i];
        d= sum/ Array.length;
        System.out.println("Durchnittswert: ");
        System.out.println(d);
    }

    private static void abgerundet(int [] Array){
        int j = 0;
        int k=0;
        int Array2[]=new int[100];
        for (int i=0;i< Array.length;i++){
            {
                if ((Array[i] + 2) % 5 == 0) {
                    Array2[j] = Array[i] + 2;
                    j++;
                }
                if ((Array[i] + 1) % 5 == 0) {
                    Array2[j] = Array[i] + 1;
                    j++;
                }
                if ((Array[i] + 2) % 5 != 0 && (Array[i] + 1) % 5 != 0){
                    Array2[j] = Array[i];
                    j++;
                }
            }
        }
        System.out.print("Abgerundete Noten: ");
        for (k=0;k< Array2.length;k++)
            if(Array2[k]!=0)
                System.out.println(Array2[k]);
    }

    private static void maximaleabgerundet(int [] Array){
        int max=0;
        for (int i=0;i< Array.length;i++) {
            if (((Array[i] + 2) % 5 == 0) && (Array[i] + 2 > max))
                max = (Array[i] + 2);
            if (((Array[i] + 1) % 5 == 0) && (Array[i] + 1 > max))
                max = (Array[i] + 1);
        }
        System.out.println("Maximale abgerundete Note: ");
        System.out.println(max);
    }

    private static void maxim(int [] Array){
        int max=0;
        for (int i=0;i< Array.length;i++)
            if (Array[i]>max)
                max=Array[i];
        System.out.println("Maxim: ");
        System.out.println(max);
    }

    private static void minim(int [] Array){
        int min=Array[0];
        for ( int i=1;i< Array.length;i++)
            if (Array[i]<min)
                min=Array[i];
        System.out.println("Minim: ");
        System.out.println(min);
    }

    private static void maxsum(int [] Array){
        int sum=0;
        int min=Array[0];
        for ( int i=1;i< Array.length;i++)
            if (Array[i]<min)
                min=Array[i];
        for ( int j=0;j< Array.length;j++)
            if(Array[j]!=min)
                sum=sum+Array[j];
        System.out.println("Max Summe: ");
        System.out.println(sum);
    }

    private static void minsum(int [] Array){
        int sum=0;
        int max=0;
        for ( int i=0;i< Array.length;i++)
            if (Array[i]>max)
                max=Array[i];
        for ( int i=0;i< Array.length;i++)
            if(Array[i]!=max)
                sum=sum+Array[i];
        System.out.println("Min Summe: ");
        System.out.println(sum);
    }

    private static void billigsteTastatur(int [] Array){
        int min=Array[0];
        for ( int i=1;i< Array.length;i++)
            if (Array[i]<min)
                min=Array[i];
        System.out.println("Billigste Tastatur: ");
        System.out.println(min);
    }

    private static void teursteGegenstand(int [] Array, int [] Array2){
        int max1=0;
        int max2=0;
        for ( int i=0;i< Array.length;i++)
            if (Array[i]>max1)
                max1=Array[i];
        for ( int j=0;j< Array2.length;j++)
            if (Array2[j]>max2)
                max2=Array2[j];
        System.out.println("Teuerste Gegenstand: ");
        if ( max1 > max2)
            System.out.println(max1);
        else
            System.out.println(max2);
    }

    private static void teuersteUSBBuget(int [] Array, int Buget){
        int max=0;
        for (int j=0;j<Array.length;j++)
            if (Array[j]>max && Array[j]<=Buget)
                max=Array[j];
        System.out.println("Teuerste USB Markus kaufen kann: ");
        System.out.println(max);
    }

    private static void beidekaufen( int Buget, int [] Array, int [] Array2){
        int max1=0;
        int max2=0;
        for ( int i=0;i< Array.length;i++)
            if (Array[i]>max1)
                max1=Array[i];
        for ( int j=0;j< Array2.length;j++)
            if (Array2[j]>max2)
                max2=Array2[j];

            System.out.println("Preis fur USB und Tastatur: ");
        if ( max1 + max2 <= Buget)
            System.out.println(max1+max2);
        else
            System.out.println(-1);

    }
}

