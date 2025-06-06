package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

  private int codice;
  private String nome;
  private String descrizione;
  private float prezzo;
  private int iva;

  // constructor
  public Prodotto(String nome, String descrizione, float prezzo, int iva) {

    Random random = new Random();
    this.codice = random.nextInt(1000);
    this.nome = nome;
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    this.iva = iva;
  }

  // second constructor
  public Prodotto(String nome, String descrizione, float prezzo) {

    Random random = new Random();
    this.codice = random.nextInt(1000);
    this.nome = nome;
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    this.iva = 22;
  }

  // getters and setters
  public int getCodice() {
    return this.codice;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescrizione() {
    return this.descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  public float getPrezzo() {
    return this.prezzo;
  }

  public void setPrezzo(float prezzo) {
    this.prezzo = prezzo;
  }

  public int getIva() {
    return this.iva;
  }

  public void setIva(int iva) {
    this.iva = iva;
  }

  // other methods
  public float getPrezzoWithIva() {
    float getIva = (this.prezzo * this.iva) / 100;

    return (this.prezzo + getIva);
  }

  public String getNomeEsteso() {

    return codice + "-" + nome;
  }

}
