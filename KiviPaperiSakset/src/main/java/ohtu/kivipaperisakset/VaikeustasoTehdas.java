/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

/**
 *
 * @author janantik
 */
public class VaikeustasoTehdas {
    public static Tekoaly asetaVaikeustaso(String vaikeustaso) {
        if(vaikeustaso.equals("a")) {
          //  return new KPSPelaajaVsPelaaja();
        } else if(vaikeustaso.equals("b")) {
            return new yksinkertainenTekoaly();
        } else if(vaikeustaso.equals("c")) {
            return new TekoalyParannettu(20);
        }
        return null;
    }
}
