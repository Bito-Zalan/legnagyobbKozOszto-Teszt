package tesztcsomag;

import csomag.MitCsinal;


public class TesztMitcsinal {
    
    public static void main(String[] args) {
        tesztesetek();
    }

    private static void tesztesetek() {
        lnKozOTeszt();
    }

    private static void lnKozOTeszt() {
        vanKozOszto();
        nincsKozOszto();
        egyikSzam0();
        egyikSzamMinusz();
    }

    private static void vanKozOszto() {
        String eset = "9,12 -> 3";
        System.out.println("Van legnagyobb közös osztó: " + eset);
        int a = 9;
        int b = 12;
        int kapott = MitCsinal.fuggveny(a, b);
        int vart = 3;
        assert kapott == vart:"Hiba: vanKozOszto ";
    }
    
     private static void nincsKozOszto() {
        String eset = "3,5 -> 1";
        System.out.println("Nincs közös osztó: " + eset);
        int a = 3;
        int b = 5;
        int kapott = MitCsinal.fuggveny(a, b);
        int vart = 1;
        assert kapott == vart:"Hiba: nincsKozOszto";
    }

    private static void egyikSzam0() {
        String eset = "0,5 -> 0";
        System.out.println("Egyik szám 0: " + eset);
        int a = 0;
        int b = 5;
        int kapott = MitCsinal.fuggveny(a, b);
        int vart = 0;
        assert kapott == vart:"Hiba: egyikSzam0";
    }

    private static void egyikSzamMinusz() {
        String eset = "3,-1 -> -1";
        System.out.println("Egyik szám kissebb mint 0: " + eset);
        int a = 3;
        int b = -1;
        int kapott = MitCsinal.fuggveny(a, b);
        int vart = -1;
        assert kapott == vart:"Hiba: egyikSzamMinusz";
    }

   
        
    
}
