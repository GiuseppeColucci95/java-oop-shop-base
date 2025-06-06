package org.lessons.java.shop;

public class Main {

  public static void main(String[] args) {

    Prodotto telefono = new Prodotto("iPhone", "Smartphone di alto livello", 1499.99f, 22);
    Prodotto pc = new Prodotto("MacBook Pro", "laptop da utilizzare per lavoro", 2999.99f, 23);

    System.out.println(telefono.codice);
    System.out.println(telefono.nome);
    System.out.println(telefono.descrizione);
    System.out.println(telefono.prezzo);
    System.out.println(telefono.iva);

    System.out.println(telefono.getPrezzo());
    System.out.println(telefono.getPrezzoWithIva());
    System.out.println(telefono.getNomeEsteso());

    System.out.println(pc.codice);
    System.out.println(pc.nome);
    System.out.println(pc.descrizione);
    System.out.println(pc.prezzo);
    System.out.println(pc.iva);

    System.out.println(pc.getPrezzo());
    System.out.printf("%.2f\n", pc.getPrezzoWithIva());
    System.out.println(pc.getNomeEsteso());
  }
}
