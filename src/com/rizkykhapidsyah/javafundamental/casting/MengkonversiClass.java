package com.rizkykhapidsyah.javafundamental.casting;

public class MengkonversiClass {
    public static void main(String[] args) {
        Kucing anggora = new Kucing();

        Hewan hewan = anggora; //Secara Implisit adalah Upcasting
        hewan = (Hewan) anggora; ////secara explisit melakukan casting dari subclass ke superclass

        Hewan hewan2 = new Kucing();
        ((Kucing) hewan2).Meow();  //downcast hewan ke kucing, casting dari superclass ke subclass
    }
}
