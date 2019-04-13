/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.beans.PropertyVetoException;
import static java.lang.Thread.sleep;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import modelo.bean.Datas;
import modelo.bean.Entradas;
import modelo.bean.Usuario;
import modelo.dao.MovimentoDAO;
import modelo.dao.UsuariosDAO;
import produzconexao.RefazerConexao;
import util.EntradaNovo;
import util.GerenciadordeJanelas;
import util.GuardarUrl;
import static view.frmMovimento.btnExcluir;
import static view.frmMovimento.txtAtendentecaixa;
import static view.frmMovimento.txtCaixainicial;
import static view.frmMovimento.txtMoedasinicio;
import static view.frmMovimento.txtNotasinicio;
import static view.frmPrincipal.btnCaixa;
import static view.frmPrincipal.btnEntrar;
import static view.frmPrincipal.btnLogin;
import static view.frmPrincipal.dtpDescktop;
import static view.frmPrincipal.mnCaixa;
import static view.frmPrincipal.mnEntrar;
import static view.frmPrincipal.mnFecharEntrar;
import static view.frmPrincipal.mnFecharNovousuario;
import static view.frmPrincipal.mnFecharcaixa;
import static view.frmPrincipal.mnMovimento;
import static view.frmPrincipal.mnNovousuario;


/**
 * @author Pituba
 */
public class frmEntrar extends javax.swing.JInternalFrame {

   GerenciadordeJanelas gerenciadordejanelas = new GerenciadordeJanelas(dtpDescktop);
   frmMovimento frmmovimento = new frmMovimento();
   GuardarUrl guardarurl = new GuardarUrl();
    //frmCarregando frmcarregando;
    private static frmEntrar frmentrar;
    private static JDesktopPane jdesktoppane;
    String nomeusuario = "", tipousuario = "";
    int iddata;
    Date datahoje;
    int idusuario;                                        
    String agora, horaagora;
    
   
    public static frmEntrar getInstancia(){
          if(frmentrar == null){
             frmentrar = new frmEntrar();
          }
        return frmentrar;
    }
    
    public frmEntrar() {
        initComponents();
        btnLogEntrar.setEnabled(true);   
        
    }   
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtLognickentrar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLogEntrar = new javax.swing.JButton();
        txtLogsenhaentrar = new javax.swing.JPasswordField();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/App-login-manager-icon.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Nome:");

        txtLognickentrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLognickentrar.setToolTipText("Informe o Nome");
        txtLognickentrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLognickentrarKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Senha:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Log In");

