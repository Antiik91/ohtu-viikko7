package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Pelimuoto> komento = new HashMap<>();
        komento.put("a",  new KPSPelaajaVsPelaaja(VaikeustasoTehdas.asetaVaikeustaso("a"), scanner));
        komento.put("b", new KPSTekoalyPeli(VaikeustasoTehdas.asetaVaikeustaso("b"), scanner));
        komento.put("c", new KPSTekoalyPeli(VaikeustasoTehdas.asetaVaikeustaso("c"), scanner));
        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            Pelimuoto peli = komento.get(vastaus);
            if(peli == null) {
                break;
            }else {
                peli.pelaa();
            }
        }

    }
}
