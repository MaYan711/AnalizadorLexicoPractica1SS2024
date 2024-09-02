package GUI.InterfaceMagnament;

import Lexic.TokenMagnament.Token;
import javax.swing.JButton;


@lombok.Getter
@lombok.Setter
public class TokenDrawer extends JButton {

    private Token token;

    public TokenDrawer() {
    }

    public TokenDrawer(Token token) {
        super(token.getTokenSymbol());  //configuramos el texto del boton segun el valor del token

        this.setBackground(new java.awt.Color(102, 102, 102));  //configuramos colores del boton
        this.setForeground(new java.awt.Color(153, 255, 153));

        this.token = token;
    }

}
