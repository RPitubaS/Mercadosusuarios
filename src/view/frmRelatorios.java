/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//import controle.ControleMovimento;
import controle.ControleMovimento;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import produzconexao.RefazerConexao;
import util.GerenciadordeJanelas;
import static view.frmPrincipal.dtpDescktop;

/**
 *
 * @author Pituba
 */
public class frmRelatorios extends javax.swing.JInternalFrame {
    GerenciadordeJanelas gerenciadordejanelas;
    private static frmRelatorios frmrelatorios;
    ControleMovimento controlemovimento = new ControleMovimento();
   
    public static frmRelatorios getInstancia(){
          if(frmrelatorios == null){
             frmrelatorios = new frmRelatorios();
          }
        return frmrelatorios;
    }
    public frmRelatorios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        btnRelatorios = new javax.swing.JButton();
        dtcDatainicial = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dtcDatafinal = new com.toedter.calendar.JDateChooser();
        dkpRelatorios = new javax.swing.JDesktopPane();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        btnRelatorios.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnRelatorios.setText("Gerar Relatório");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("De: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText(" á: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtcDatainicial, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtcDatafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRelatorios)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dtcDatafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dtcDatainicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout dkpRelatoriosLayout = new javax.swing.GroupLayout(dkpRelatorios);
        dkpRelatorios.setLayout(dkpRelatoriosLayout);
        dkpRelatoriosLayout.setHorizontalGroup(
            dkpRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 932, Short.MAX_VALUE)
        );
        dkpRelatoriosLayout.setVerticalGroup(
            dkpRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dkpRelatorios)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dkpRelatorios))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        
        SimpleDateFormat formatbr = new SimpleDateFormat("dd/MM/yyyy");
        String inicio;
        RefazerConexao rfc = new RefazerConexao();
        rfc.refazerconexao();
        //int idponto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id"));
        //try{
            //Map parametros = new HashMap();
            //parametros.put(null,null);
      
            //InputStream inputstream = getClass().getResourceAsStream("/RelatMovimento/RelatorioMovimento.jasper");
            //JRResultSetDataSource resultset = new JRResultSetDataSource(controlemovimento.movimentousuario(idponto));
            
            //JasperPrint jpprint = JasperFillManager.fillReport(inputstream,
                                //parametros, resultset);
            //JInternalFrame frmrelatorios = new JInternalFrame();
            //frmrelatorios.getContentPane().add(new JRViewer(jpprint));
            //frmrelatorios.pack();
            //dkpRelatorios.add(frmrelatorios);
            //frmrelatorios.setSize(dkpRelatorios.getSize());
            //frmrelatorios.setClosable(true);
            //frmrelatorios.setVisible(true);
            //frmrelatorios.toFront();
          
        //}catch(Exception ex){
            //JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage() + " ao gerar o relatório!");
        //}
          DateFormat df = DateFormat.getDateInstance();
          //java.sql.Date inicio = new java.sql.Date(df.format(dtcDatainicial.getDate()));
        try {
            inicio = df.format(dtcDatainicial.getDate());
            //JOptionPane.showMessageDialog(null, inicio);
            InputStream inputstream = getClass().getResourceAsStream("/RelatMovimento/MovimentoDia.jasper");
              JRResultSetDataSource resultset = new JRResultSetDataSource(controlemovimento.movimentodiario(inicio));
              JasperPrint jpprint = JasperFillManager.fillReport(inputstream, new HashMap<>(), resultset);
              JInternalFrame frmrelatorios = new JInternalFrame();
              frmrelatorios.getContentPane().add(new JRViewer(jpprint));
              frmrelatorios.pack();
              dkpRelatorios.add(frmrelatorios);
              frmrelatorios.setSize(dkpRelatorios.getSize());
              frmrelatorios.setClosable(true);
              frmrelatorios.setVisible(true);
              frmrelatorios.toFront();
        } catch (JRException ex) {
            Logger.getLogger(frmRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        dtpDescktop.remove(this);
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JDesktopPane dkpRelatorios;
    private com.toedter.calendar.JDateChooser dtcDatafinal;
    private com.toedter.calendar.JDateChooser dtcDatainicial;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}