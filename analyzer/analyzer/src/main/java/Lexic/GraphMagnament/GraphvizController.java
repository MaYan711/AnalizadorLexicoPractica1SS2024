package Lexic.GraphMagnament;

import Lexic.TokenMagnament.Token;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GraphvizController {

    private Token token;
    private String FinalRoute;

    public GraphvizController() {
    }

    public GraphvizController(Token token) {
        this.token = token; //obtenemos token a graficar por medio del constructor
    }

    public String getTknDOT() {
        //desglosamos el symbolo del token leido preparandolo para agregarlo al archivo .dot
        char[] tknSymbs = this.token.getTokenSymbol().toCharArray();
        String tknToGraph = "S0->";
        for (int i = 0; i < tknSymbs.length; i++) {
            if (i != (tknSymbs.length - 1)) {
                tknToGraph += tknSymbs[i] + "->"; //agregamos letra y preparamos para la entrada de la siguiente
            } else {
                tknToGraph += tknSymbs[i]; //agregamos letra final 
            }
        }
        return tknToGraph;
    }

    private String getTknGraph(String tknSymb) {

        // creamos el archivo dot para la creacion de los graficos
        String txt = "digraph G\n"
                + "{\n"
                + "     node [style = filled]\n"
                + "     node [fillcolor = \"#ffd200\"]\n"
                + "     node [color = \"#a0522d\"]\n"
                + "     edge [color = \"#000000\"]\n";

        txt += getTknDOT();

        txt += "      rankdir = LR;\n"
                + "}";

        return txt;
    }

    private void dotFileMaker(String contenido) {
        //guardamos el archivo .dot en la carpeta del sistema.
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        String ruta = System.getProperty("user.dir") + "/" +"tkn_grph.dot";

        try {
            fileWriter = new FileWriter(ruta);
            printWriter = new PrintWriter(fileWriter);
            printWriter.write(contenido);
            printWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }

    }

    public void drawGraph(String tknSymb) {

        try {
            //leemos el archivo .dot y creamos el grafico .png en base a ese archivo
            dotFileMaker(getTknGraph(tknSymb));
            String ruta = System.getProperty("user.dir") + "/" +"tkn_grph.dot";
            this.FinalRoute = System.getProperty("user.dir") + "/" + tknSymb + ".png";
            ProcessBuilder processBuilder = new ProcessBuilder("dot", "-Tpng", "-o", this.FinalRoute, ruta);
            Process process = processBuilder.start();
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Gráfico generado");
            } else {
                System.out.println("Error al generar el gráfico.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }

    public String getRuta() {
        return FinalRoute;
    }

}
