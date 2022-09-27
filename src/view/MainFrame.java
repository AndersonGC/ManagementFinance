package view;

import controller.EntradaController;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import model.Classificacao;
import model.Entrada;

/**
 *
 * @author Anderson, Fabricio and Lavínia
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setIconTitle();
        inserirNoCombo();
        ganhoCheck.setSelected(true);
    }
    @SuppressWarnings("unchecked")
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEntrada = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        entrada = new javax.swing.JLabel();
        saida = new javax.swing.JLabel();
        entradaTxt = new javax.swing.JLabel();
        saidaTxt = new javax.swing.JLabel();
        resultadoTxt = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        classificacao = new javax.swing.JLabel();
        valorTxt = new javax.swing.JTextField();
        valor = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        data = new javax.swing.JLabel();
        gastoCheck = new javax.swing.JCheckBox();
        ganhoCheck = new javax.swing.JCheckBox();
        cadastrarBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        classificacaoC = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        title.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Management Finance");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        tableEntrada.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableEntrada);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setForeground(new java.awt.Color(0, 102, 102));

        entrada.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        entrada.setForeground(new java.awt.Color(0, 153, 51));
        entrada.setText("Entradas:");

        saida.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        saida.setForeground(new java.awt.Color(255, 0, 0));
        saida.setText("Saídas:");

        entradaTxt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        entradaTxt.setForeground(new java.awt.Color(0, 153, 51));
        entradaTxt.setText("Entradas:");

        saidaTxt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        saidaTxt.setForeground(new java.awt.Color(255, 0, 0));
        saidaTxt.setText("Saídas:");

        resultadoTxt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        resultadoTxt.setForeground(new java.awt.Color(0, 51, 0));
        resultadoTxt.setText("Resultado:");

        resultado.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        resultado.setForeground(new java.awt.Color(0, 51, 0));
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
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saidaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(resultadoTxt)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoTxt)
                    .addComponent(resultado)))
        );

        nome.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        nome.setText("Nome:");

        classificacao.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        classificacao.setText("Classificação:");

        valor.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        valor.setText("Valor:");

        data.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        data.setText("Data:");

        gastoCheck.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        gastoCheck.setLabel("Gasto");
        gastoCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gastoCheckActionPerformed(evt);
            }
        });

        ganhoCheck.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ganhoCheck.setLabel("Ganho");
        ganhoCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganhoCheckActionPerformed(evt);
            }
        });

        cadastrarBtn.setBackground(new java.awt.Color(0, 51, 51));
        cadastrarBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cadastrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarBtnMouseClicked(evt);
            }
        });

        excluirBtn.setBackground(new java.awt.Color(255, 102, 102));
        excluirBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 48)); // NOI18N
        excluirBtn.setForeground(new java.awt.Color(255, 255, 255));
        excluirBtn.setText("X");

        classificacaoC.setBackground(new java.awt.Color(255, 255, 255));
        classificacaoC.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeTxt)
                    .addComponent(valorTxt)
                    .addComponent(dateTxt)
                    .addComponent(classificacaoC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(nome)
                    .addComponent(classificacao)
                    .addComponent(valor)
                    .addComponent(data)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ganhoCheck)
                        .addGap(35, 35, 35)
                        .addComponent(gastoCheck)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classificacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classificacaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gastoCheck)
                            .addComponent(ganhoCheck))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excluirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
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
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBtnMouseClicked
 
       Date diaCadastro = new Date();
       Object o = classificacaoC.getSelectedItem();
       Classificacao c = (Classificacao)o;
       EntradaController entrada = new EntradaController(nomeTxt.getText(), c, Double.valueOf(valorTxt.getText()), dateTxt.getText() , diaCadastro);
       System.out.println(entrada);
        
    }//GEN-LAST:event_cadastrarBtnMouseClicked

    private void ganhoCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganhoCheckActionPerformed
        gastoCheck.setSelected(false);
    }//GEN-LAST:event_ganhoCheckActionPerformed

    private void gastoCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gastoCheckActionPerformed
        ganhoCheck.setSelected(false);
    }//GEN-LAST:event_gastoCheckActionPerformed



    private void inserirNoCombo(){
        DefaultComboBoxModel myComboModel = new DefaultComboBoxModel();
        myComboModel.addElement(Classificacao.ALIMENTACAO);
        myComboModel.addElement(Classificacao.AUTOMOVEL);
        myComboModel.addElement(Classificacao.BEM_ESTAR);
        myComboModel.addElement(Classificacao.CASA);
        myComboModel.addElement(Classificacao.INVESTIMENTO);
        myComboModel.addElement(Classificacao.SALARIO);
        myComboModel.addElement(Classificacao.SAUDE);
        myComboModel.addElement(Classificacao.OUTRO);
        classificacaoC.setModel(myComboModel);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JLabel classificacao;
    private javax.swing.JComboBox<String> classificacaoC;
    private javax.swing.JLabel data;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel entrada;
    private javax.swing.JLabel entradaTxt;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JCheckBox ganhoCheck;
    private javax.swing.JCheckBox gastoCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel resultadoTxt;
    private javax.swing.JLabel saida;
    private javax.swing.JLabel saidaTxt;
    private javax.swing.JTable tableEntrada;
    private javax.swing.JLabel title;
    private javax.swing.JLabel valor;
    private javax.swing.JTextField valorTxt;
    // End of variables declaration//GEN-END:variables

    private void setIconTitle() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("./img/icon.png")));
    }
}
