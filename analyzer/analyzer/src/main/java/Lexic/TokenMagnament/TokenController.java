package Lexic.TokenMagnament;

import Lexic.StatesMagtnament.SymbolController;

@lombok.Getter
@lombok.Setter
public class TokenController {

    private String text;
    private int rowCount = 1;
    private int colCount = 1;
    private char[] textAtChar;
    private String lex = "";
    private Token token;
    private TokenBag tokenBag;
    private SymbolController symbolController = new SymbolController();

    public TokenController(TokenBag tokenBag) {
        this.tokenBag = tokenBag;
    }

    public void initParser(String text) {
        this.text = text + " ";                            //agregamos un salgo de linea final en caso de que no se indique final de linea
        this.textAtChar = this.text.toCharArray();  // convertimos la cadena de texto a un arreglo de caracteres
        if (textAtChar.length > 1) {                    //leemos siempre y cuando exista al menos un caracter
            readChars();
        }
        System.out.println("hola");
    }

    public void readChars() {

        char symbolChar;

        for (int i = 0; i < this.textAtChar.length; i++) {

            symbolChar = textAtChar[i];//leemos caracter a caracter
            colCount++;                     // aumentamos conteo de columnas al avanzar en el arreglo de caracteres

            if (symbolChar == '\n') {
                rowCount++;             // aumentamos una fila al saltar de linea
                colCount = 1;           // reseteamos el conteo de columnas al saltar de linea
            }

            if (!esAdmitido(symbolChar)) {       //evaluamos si se encuentra en un estado de finalizacion de token
                lex += symbolChar;                                          //agregamos el caracter al token que estamos leyendo
            } else {
                if (symbolController.isReservedWord(lex)) {
                    sendToken(symbolController.foundedToken);
                } else {
                    sendToken();
                }
                lex = "";
                if (symbolChar != ' ' && symbolChar != '\n' && symbolChar != '\t') {
                    lex += symbolChar;
                }
            }
        }

        textAtChar = "".toCharArray();                              //limpiamos el arreglo de caracteres al finalizar la lectura
    }

    public void clearTokens() {
        tokenBag.clearBag();
        this.colCount = 1;
        this.rowCount = 1;
    }

    private boolean esAdmitido(char c) {
        char[] chars = {',', '{', '}', '[', ']', '(', ')', ' ', '\n', '\t'};

        for (char aChar : chars) {
            if (c == aChar) {
                return true;
            }
        }

        return false;
    }

    private void sendToken() {

        if (!lex.equals("") && !lex.equals(" ") && !lex.equals("\n")) {  //siempre que el lex que guardamos sea diferente a una cadena vacia
            tokenBag.saveToken(new Token(lex, rowCount, colCount));
        }
    }

    private void sendToken(ReserverdToken tk) {

        if (!lex.equals("") && !lex.equals(" ") && !lex.equals("\n")) {  //siempre que el lex que guardamos sea diferente a una cadena vacia
            tokenBag.saveToken(new Token(tk, rowCount, colCount));
        }
    }

}
