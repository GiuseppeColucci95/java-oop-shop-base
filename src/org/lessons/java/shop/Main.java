package org.lessons.java.shop;

public class Main {

  public static void main(String[] args) {

    Prodotto telefono = new Prodotto("iPhone", "Smartphone di alto livello", 1499.99f, 22);
    Prodotto pc = new Prodotto("MacBook Pro", "Laptop da utilizzare per lavoro", 2999.99f, 23);

    System.out.println(telefono.getCodice());
    System.out.println(telefono.getNome());
    System.out.println(telefono.getDescrizione());
    System.out.println(telefono.getPrezzo());
    System.out.println(telefono.getIva());

    System.out.printf("%.2f\n", telefono.getPrezzoWithIva());
    System.out.println(telefono.getNomeEsteso());

    System.out.println(pc.getCodice());
    System.out.println(pc.getNome());
    System.out.println(pc.getDescrizione());
    System.out.println(pc.getPrezzo());
    System.out.println(pc.getIva());

    System.out.println(pc.getPrezzo());
    System.out.printf("%.2f\n", pc.getPrezzoWithIva());
    System.out.println(pc.getNomeEsteso());
  }
}
