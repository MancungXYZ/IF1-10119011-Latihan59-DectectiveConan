/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan59.conan;

/**
 *
 * @author
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF1
 *  Nim     : 10119011
 */
public class Outfit extends Conan{
    private String pakaian, warna;
    
    public Outfit (String nama, String tugas, String gender, String pakaian, String warna) {
        super(nama, tugas, gender);
        this.pakaian = pakaian;
        this.warna = warna;
    }

    public String getPakaian() {
        return pakaian;
    }

    public String getWarna() {
        return warna;
    }
    
    
    public void pakaian () {
        System.out.println("Pakaian\t\t : " + pakaian);
        System.out.println("Warna Pakaian\t : " + warna);
    }
}
