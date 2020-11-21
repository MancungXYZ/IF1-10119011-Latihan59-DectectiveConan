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
public class Conan {
    protected String nama, tugas, gender;
    
    public Conan (String nama, String tugas, String gender) {
        this.nama = nama;
        this.tugas = tugas;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public String getTugas() {
        return tugas;
    }

    public String getGender() {
        return gender;
    }
    
    public void tokoh () {
        System.out.println("Nama\t\t : " + nama);
        System.out.println("Tugas\t\t : " + tugas);
        System.out.println("Gender\t\t : " + gender);
    }
}
