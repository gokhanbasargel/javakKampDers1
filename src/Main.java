public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String ortaMetin = "İlginizi çekebilir";

        String altMetin = "Vade Süresi";

        System.out.println(ortaMetin);
        System.out.println(altMetin);

        //integer(tam sayılar)

        int vade = 12;

        // double/float(ondalıklı sayılar)

        double dolarDun = 18.20;
        double dolarBugun = 18.20;

        // boolean(doğru yanlış)

        boolean dolarDustuMu = true;

        //if else şart blokları


        String okYonu = "";



        if (dolarBugun <dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);


        }
        else if(dolarBugun>dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else {
            okYonu ="equal.svg";
            System.out.println(okYonu);
        }

        //arrays

        String[] krediler = {
                "Hızlı Kredi",
                "Maaşını Halkbanktan alnalara özel",
                "Mutlu Emekli Kredisi"
        };


        //System.out.println(krediler[0]);
        //System.out.println(krediler[1]);
        //System.out.println(krediler[2]); // Yanlış yazım


        for(int i = 0 ; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }

}

