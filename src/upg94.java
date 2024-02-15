public class upg94 {
    public static void main(String[] args) {
        System.out.println("Skriv in belopp i kr");
        double belopp = försök(0);//Kallar på metoden försök för att slumpa ett nummer
        System.out.println("Skriv in ränta i procent (%)");
        double ränta = försök(1);
        System.out.println("Skriv in antal år");
        double år = försök(2);
        System.out.println("Skriv in uttag per år");
        double uttag = försök(3);
        beloppVidUttag(belopp, ränta, år, uttag);
    }

    public static double försök(int i) {
        if (i == 0){
            return Math.random()*10000; //Slumpar beloppet där max är 10000kr
        }
        if (i == 1){
            return Math.random()*20; //Slumpar räntesatsen där max är 20%
        }
        if (i == 2){
            return Math.random()*20; //Slumpar antal år där max år är 20
        }
        if (i == 3){
            return Math.random()*300; //Slumpar uttaget där 300kr är max
        }
        return 0;
    }

    public static double beloppVidUttag (double belopp, double ränta, double år, double uttag) {
        if (uttag > belopp*0.01*ränta) { //kollar om uttaget är för stort
            System.out.println("För stort uttag");
            return 0;
        }
        else {
            System.out.println("    Saldo    ||    år");
            System.out.println("-----------------------");
            for (int i=1; i <= år; i++) {
                belopp = belopp + belopp*0.01*ränta - uttag;
                System.out.format("%8.2f kr  || %3d år\n" ,belopp,i);
            }
        }
        return belopp;
    }
}