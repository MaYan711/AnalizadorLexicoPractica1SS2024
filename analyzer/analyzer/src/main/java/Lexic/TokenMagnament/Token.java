package Lexic.TokenMagnament;

import Enums.TokenTypes;

@lombok.Getter
@lombok.Setter
public class Token {

    private String tokenName;
    private String tokenSymbol;
    private String color;
    private int tokenTipo;
    private int row;
    private int col;

    public Token() {
    }

    public Token(String tokenSymbol, int row, int col) {
        this.tokenSymbol = tokenSymbol;
        this.tokenTipo = setTipo(tokenSymbol);
        this.row = row;
        this.col = col;
    }

    public Token(ReserverdToken reserverdToken, int row, int col) {
        this.tokenName = reserverdToken.getName();
        this.tokenSymbol = reserverdToken.getLexema();
        this.color = reserverdToken.getColor() != null ? reserverdToken.getColor() : "#60A917";
        this.tokenTipo = reserverdToken.getTipo();
        this.row = row;
        this.col = col;
    }

    private int setTipo(String token) {

        if (token.charAt(0) == '\"' && token.charAt(token.length() - 1) == '\"') {
            this.tokenName = "cadena";
            this.color = "#E51400";
            return TokenTypes.CADENA.ordinal();
        } else if (token.charAt(0) == '\'' && token.charAt(token.length() - 1) == '\'') {
            this.tokenName = "caracter";
            this.color = "#0050EF";
            return TokenTypes.CARACTER.ordinal();
        } else if (token.charAt(0) == '\'') {
            this.tokenName = "comment";
            this.color = "#3B3B3B";
            return TokenTypes.CARACTER.ordinal();
        }

        char[] cs = token.toCharArray();

        if (Character.isDigit(cs[0])) {
            for (char c : cs) {
                if (Character.isDigit(c) || c == '.') {
                    this.tokenName = "decimal";
                    this.color = "#FFFF88";
                } else if (!Character.isDigit(c)) {
                    this.tokenName = "desc";
                    this.color = "#000000";
                    return TokenTypes.DESCONOCIDO.ordinal();
                }

            }
            
            this.tokenName = "entero";
            this.color = "#1BA1E2";
            return TokenTypes.ENTERO.ordinal();

        } else if (Character.isLetter(cs[0])) {
            for (char c : cs) {
                if (!Character.isLetter(c) && !Character.isDigit(c) && c != '_' && c != '-') {
                    this.tokenName = "desc";
                    this.color = "#000000";
                    return TokenTypes.DESCONOCIDO.ordinal();
                }
            }
            this.tokenName = "identificador";
            this.color = "#FFD300";
            return TokenTypes.IDENTIFICADOR.ordinal();

        }

        this.tokenName = "desc";
        this.color = "#000000";
        return TokenTypes.DESCONOCIDO.ordinal();

    }

}