        btnLogEntrar.setBackground(new java.awt.Color(255, 153, 0));
        btnLogEntrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogEntrar.setText("Entrar");
        btnLogEntrar.setToolTipText("Click aqui para logar");
        btnLogEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogEntrarActionPerformed(evt);
            }
        });
        btnLogEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLogEntrarKeyPressed(evt);
            }
        });

        txtLogsenhaentrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLogsenhaentrar.setToolTipText("Informe a Senha");
        txtLogsenhaentrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLogsenhaentrarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLognickentrar)
                            .addComponent(txtLogsenhaentrar, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 117, Short.MAX_VALUE)
                .addComponent(btnLogEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLognickentrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogsenhaentrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnLogEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGap(121, 121, 121))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 377, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogEntrarActionPerformed
       
            String usuario = "", senha = "";
            String data = "";
            int iddousuario = 0;
            SimpleDateFormat formatbr = new SimpleDateFormat("dd/MM/yyyy");
            
        Thread clock = new Thread() {

            @Override
            public void run() {
                for (;;) {
                    Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int month = (cal.get(Calendar.MONTH)) + 1;
                    int year = cal.get(Calendar.YEAR);
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR_OF_DAY);
                    agora = String.format("%02d.%02d.%02d", day, month, year);
                    horaagora = String.format("%02d:%02d:%02d", hour, minute, second);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        JOptionPane.showMessageDialog(null, "ERRO: " + ex, "Bragança",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }

            }

        };
        clock.start();
        
        if(!txtLognickentrar.getText().equals("") && !txtLogsenhaentrar.getText().equals("")){
        
        RefazerConexao rfc = new RefazerConexao();
        rfc.refazerconexao();
        List<Usuario> selecionandousuario = new ArrayList<>();
        UsuariosDAO usdao = new UsuariosDAO();
        selecionandousuario = usdao.selecionarusuario(txtLognickentrar.getText());

        for(Usuario usuarios : selecionandousuario){
                       idusuario = usuarios.getId();
                       nomeusuario = usuarios.getUsuario();
                       senha = usuarios.getSenha();
                       tipousuario = usuarios.getAdmin();
                      }
        //SingletonModel.ABC obj = SingletonModel.ABC.INSTANCE;
        //obj.i = tipousuario;
        if(senha.equals(txtLogsenhaentrar.getText())){
           txtLognickentrar.setText("");
           txtLogsenhaentrar.setText("");
           btnLogEntrar.setEnabled(true);
           btnExcluir.setEnabled(false);
           if(tipousuario.equals("sim")){
              btnCaixa.setEnabled(true);
              mnCaixa.setEnabled(true);
              mnFecharcaixa.setEnabled(false);
              mnMovimento.setEnabled(true);
           }
           RefazerConexao refc10 = new RefazerConexao();
           refc10.refazerconexao();
           List<Entradas> selecionasaidanula1 = new ArrayList<>();
           MovimentoDAO movdao30 = new MovimentoDAO();
           selecionasaidanula1 = movdao30.selecionarsaidanull();
           if(!selecionasaidanula1.isEmpty()){
               ///frmmovimento = new frmMovimento();
               ///dtpDescktop.add(frmmovimento);
               ///frmmovimento.setVisible(true);
               ///frmmovimento.setPosicao();    
               ///for(Entradas entradas : selecionasaidanula1){
                           ///iddousuario = entradas.getIdusuario();
                           ///data = formatbr.format(entradas.getData());                    
                           ///usuario = entradas.getUsuario();
                           
                     ///JOptionPane.showMessageDialog(null, "Existe um caixa aberto para: '" + usuario + " na data: "
                               ///+ data + "' é necessário fechamento!");
                   ///if(iddousuario == idusuario){
                      ///txtAtendentecaixa.setText("Caixa: " + entradas.getUsuario());
                      ///txtNotasinicio.setText("Notas: " + String.format("%,.2f", entradas.getValorinicialcedula()));
                      ///txtMoedasinicio.setText("Moedas: " + String.format("%,.2f", entradas.getValorinicialmoedas()));
                      ///txtCaixainicial.setText("Início: " + String.format("%,.2f", entradas.getValorinicialcedula() + entradas.getValorinicialmoedas()));
                      ///frmmovimento.recebemovidponto(entradas.getIdponto());
                      ///btnNovo.setEnabled(false);
                      ///btnFecharcaixa.setEnabled(true);
                      ///this.dispose();
                   ///}else{
                       ///frmmovimento.dispose();
                      //JOptionPane.showMessageDialog(null, "Existe um caixa aberto para: '" + usuario + " na data: "
                               //+ data + "' é necessário fechamento!");
                      ///this.setVisible(false);
                      ///dtpDescktop.remove(this);                     
                      //this.dispose();
                   ///}
               ///}  
               
               
               java.sql.Date sdf;
               
                   int idpontoentrada = 0;
                   
                     frmmovimento = new frmMovimento();
                     dtpDescktop.add(frmmovimento);
                     frmmovimento.setVisible(true);
                     frmmovimento.setPosicao();
                   for(Entradas entradas : selecionasaidanula1){
                       if(entradas.getIdusuario() == idusuario){
                           txtAtendentecaixa.setText("Caixa: " + entradas.getUsuario());
                           txtNotasinicio.setText("Notas: " + String.format("%,.2f", entradas.getValorinicialcedula()));
                           txtMoedasinicio.setText("Moedas: " + String.format("%,.2f", entradas.getValorinicialmoedas()));
                           txtCaixainicial.setText("Início: " + String.format("%,.2f", entradas.getValorinicialcedula() + entradas.getValorinicialmoedas()));
                           frmmovimento.recebemovidponto(entradas.getIdponto());
                           idpontoentrada = entradas.getIdusuario();
                           data = formatbr.format(entradas.getData());
                           String[] agoradiv = agora.split("\\.");
                           agora = String.format("%02d/%02d/%02d", Integer.parseInt(agoradiv[0])
                                                                 , Integer.parseInt(agoradiv[1])
                                                                 , Integer.parseInt(agoradiv[2]));
                           if(!data.equals(agora)){
                              JOptionPane.showMessageDialog(null, "Caixa com data de: " + data + ", por favor efetue"
                                      + " o fechamento deste caixa.","Bragança",JOptionPane.WARNING_MESSAGE);
                              frmmovimento.btnNovo.setEnabled(false);
                           }
                            mnNovousuario.setEnabled(false);
                            mnFecharNovousuario.setEnabled(false);
                            mnEntrar.setEnabled(false);
                            mnFecharEntrar.setEnabled(false);
                            btnEntrar.setEnabled(false);
                            btnLogin.setEnabled(false);
                       }else{
                           usuario = entradas.getUsuario();
                           idpontoentrada = entradas.getIdponto();
                           data = formatbr.format(entradas.getData());
                       }
                   }
                   mnNovousuario.setEnabled(false);
                   mnFecharNovousuario.setEnabled(false);
                   mnEntrar.setEnabled(false);
                   mnFecharEntrar.setEnabled(false);
                   btnEntrar.setEnabled(false);
                   btnLogin.setEnabled(false);
                   if(idpontoentrada != idusuario){
                       JOptionPane.showMessageDialog(null, "Existe um caixa aberto para: '" + usuario + " na data: "
                               + data + "' é necessário fechamento!");
                       //gerenciadordejanelas.fecharjanelas(frmMovimento.getInstancia());
                   mnNovousuario.setEnabled(true);
                   mnFecharNovousuario.setEnabled(false);
                   mnEntrar.setEnabled(true);
                   mnFecharEntrar.setEnabled(false);
                   btnEntrar.setEnabled(true);
                   btnLogin.setEnabled(true);
                   dtpDescktop.remove(frmMovimento.getInstancia());
                       frmmovimento.dispose();
                   } 
                   dtpDescktop.remove(this);
                   this.dispose();                       
           }else{
           
           RefazerConexao refc = new RefazerConexao();
           refc.refazerconexao();
           List<Datas> selecionadatahoje = new ArrayList<>();
           MovimentoDAO movdao = new MovimentoDAO();
           selecionadatahoje = movdao.selecionardata(agora);
           for(Datas datas : selecionadatahoje){
                    iddata = datas.getId();
                    datahoje = datas.getData();
           }
           if(datahoje == null){
               String valorinicialcedula, valorinicialmoedas;
               float valorinicialn = 0;
               DecimalFormat obj_formato = new DecimalFormat();
               obj_formato.applyPattern("##,##0.00");
                 valorinicialcedula = JOptionPane.showInputDialog(null, "Digite o valor em cédulas para início de caixa. Somente números, ponto e vírgula no formato '00.000,00' são aceitos!");
                 valorinicialmoedas = JOptionPane.showInputDialog(null, "Digite o valor em moédas para início de caixa. Somente números, ponto e vírgula no formato '00.000,00' são aceitos!");
                 try{
                     valorinicialn = Float.parseFloat(valorinicialcedula.replaceAll("\\.", "").replaceAll(",","."));
                     valorinicialcedula = obj_formato.format(valorinicialn);
                     frmmovimento = new frmMovimento();
                     dtpDescktop.add(frmmovimento);
                     frmmovimento.setVisible(true);
                     frmmovimento.setPosicao();                  
                     valorinicialn = Float.parseFloat(valorinicialmoedas.replaceAll("\\.", "").replaceAll(",","."));
                     valorinicialmoedas = obj_formato.format(valorinicialn);
                     RefazerConexao refc1 = new RefazerConexao();
                     refc1.refazerconexao();
                     movdao.salvar_data(agora);
                     RefazerConexao refc2 = new RefazerConexao();
                     refc2.refazerconexao();
                     List<Datas> selecionadatahoje2 = new ArrayList<>();
                     MovimentoDAO movdao2 = new MovimentoDAO();
                     selecionadatahoje2 = movdao2.selecionardata(agora);
                        for(Datas datas : selecionadatahoje2){
                            iddata = datas.getId();
                            datahoje = datas.getData();
                        }
                     RefazerConexao refc3 = new RefazerConexao();
                     refc3.refazerconexao();
                     movdao.salvar_ponto_entrada(iddata, idusuario, horaagora, Float.parseFloat(valorinicialcedula.
                                   replaceAll("\\.", "").replaceAll(",",".")), 
                                   Float.parseFloat(valorinicialmoedas.replaceAll("\\.", "").replaceAll(",",".")));
                     RefazerConexao refc4 = new RefazerConexao();
                     refc4.refazerconexao();
                     List<Entradas> selecionaentradahoje = new ArrayList<>();
                     MovimentoDAO movdao3 = new MovimentoDAO();
                     selecionaentradahoje = movdao3.selecionarentrada(agora, idusuario);
                        for(Entradas entradas : selecionaentradahoje){
                            txtAtendentecaixa.setText("Caixa: " + entradas.getUsuario());
                            txtNotasinicio.setText("Notas: " + String.format("%,.2f", entradas.getValorinicialcedula()));
                            txtMoedasinicio.setText("Moedas: " + String.format("%,.2f", entradas.getValorinicialmoedas()));
                            txtCaixainicial.setText("Início: " + String.format("%,.2f", entradas.getValorinicialcedula() + entradas.getValorinicialmoedas()));     
                            frmmovimento.recebemovidponto(entradas.getIdponto());
                        }
                 }catch(Exception ex){
                     JOptionPane.showMessageDialog(null, "Somente números, ponto e vírgula no formato '00.000,00' são aceitos!");                    
                     frmmovimento.dispose();
                     mnCaixa.setEnabled(false);
                     mnFecharcaixa.setEnabled(false);
                     btnCaixa.setEnabled(false);
                     mnEntrar.setEnabled(true);
                     mnFecharEntrar.setEnabled(false);
                     mnNovousuario.setEnabled(true);
                     mnFecharNovousuario.setEnabled(false);
                     btnEntrar.setEnabled(true);
                     btnLogin.setEnabled(true);
                     
                 }   
                  dtpDescktop.remove(this);
                  this.dispose();
           }else{
               RefazerConexao refc1 = new RefazerConexao();
               refc1.refazerconexao();
               List<Entradas> selecionasaidanula = new ArrayList<>();
               MovimentoDAO movdao3 = new MovimentoDAO();
               selecionasaidanula = movdao3.selecionarsaidanull();
               if(selecionasaidanula.isEmpty()){
                   int novocaixa = JOptionPane.showConfirmDialog(null,"Deseja iniciar o caixa, "
                           + "a partir do total do caixa anterior?", "Entrada."
                           , JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                   switch(novocaixa){
                       case 0:
                           String valorinicialcedula = "", valorinicialmoedas = "";
                           RefazerConexao refc5 = new RefazerConexao();
                           refc5.refazerconexao();
                           List<Entradas> selecionaultimocaixa = new ArrayList<>();
                           MovimentoDAO movdao4 = new MovimentoDAO();
                           selecionaultimocaixa = movdao4.selecionarultimocaixa();
                           for(Entradas entradas : selecionaultimocaixa){
                               valorinicialcedula = String.format("%,.2f", entradas.getValorinicialcedula());
                               valorinicialmoedas = "0,00";
                           }
                           RefazerConexao refc7 = new RefazerConexao();
                           refc7.refazerconexao();
                           List<Datas> selecionadatahoje7 = new ArrayList<>();
                           MovimentoDAO movdao7 = new MovimentoDAO();
                           selecionadatahoje7 = movdao7.selecionardata(agora);
                              for(Datas datas : selecionadatahoje7){
                                 iddata = datas.getId();
                                 datahoje = datas.getData();
                              }
                           RefazerConexao refc3 = new RefazerConexao();
                           refc3.refazerconexao();
                           movdao.salvar_ponto_entrada(iddata, idusuario, horaagora, Float.parseFloat(valorinicialcedula.
                                   replaceAll("\\.", "").replaceAll(",",".")), 
                                   Float.parseFloat(valorinicialmoedas.replaceAll("\\.", "").replaceAll(",",".")));
                           RefazerConexao refc4 = new RefazerConexao();
                           refc4.refazerconexao();
                           List<Entradas> selecionaentradahoje = new ArrayList<>();
                           MovimentoDAO movdao5 = new MovimentoDAO();
                           selecionaentradahoje = movdao5.selecionarentrada(agora, idusuario);
                           
                           try {
                               gerenciadordejanelas.abrirjanelas(frmMovimento.getInstancia());
                               for(Entradas entradas : selecionaentradahoje){
                                   txtAtendentecaixa.setText("Caixa: " + entradas.getUsuario());
                                   txtNotasinicio.setText("Notas: " + String.format("%,.2f", entradas.getValorinicialcedula()));
                                   txtMoedasinicio.setText("Moedas: " + String.format("%,.2f", entradas.getValorinicialmoedas()));
                                   txtCaixainicial.setText("Início: " + String.format("%,.2f", entradas.getValorinicialcedula() + entradas.getValorinicialmoedas()));
                                   frmmovimento.recebemovidponto(entradas.getIdponto());
                               }
                           } catch (PropertyVetoException ex) {
                               JOptionPane.showMessageDialog(null, "Erro: " + ex + " ao tentar abrir "
                                       + "janela de movimento!");
                           }                           
                           break;
                       case 1:
                           EntradaNovo entradanovo = new EntradaNovo();
                           entradanovo.EntradaNovo(agora, horaagora, iddata, idusuario);                           
                           break;
                       case 2:
                           dtpDescktop.remove(this);
                           this.dispose();
                           break;
                   }
                   dtpDescktop.remove(this);
                   this.dispose();
               }
                dtpDescktop.remove(this);
                this.dispose();                    
           }
                     //mnCaixa.setEnabled(false);
                     //mnFecharcaixa.setEnabled(false);
                     btnCaixa.setEnabled(false);
                     mnEntrar.setEnabled(true);
                     mnFecharEntrar.setEnabled(false);
                     mnNovousuario.setEnabled(true);
                     mnFecharNovousuario.setEnabled(false);
                     btnEntrar.setEnabled(true);
                     btnLogin.setEnabled(true);
        }
           
        }else{
                    JOptionPane.showMessageDialog(null, "Usuário e/ou senha não conferem!");
                    txtLognickentrar.setText("");
                    txtLogsenhaentrar.setText("");
                    txtLognickentrar.requestFocus(true);
                   }
     }else{
           txtLognickentrar.requestFocus(true);
     }
    }//GEN-LAST:event_btnLogEntrarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
                
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtLognickentrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLognickentrarKeyPressed
        if(evt.getKeyCode()== evt.VK_ENTER){
                txtLogsenhaentrar.requestFocus();
        }
    }//GEN-LAST:event_txtLognickentrarKeyPressed

    private void txtLogsenhaentrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLogsenhaentrarKeyPressed
        if(evt.getKeyCode()== evt.VK_ENTER){
                btnLogEntrar.requestFocus();
        }
    }//GEN-LAST:event_txtLogsenhaentrarKeyPressed

    private void btnLogEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLogEntrarKeyPressed
        if(!txtLognickentrar.getText().equals("") && !txtLogsenhaentrar.getText().equals("")){
           if(evt.getKeyCode()== evt.VK_ENTER){
                btnLogEntrar.doClick();
        }
        }
    }//GEN-LAST:event_btnLogEntrarKeyPressed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        dtpDescktop.remove(this);
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnLogEntrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JTextField txtLognickentrar;
    public static javax.swing.JPasswordField txtLogsenhaentrar;
    // End of variables declaration//GEN-END:variables
}