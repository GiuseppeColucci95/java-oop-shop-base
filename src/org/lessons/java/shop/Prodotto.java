package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

  public int codice;
  public String nome;
  public String descrizione;
  public float prezzo;
  public int iva;

  // constructor
  public Prodotto(String nome, String descrizione, float prezzo, int iva) {

    Random random = new Random();
    this.codice = random.nextInt(1000);
    this.nome = nome;
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    this.iva = iva;
  }

  public float getPrezzo() {
    return this.prezzo;
  }

  public float getPrezzoWithIva() {
    float getIva = (this.prezzo * this.iva) / 100;

    return (this.prezzo + getIva);
  }

  public String getNomeEsteso() {

    return codice + "-" + nome;
  }

}
