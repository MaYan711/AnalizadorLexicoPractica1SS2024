package GUI.InterfaceMagnament;

import Lexic.GraphMagnament.GraphvizController;
import Lexic.TokenMagnament.Token;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class TokenizerGraph {

    public JButton buttonGrapher(Token token, JScrollPane toGrPanel, JLabel toGraphLabel, JDialog jDialog) { //creamos el boton que formara parte del panel para mostrar
        
//        TokenDrawer tokenDropper = new TokenDrawer(token);
//
//
//        tokenDropper.addMouseListener(new java.awt.event.MouseAdapter() { 
//            //agregamos la actividad que tendra el boton al darle click
//            @Override
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                
//                System.out.println(gc.getTknDOT());
//     
//                setGraph(toGraphLabel, toGrPanel, token);
//                jDialog.pack(); //configuramos el jdialog para que se acomode al tamaño de la imagen seteada
//                jDialog.setLocationRelativeTo(null);    //configuramos para que siemrpe quede centrado en la pantalla
//            }
//        });
//
//        return tokenDropper;
//    }
//
//    public void setGraph(JLabel toGrLabel, JScrollPane toGrPanel, Token token) {
//
//        //configuramos el grafico en el lugar requerido
//        
//        toGrLabel.setIcon(null);
//        String ruta = System.getProperty("user.dir") + "/"+token.getTokenSymbol()+".png";
//        ImageIcon imageIcon = new ImageIcon(ruta);
//        toGrLabel.setIcon(imageIcon);
        return null;
    }

}
