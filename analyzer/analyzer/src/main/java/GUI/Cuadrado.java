package GUI;

import javax.swing.JButton;

public class Cuadrado extends JButton {

    private int numeroFila;
    private int numeroColumna;
    private String tipo;
    private cuadroInformativo informacion;

    public Cuadrado() {

    }

    public Cuadrado(int numeroFila, int numeroColumna, String tipo) {
        this.numeroFila = numeroFila;
        this.numeroColumna = numeroColumna;
        this.tipo = tipo;
    }

    public Cuadrado(int numeroFila, int numeroColumna) {
        this.numeroFila = numeroFila;
        this.numeroColumna = numeroColumna;
        this.informacion = new cuadroInformativo(numeroFila, numeroColumna);
    }

    public cuadroInformativo getCuadro() {
        return this.informacion;
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }

    public int getNumeroColumna() {
        return numeroColumna;
    }

    public void setNumeroColumna(int numeroColumna) {
        this.numeroColumna = numeroColumna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
