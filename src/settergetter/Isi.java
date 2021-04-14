/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settergetter;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Isi {

    public void isiSetGet() {

        //Senin    
        SetterGetter senin = new SetterGetter();
        senin.setJam1("Produktif RPL");
        senin.setJam2("Produktif RPL");
        senin.setJam3("Produktif RPL");
        senin.setJam4("Produktif RPL");

        //Selasa
        SetterGetter selasa = new SetterGetter();
        selasa.setJam1("Seni Budaya");
        selasa.setJam2("Matematika");
        selasa.setJam3("Pend. Agama Islam");

        //Rabu
        SetterGetter rabu = new SetterGetter();
        rabu.setJam1("Pend. Jasmani & Kesehatan");
        rabu.setJam2("Fisika");
        rabu.setJam3("Kimia");

        //Kamis
        SetterGetter kamis = new SetterGetter();
        kamis.setJam1("Dasar Desain Grafis");
        kamis.setJam2("Bahasa Inggris");
        kamis.setJam3("Bahasa Inggris");
        kamis.setJam4("Sejarah Indonesia");

        //Jumat
        SetterGetter jumat = new SetterGetter();
        jumat.setJam1("KJD");
        jumat.setJam2("Bahasa Indonesia");
        jumat.setJam3("Bahasa Indonesia");
        jumat.setJam4("PKN");

        //Scanner
        Scanner input = new Scanner(System.in);

        //Pilihan
        String hari;
        do {    //akan terus terulang jika tidak memasukkan nama hari yang ada
            System.out.print("\nMasukkan Hari: (Senin, Selasa, Rabu, Kamis, Jumat, Sabtu, Minggu)\nPilihan: ");
            hari = input.nextLine();

            //Percabangan
            if (hari.equalsIgnoreCase("senin")) {   //Senin
                System.out.println("\nJam ke-1  : " + senin.getJam1());
                System.out.println("Jam ke-2  : " + senin.getJam2());
                System.out.println("Jam ke-3  : " + senin.getJam3());
                System.out.println("Jam ke-4  : " + senin.getJam4());

            } else if (hari.equalsIgnoreCase("selasa")) {   //Selasa
                System.out.println("\nJam ke-1  : " + selasa.getJam1());
                System.out.println("Jam ke-2  : " + selasa.getJam2());
                System.out.println("Jam ke-3  : " + selasa.getJam3());

            } else if (hari.equalsIgnoreCase("rabu")) { //Rabu
                System.out.println("\nJam ke-1  : " + rabu.getJam1());
                System.out.println("Jam ke-2  : " + rabu.getJam2());
                System.out.println("Jam ke-3  : " + rabu.getJam3());

            } else if (hari.equalsIgnoreCase("kamis")) {    //Kamis
                System.out.println("\nJam ke-1  : " + kamis.getJam1());
                System.out.println("Jam ke-2  : " + kamis.getJam2());
                System.out.println("Jam ke-3  : " + kamis.getJam3());
                System.out.println("Jam ke-4  : " + kamis.getJam4());

            } else if (hari.equalsIgnoreCase("jumat")) {    //Jumat
                System.out.println("\nJam ke-1  : " + jumat.getJam1());
                System.out.println("Jam ke-2  : " + jumat.getJam2());
                System.out.println("Jam ke-3  : " + jumat.getJam3());
                System.out.println("Jam ke-4  : " + jumat.getJam4());

            } else if (hari.equalsIgnoreCase("sabtu") || hari.equalsIgnoreCase("minggu")) { //Sabtu & Minggu
                System.out.println("\nHari Sabtu dan Minggu Libur");

            } else {
                System.out.println("\nNama hari tidak ditemukan");
            }

        } while (!hari.equalsIgnoreCase("senin") && !hari.equalsIgnoreCase("selasa")
                && !hari.equalsIgnoreCase("rabu") && !hari.equalsIgnoreCase("kamis")
                && !hari.equalsIgnoreCase("jumat"));
    }
}
