package com.rizkykhapidsyah.javafundamental.casting;

public class Variabel {
    public static void main(String[] args) {
        /*
            Untuk menggunakan casting di dalam Java, cukup deklarasikan tipe data yang baru di dalam statement asignment.
            Seperti contoh berikut ini :
         */
        int variabel_a = (int) 3.14;
        System.out.println(variabel_a);

        /*
            Kita dapat melakukan casting terhadap beberapa tipe data. Bagaimana jika kita akan melakukan casting dari int ke
            dalam bentuk string? Dengan cara mendeklarasikan variabel sebagai String dan menggunakan fungsi String.valueOf
            Contohnya seperti berikut :
        */
        double variabel_b = 4.65;
        String Hasil = String.valueOf(variabel_b);
        System.out.println(Hasil);

        //Perlu diingat bahwa hasil dari output variabel_b tersebut bukanlah lagi double melainkan sudah menjadi String.
    }
}
