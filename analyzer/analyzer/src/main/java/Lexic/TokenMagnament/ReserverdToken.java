package Lexic.TokenMagnament;

public class ReserverdToken {

    private String name;
    private String lexema;
    private int tipo;
    private String color;

    public ReserverdToken(String name, String lexema, int tipo, String color) {
        this.name = name;
        this.lexema = lexema;
        this.tipo = tipo;
        this.color = color;
    }

    public ReserverdToken(String name, String lexema, int tipo) {
        this.name = name;
        this.lexema = lexema;
        this.tipo = tipo;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ReserverdToken{" +
                "lexema='" + lexema + '\'' +
                ", tipo=" + tipo +
                '}';
    }

}