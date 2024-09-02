package Lexic.TokenMagnament;

import Enums.TokenTypes;
import java.util.ArrayList;

@lombok.Getter
@lombok.Setter
public class TokenBag {

    private final ArrayList<Token> tokens;
    private final ArrayList<Token> unreconogizedTokens;
    private String report;

    public TokenBag() {     //iniciamos las arraylist por medio del constructor sin parametros
        tokens = new ArrayList<>();     
        unreconogizedTokens = new ArrayList<>();
    }

    public void saveToken(Token token) {        
        if (token.getTokenTipo() != TokenTypes.DESCONOCIDO.ordinal()) {  // si el token obtenido es un token reconocido lo guardamos en un arraylist especifico
            tokens.add(token);
            System.out.println("se agrego el token\n" + token);
        } else {
            unreconogizedTokens.add(token);             // los tokens fuera del lenguaje los guardamos en un arraylist especifico
            tokens.add(token);
            System.out.println("token desconocido");
        }
    }

    public String mostrarTokensIrreconocibles(){
        report += "\n--- Tokens no reconocidos ---\n";

        for (Token unrecTonk : unreconogizedTokens) {
            report +=  "[ " +unrecTonk.getTokenSymbol() + " ] " + " en la linea: " + unrecTonk.getRow() + "\n";
        }

        return report;
    }
    
    public void clearBag() {

        try {
            do {
                tokens.remove(tokens.size() - 1);       //limpiamos la arraylist hasta que este vacia

            } while (!tokens.isEmpty());

            do {
                unreconogizedTokens.remove(unreconogizedTokens.size() - 1);  //limpiamos la arraylist hasta que este vacia

            } while (!unreconogizedTokens.isEmpty());
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public ArrayList<Token> groupTokens(int tokenType) {

        ArrayList<Token> specificTokenTypeGroup = new ArrayList<>();    //creamos una arraylist nueva que sera para agrupar tokens segun su tipo agrupable

        return specificTokenTypeGroup;
    }
    
    public int groupSize(int tokenType) {       

        return groupTokens(tokenType).size() + 1;       //obtenemos la longitud de una lista de tokens de un tipo especifico

    }
}
