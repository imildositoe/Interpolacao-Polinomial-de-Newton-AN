package view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Ascendente;
import model.Caminho;
import model.Descendente;
import model.Diferencas;

/**
 *
 * @author Dercio Juizo
 * @author Imildo Sitoe
 * @author Silva Muzime
 *
 */
public class TelaPrincipal extends JFrame implements ItemListener {

    private final ButtonGroup group = new ButtonGroup();
    private final Ascendente asc = new Ascendente();
    private final Descendente desc = new Descendente();
    private final Diferencas dif = new Diferencas();

    public TelaPrincipal() {
        initComponents();
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
        group.add(rbAscendente);
        group.add(rbDescendente);
        this.formula();
        rbAscendente.addItemListener(this);
        rbDescendente.addItemListener(this);
    }

    private String formula() {
        String a = "";
        if (rbAscendente.isSelected()) {
            a = "Ascendente";
        } else if (rbDescendente.isSelected()) {
            a = "Descendente";
        }
        return a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtXi = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtFXi = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbAscendente = new javax.swing.JRadioButton();
        rbDescendente = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblXNRotulo = new javax.swing.JLabel();
        lblNs = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCaminho = new javax.swing.JLabel();
        lblCaminhoRotulo = new javax.swing.JLabel();
        lblH = new javax.swing.JLabel();
        lblTeta = new javax.swing.JLabel();
        lblXN = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Valor a calcular");

        txtValor.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 255));
        jLabel14.setText("Interpolação Polinomial de Newton");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Fórmula");

        btnCalcular.setBackground(new java.awt.Color(255, 255, 255));
        btnCalcular.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 102, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtXi.setColumns(20);
        txtXi.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtXi.setRows(5);
        jScrollPane1.setViewportView(txtXi);

        txtFXi.setColumns(20);
        txtFXi.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFXi.setRows(5);
        jScrollPane3.setViewportView(txtFXi);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Xi");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("F(Xi)");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        rbAscendente.setBackground(new java.awt.Color(255, 255, 255));
        rbAscendente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbAscendente.setSelected(true);
        rbAscendente.setText("Ascendente");

        rbDescendente.setBackground(new java.awt.Color(255, 255, 255));
        rbDescendente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbDescendente.setText("Descendente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAscendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(rbDescendente)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAscendente)
                    .addComponent(rbDescendente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true), "Cálculos Auxiliares", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("Valor de Teta");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("Valor de H");

        lblXNRotulo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblXNRotulo.setText("Valor de XNA ( Marca da Interpolação )");

        lblNs.setBackground(new java.awt.Color(255, 255, 255));
        lblNs.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblNs.setText("N1  |  N2  |  N3  |  N4");
        lblNs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setText("Valores de N");

        lblCaminho.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblCaminho.setText("1  |  2  |  ...");
        lblCaminho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        lblCaminhoRotulo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblCaminhoRotulo.setText("Caminho Ascendente");

        lblH.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblH.setText("0");
        lblH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        lblTeta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblTeta.setText("0");
        lblTeta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        lblXN.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblXN.setText("0");
        lblXN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Resultado");

        lblResultado.setBackground(new java.awt.Color(255, 255, 255));
        lblResultado.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 0, 0));
        lblResultado.setText("0");
        lblResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCaminhoRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(220, 220, 220)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lblTeta, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblH, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(436, 436, 436)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblXNRotulo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblXN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCaminhoRotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblXNRotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblXN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTeta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 11, Short.MAX_VALUE)))
                                        .addGap(101, 101, 101))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel14))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        this.calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (e.getSource() == rbDescendente) {
                this.calculoDescendente();
            } else if (e.getSource() == rbAscendente) {
                this.calculoAscendente();
            }
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCaminho;
    private javax.swing.JLabel lblCaminhoRotulo;
    private javax.swing.JLabel lblH;
    private javax.swing.JLabel lblNs;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTeta;
    private javax.swing.JLabel lblXN;
    private javax.swing.JLabel lblXNRotulo;
    private javax.swing.JRadioButton rbAscendente;
    private javax.swing.JRadioButton rbDescendente;
    private javax.swing.JTextArea txtFXi;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextArea txtXi;
    // End of variables declaration//GEN-END:variables

    private double[] getValoresDeXi() {
        int tam = txtXi.getText().split("\\s").length;
        double[] a = new double[tam];
        for (int i = 0; i < tam; i++) {
            a[i] = Double.parseDouble(txtXi.getText().split("\\s")[i]);
        }
        return a;
    }

    private double[] getValoresDeFXi() {
        int tam = txtFXi.getText().split("\\s").length;
        double[] a = new double[tam];
        for (int i = 0; i < tam; i++) {
            a[i] = Double.parseDouble(txtFXi.getText().split("\\s")[i]);
        }
        return a;
    }

    private double[][] matriz() {
        int tamX = txtXi.getText().split("\\s").length;
        int tamFX = txtFXi.getText().split("\\s").length;
        double matriz[][] = new double[2][tamFX];
        for (int i = 0; i < tamX; i++) {
            matriz[0][i] = Double.parseDouble(txtXi.getText().split("\\s")[i]);
            matriz[1][i] = Double.parseDouble(txtFXi.getText().split("\\s")[i]);
        }
        return matriz;
    }

    private String caminhoAsc() {
        String s = "";
        for (Double a : asc.caminhoAscendente(dif.diferencas(this.matriz()), asc.posicaoXND(this.getValoresDeXi(), Double.parseDouble(txtValor.getText())))) {
            s += Double.toString(a) + " | ";
        }
        return s;
    }

    private String caminhoDesc() {
        String s = "";
        for (Double a : desc.caminhoDescendente(dif.diferencas(this.matriz()), asc.posicaoXND(this.getValoresDeXi(), Double.parseDouble(txtValor.getText())))) {
            s += Double.toString(a) + " | ";
        }
        return s;
    }

    private String getNsAsc() {
        String s = "";
        for (Double a : (ArrayList<Double>) asc.getListaDeNs(this.getValoresDeXi(), Double.parseDouble(txtValor.getText()), dif.diferencas(this.matriz()), asc.posicaoXND(this.getValoresDeXi(), Double.parseDouble(txtValor.getText())))) {
            s += Double.toString(a) + " | ";
        }
        return s;
    }

    private String getNsDesc() {
        String s = "";
        for (Double a : (ArrayList<Double>) desc.getListaDeNs(this.getValoresDeXi(), Double.parseDouble(txtValor.getText()), dif.diferencas(this.matriz()), desc.posicaoXND(this.getValoresDeXi(), Double.parseDouble(txtValor.getText())))) {
            s += Double.toString(a) + " | ";
        }
        return s;
    }

    private void calcular() {
        if (txtXi.getText().split("\\s").length != txtFXi.getText().split("\\s").length) {
            JOptionPane.showMessageDialog(null, "Foi introduzido um numero de valores diferentes");
        } else {
            if (this.formula().equals("Ascendente")) {
                this.calculoAscendente();
            } else if (this.formula().equals("Descendente")) {
                this.calculoDescendente();
            }
        }
    }

    private void calculoDescendente() {
        try {
            lblCaminhoRotulo.setText("Caminho Descendente");
            lblXNRotulo.setText("Valor de XND ( Marca da Interpolação )");
            lblCaminho.setText(this.caminhoDesc());
            lblH.setText(Double.toString(desc.getH(this.getValoresDeXi())));
            lblTeta.setText(Double.toString(desc.getTeta(this.getValoresDeXi(), Double.parseDouble(txtValor.getText()))));
            lblNs.setText(this.getNsDesc());
            lblXN.setText(Double.toString(desc.getXND(this.getValoresDeXi(), Double.parseDouble(txtValor.getText()))));
            lblResultado.setText(Double.toString(desc.getFDeX(dif.diferencas(this.matriz()), desc.posicaoXND(this.getValoresDeXi(), Double.parseDouble(txtValor.getText())), this.getValoresDeXi(), Double.parseDouble(txtValor.getText()))) + " +R");
        } catch (NumberFormatException e) {
        }
    }

    private void calculoAscendente() {
        try {
            lblCaminhoRotulo.setText("Caminho Ascendente");
            lblXNRotulo.setText("Valor de XNA ( Marca da Interpolação )");
            lblCaminho.setText(this.caminhoAsc());
            lblH.setText(Double.toString(asc.getH(this.getValoresDeXi())));
            lblTeta.setText(Double.toString(asc.getTeta(this.getValoresDeXi(), Double.parseDouble(txtValor.getText()))));
            lblNs.setText(this.getNsDesc());
            lblXN.setText(Double.toString(asc.getXNA(this.getValoresDeXi(), Double.parseDouble(txtValor.getText()))));
            lblResultado.setText(Double.toString(asc.getFDeX(dif.diferencas(this.matriz()), asc.posicaoXND(this.getValoresDeXi(), Double.parseDouble(txtValor.getText())), this.getValoresDeXi(), Double.parseDouble(txtValor.getText()))) + " +R");
        } catch (NumberFormatException e) {
        }
    }
}
