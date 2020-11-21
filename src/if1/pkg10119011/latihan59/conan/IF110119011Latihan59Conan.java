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
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan59Conan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Tokoh Film Detective Conan===");
        Outfit cna = new Outfit ("Conan", "Penyelidiki", "Laki-laki", "Seragam", "Biru");
        cna.getNama();
        cna.getTugas();
        cna.getNama();
        cna.getPakaian();
        cna.getWarna();
        cna.tokoh();
        cna.pakaian();
        
        System.out.println();
        
        Outfit cna1 = new Outfit ("Ran Mouri", "Penyelidiki", "Perempuan", "Seragam", "Biru");
        cna1.getNama();
        cna1.getTugas();
        cna1.getNama();
        cna1.getPakaian();
        cna1.getWarna();
        cna1.tokoh();
        cna1.pakaian();
        
    }
    
}
