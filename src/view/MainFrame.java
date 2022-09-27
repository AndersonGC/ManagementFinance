package view;

import controller.MovementController;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Classification;
import model.Movement;

/**
 *
 * @author Anderson, Fabricio and Lavínia
 */
public class MainFrame extends javax.swing.JFrame {
    
    private final MovementController controller;
    
    public MainFrame() {
        controller = new MovementController(this);
        updateResult();
        initComponents();
        setIconTitle();
        setTitle("Management Finance");
        startTable();
        inserirNoCombo();
        entryCheck.setSelected(true);      
    }
    @SuppressWarnings("unchecked")
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        nameTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        entryTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        entrada = new javax.swing.JLabel();
        saida = new javax.swing.JLabel();
        entradaTxt = new javax.swing.JLabel();
        saidaTxt = new javax.swing.JLabel();
        resultadoTxt = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        classification = new javax.swing.JLabel();
        valueTxt = new javax.swing.JTextField();
        value = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        exitCheck = new javax.swing.JCheckBox();
        entryCheck = new javax.swing.JCheckBox();
        registerBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        classificationCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        title.setBackground(new java.awt.Color(0, 51, 51));
        title.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Management Finance");

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        nameTitle.setBackground(new java.awt.Color(0, 51, 51));
        nameTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        nameTitle.setForeground(new java.awt.Color(255, 255, 255));
        nameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameTitle.setText("Seu José");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(nameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(nameTitle)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        entryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Classificação", "Valor", "Data", "Cadastro"
            }
        ));
        jScrollPane2.setViewportView(entryTable);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setForeground(new java.awt.Color(0, 102, 102));

        entrada.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        entrada.setForeground(new java.awt.Color(0, 153, 51));
        entrada.setText("Entradas:");

        saida.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        saida.setForeground(new java.awt.Color(255, 51, 51));
        saida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        saida.setText("Saídas:");

        entradaTxt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        entradaTxt.setForeground(new java.awt.Color(0, 153, 51));
        entradaTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        entradaTxt.setText("R$12,00");

        saidaTxt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        saidaTxt.setForeground(new java.awt.Color(255, 51, 51));
        saidaTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        saidaTxt.setText("R$8,00");

        resultadoTxt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        resultadoTxt.setForeground(new java.awt.Color(255, 255, 255));
        resultadoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultadoTxt.setText("R$20,00");

        resultado.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        resultado.setForeground(new java.awt.Color(255, 255, 255));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultado.setText("Resultado:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(entradaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(resultadoTxt))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saidaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrada)
                    .addComponent(entradaTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saida)
                    .addComponent(saidaTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultado)
                    .addComponent(resultadoTxt))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        name.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        name.setText("Nome:");

        classification.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        classification.setText("Classificação:");

        value.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        value.setText("Valor:");

        date.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        date.setText("Data:");

        exitCheck.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        exitCheck.setText("Saída");
        exitCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitCheckActionPerformed(evt);
            }
        });

        entryCheck.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        entryCheck.setText("Entrada");
        entryCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryCheckActionPerformed(evt);
            }
        });

        registerBtn.setBackground(new java.awt.Color(0, 51, 51));
        registerBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Cadastrar");
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnMouseClicked(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 48)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("X");

        classificationCombo.setBackground(new java.awt.Color(255, 255, 255));
        classificationCombo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTxt)
                    .addComponent(valueTxt)
                    .addComponent(dateTxt)
                    .addComponent(classificationCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(name)
                    .addComponent(classification)
                    .addComponent(value)
                    .addComponent(date)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(entryCheck)
                        .addGap(35, 35, 35)
                        .addComponent(exitCheck)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classification)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classificationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(value)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitCheck)
                            .addComponent(entryCheck))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseClicked
       this.controller.registerMovement();
    }//GEN-LAST:event_registerBtnMouseClicked

    private void entryCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryCheckActionPerformed
        exitCheck.setSelected(false);
    }//GEN-LAST:event_entryCheckActionPerformed

    private void exitCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitCheckActionPerformed
        entryCheck.setSelected(false);
    }//GEN-LAST:event_exitCheckActionPerformed



    private void inserirNoCombo(){
        DefaultComboBoxModel myComboModel = new DefaultComboBoxModel();
        myComboModel.addElement(Classification.ALIMENTACAO.getValue());
        myComboModel.addElement(Classification.AUTOMOVEL.getValue());
        myComboModel.addElement(Classification.BEM_ESTAR.getValue());
        myComboModel.addElement(Classification.CASA.getValue());
        myComboModel.addElement(Classification.INVESTIMENTO.getValue());
        myComboModel.addElement(Classification.SALARIO.getValue());
        myComboModel.addElement(Classification.SAUDE.getValue());
        myComboModel.addElement(Classification.OUTRO.getValue());
        classificationCombo.setModel(myComboModel);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classification;
    private javax.swing.JComboBox<String> classificationCombo;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel entrada;
    private javax.swing.JLabel entradaTxt;
    private javax.swing.JCheckBox entryCheck;
    private javax.swing.JTable entryTable;
    private javax.swing.JCheckBox exitCheck;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameTitle;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel resultadoTxt;
    private javax.swing.JLabel saida;
    private javax.swing.JLabel saidaTxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel value;
    private javax.swing.JTextField valueTxt;
    // End of variables declaration//GEN-END:variables

    private void setIconTitle() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("./img/icon.png")));
    }

    public JComboBox<String> getClassificationCombo() {
        return classificationCombo;
    }

    public void setClassificationCombo(JComboBox<String> classificationCombo) {
        this.classificationCombo = classificationCombo;
    }

    public JTextField getDateTxt() {
        return dateTxt;
    }

    public void setDateTxt(JTextField dateTxt) {
        this.dateTxt = dateTxt;
    }

    public JLabel getEntradaTxt() {
        return entradaTxt;
    }

    public void setEntradaTxt(JLabel entradaTxt) {
        this.entradaTxt = entradaTxt;
    }

    public JTextField getNameTxt() {
        return nameTxt;
    }

    public void setNameTxt(JTextField nameTxt) {
        this.nameTxt = nameTxt;
    }

    public JLabel getSaidaTxt() {
        return saidaTxt;
    }

    public void setSaidaTxt(JLabel saidaTxt) {
        this.saidaTxt = saidaTxt;
    }

    public JTextField getValueTxt() {
        return valueTxt;
    }

    public void setValueTxt(JTextField valueTxt) {
        this.valueTxt = valueTxt;
    }

    public JTable getEntryTable() {
        return entryTable;
    }

    public void setEntryTable(JTable entryTable) {
        this.entryTable = entryTable;
    }

    private void startTable() {
        this.controller.updateTable();
    }

    private void updateResult() {
    }
    
    
}
