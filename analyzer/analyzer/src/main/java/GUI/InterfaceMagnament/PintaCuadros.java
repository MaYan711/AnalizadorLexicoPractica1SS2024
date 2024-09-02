package GUI.InterfaceMagnament;

import GUI.Cuadrado;
import Lexic.TokenMagnament.TokenBag;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PintaCuadros {

    private JPanel panelMatriz;
    private Cuadrado[][] tablero;
    private JFrame ventanaActual;
    private int x, y;

    public PintaCuadros(JPanel panelMatriz) {
        this.panelMatriz = panelMatriz;
    }

    public void configurarMatriz(int x, int y) {
        this.x = x;
        this.y = y;
        panelMatriz.setLayout(new GridLayout(x, y));
        this.tablero = new Cuadrado[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Cuadrado nc = new Cuadrado(i + 1, j + 1);
                tablero[i][j] = nc;

                tablero[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {

                        if (ventanaActual != null || nc.getCuadro().equals(ventanaActual)) {
                            ventanaActual.dispose();
                        }

                        if (nc.getCuadro().equals(ventanaActual)) {
                            ventanaActual = null;
                        } else {
                            nc.getCuadro().setVisible(true);
                            nc.getCuadro().setLocation(evt.getXOnScreen(), evt.getYOnScreen());
                            ventanaActual = nc.getCuadro();
                        }
                    }
                });
            }
        }
        panelMatriz.removeAll();
        setTableroOnPanel();
    }

    public void pintar(TokenBag tb) {

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int index = i * tablero[0].length + j;
                if (index < tb.getTokens().size()) {
                    tablero[i][j].getCuadro().setToken(tb.getTokens().get(index));
                    panelMatriz.add(tablero[i][j]).setBackground(Color.decode(tb.getTokens().get(index).getColor()));
                } else {
                    panelMatriz.add(tablero[i][j]).setBackground(Color.white);
                }
            }
        }

        setTableroOnPanel();
    }

    public void setPanelMatriz(JPanel panelMatriz) {
        this.panelMatriz = panelMatriz;
    }

    public void setTableroOnPanel() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                panelMatriz.add(tablero[i][j]);
            }
        }

        panelMatriz.revalidate();
        panelMatriz.repaint();
    }

}
