package GUI;

import GUI.InterfaceMagnament.PintaCuadros;
import GUI.InterfaceMagnament.UserInterfaceMagnament;
import Lexic.FilesMagnament.FileController;
import Lexic.TokenMagnament.TokenBag;
import Lexic.TokenMagnament.TokenController;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class AnalyzerMainGUI extends javax.swing.JFrame {

    private final TokenController tokenController = new TokenController(new TokenBag());
    private final UserInterfaceMagnament userInterfaceMagnament = new UserInterfaceMagnament();
    private final FileController fileController = new FileController();
    private LineNumber ln;
    private PintaCuadros pc;

    public AnalyzerMainGUI() {
        initComponents();
        setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(this, "Ingrese la cantidad de filas y columnas que desea");
        ln = new LineNumber(textInsertSection, 3);
        textScrollPane1.setRowHeaderView(ln);
        pc = new PintaCuadros(matrizPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        analyzerPane = new javax.swing.JPanel();
        textScrollPane1 = new javax.swing.JScrollPane();
        textInsertSection = new javax.swing.JTextArea();
        runButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        loadFIle = new javax.swing.JButton();
        infoJLabel = new javax.swing.JLabel();
        reporteButton = new javax.swing.JButton();
        matrizButton = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        matrizPanel = new javax.swing.JPanel();
        filas = new javax.swing.JLabel();
        columnas = new javax.swing.JLabel();
        resultScrollPane2 = new javax.swing.JScrollPane();
        resultsSection = new javax.swing.JTextArea();
        loadFIle1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lexic Analyzer");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        textInsertSection.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                userInterfaceMagnament.cellCount(textInsertSection, infoJLabel);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                userInterfaceMagnament.cellCount(textInsertSection, infoJLabel);

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                userInterfaceMagnament.cellCount(textInsertSection, infoJLabel);

            }

        });
        textInsertSection.setBackground(new java.awt.Color(204, 204, 204));
        textInsertSection.setColumns(20);
        textInsertSection.setLineWrap(true);
        textInsertSection.setRows(5);
        textInsertSection.setTabSize(3);
        textInsertSection.setWrapStyleWord(true);
        textInsertSection.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        textScrollPane1.setViewportView(textInsertSection);

        runButton.setBackground(new java.awt.Color(102, 102, 102));
        runButton.setForeground(new java.awt.Color(153, 255, 153));
        runButton.setText("Analizar");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(102, 102, 102));
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Limpiar");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        loadFIle.setBackground(new java.awt.Color(102, 102, 102));
        loadFIle.setForeground(new java.awt.Color(255, 204, 0));
        loadFIle.setText("Cargar");
        loadFIle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFIleActionPerformed(evt);
            }
        });

        infoJLabel.setForeground(new java.awt.Color(51, 255, 51));
        infoJLabel.setText("Line: Col:");

        reporteButton.setBackground(new java.awt.Color(102, 102, 102));
        reporteButton.setForeground(new java.awt.Color(102, 102, 255));
        reporteButton.setText("REPORTES");
        reporteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteButtonActionPerformed(evt);
            }
        });

        matrizButton.setBackground(new java.awt.Color(102, 102, 102));
        matrizButton.setForeground(new java.awt.Color(102, 102, 255));
        matrizButton.setText("CUADROS?");
        matrizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrizButtonActionPerformed(evt);
            }
        });

        matrizPanel.setLayout(new java.awt.GridLayout(2, 2));
        jScrollPane1.setViewportView(matrizPanel);

        filas.setText("Filas");

        columnas.setText("Columnas");

        resultsSection.setEditable(false);
        resultsSection.setBackground(new java.awt.Color(204, 204, 204));
        resultsSection.setColumns(20);
        resultsSection.setLineWrap(true);
        resultsSection.setRows(5);
        resultsSection.setToolTipText("");
        resultsSection.setWrapStyleWord(true);
        resultScrollPane2.setViewportView(resultsSection);

        loadFIle1.setBackground(new java.awt.Color(102, 102, 102));
        loadFIle1.setForeground(new java.awt.Color(255, 204, 0));
        loadFIle1.setText("Guardar");
        loadFIle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFIle1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout analyzerPaneLayout = new javax.swing.GroupLayout(analyzerPane);
        analyzerPane.setLayout(analyzerPaneLayout);
        analyzerPaneLayout.setHorizontalGroup(
            analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(analyzerPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(analyzerPaneLayout.createSequentialGroup()
                        .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadFIle, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(analyzerPaneLayout.createSequentialGroup()
                                .addGap(781, 781, 781)
                                .addComponent(infoJLabel))
                            .addGroup(analyzerPaneLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(loadFIle1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reporteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(filas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(columnas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(matrizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(analyzerPaneLayout.createSequentialGroup()
                            .addComponent(textScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        analyzerPaneLayout.setVerticalGroup(
            analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, analyzerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadFIle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reporteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filas)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columnas)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadFIle1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(infoJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setForeground(new java.awt.Color(0, 102, 102));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(analyzerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(analyzerPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matrizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizButtonActionPerformed

        try {
            int filas = Integer.parseInt(jTextField1.getText());
            int columnas = Integer.parseInt(jTextField2.getText());

            pc.configurarMatriz(columnas, filas);

        } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "Error " + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_matrizButtonActionPerformed

    private void reporteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteButtonActionPerformed
        
    }//GEN-LAST:event_reporteButtonActionPerformed

    private void loadFIleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFIleActionPerformed
        fileController.openFileAndDisplayContent(textInsertSection);
    }//GEN-LAST:event_loadFIleActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        tokenController.clearTokens();
        textInsertSection.setText("");
        resultsSection.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        runParser();
        pc.pintar(tokenController.getTokenBag());
        resultsSection.setText(tokenController.getTokenBag().mostrarTokensIrreconocibles());
    }//GEN-LAST:event_runButtonActionPerformed

    private void loadFIle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFIle1ActionPerformed
        fileController.saveFile(textInsertSection.getText());
    }//GEN-LAST:event_loadFIle1ActionPerformed

    private void runParser() {
        tokenController.clearTokens();
        tokenController.initParser(textInsertSection.getText());
    }
    
    private javax.swing.JTextArea textoResultado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel analyzerPane;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel columnas;
    private javax.swing.JLabel filas;
    private javax.swing.JLabel infoJLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loadFIle;
    private javax.swing.JButton loadFIle1;
    private javax.swing.JButton matrizButton;
    private javax.swing.JPanel matrizPanel;
    private javax.swing.JButton reporteButton;
    private javax.swing.JScrollPane resultScrollPane2;
    private javax.swing.JTextArea resultsSection;
    private javax.swing.JButton runButton;
    private javax.swing.JTextArea textInsertSection;
    private javax.swing.JScrollPane textScrollPane1;
    // End of variables declaration//GEN-END:variables
}
