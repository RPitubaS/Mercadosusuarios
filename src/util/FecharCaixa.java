/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Time;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Entradas;
import modelo.dao.MovimentoDAO;
import produzconexao.RefazerConexao;
import view.frmMovimento;
import static view.frmMovimento.btnFecharcaixa;
import static view.frmMovimento.btnNovo;
import static view.frmMovimento.ftxtValor;
import static view.frmMovimento.tblMovimento;
import static view.frmMovimento.txtAtendentecaixa;
import static view.frmMovimento.txtCaixainicial;
import static view.frmMovimento.txtMoedasinicio;
import static view.frmMovimento.txtNotasinicio;
import static view.frmMovimento.txtRelogio;
import static view.frmPrincipal.dtpDescktop;
import static view.frmMovimento.btnExcluir;

/**
 *
 * @author Pituba
 */
public class FecharCaixa {
    String horadasaida;
    java.sql.Time horasaidanull;
    frmMovimento frmmovimento;
    DecimalFormat df = new DecimalFormat();
    DefaultTableModel modelo = (DefaultTableModel) tblMovimento.getModel();
    public void FecharCaixa(String datahoje, int movidponto, Time horasaida, float caixasaida){
        java.sql.Date sdf;
        java.sql.Date data;
        df.applyPattern("R$ ##,##0.00");
        //String encerrarmovimentos = df.format(encerrarmovimento);
        
        SimpleDateFormat formatbr = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat formathr = new SimpleDateFormat("HH:mm:hh");
        //JOptionPane.showMessageDialog(null, datahoje);
        int fechacaixa = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar o caixa, com o valor de: "
                                                       + df.format(caixasaida) + " ?", "Fechamento."
                                                       , JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch(fechacaixa){
                       case 0:
                           
        try {
            data = new java.sql.Date(formatbr.parse("27.03.2019").getTime());
            sdf = new java.sql.Date(formatbr.parse(datahoje).getTime());
                           RefazerConexao rfc = new RefazerConexao();
                           rfc.refazerconexao();
                           List<Entradas> selecionasaida = new ArrayList<>();
                           MovimentoDAO movdao = new MovimentoDAO();
                           selecionasaida = movdao.selecionarsaida(movidponto);
                             for(Entradas entradas : selecionasaida){
                                 data = entradas.getData();
                             }

                java.sql.Time sdfhorasaida = new java.sql.Time(formathr.parse(txtRelogio.getText().substring
                                                                              (0, 8)).getTime());
                     RefazerConexao rfc1 = new RefazerConexao();
                     rfc1.refazerconexao();
                     MovimentoDAO movimdao = new MovimentoDAO();
                 if(data.before(sdf)){
                     
                     if(horasaida == null){
                     horadasaida = JOptionPane.showInputDialog(null, "Por favor informe a hora de sua saida. Somente números e dois ponto no formato 'hh:mm:ss' são aceitos!");
                         try {
                             horasaidanull = new java.sql.Time(formathr.parse(horadasaida).getTime());
                             movimdao.atualizar_ponto(movidponto, horasaidanull, caixasaida);
                         } catch (ParseException ex) {
                             JOptionPane.showMessageDialog(null, "Erro: " + ex + " ao informar a hora de saida!",
                                     "Bragança",JOptionPane.ERROR_MESSAGE);
                         }
                     }else{
                     movimdao.atualizar_ponto(movidponto, horasaida, caixasaida);
                     }
                 }else{
                     movimdao.atualizar_ponto(movidponto, sdfhorasaida, caixasaida);
                 }            
                 modelo.setNumRows(0);
                 txtAtendentecaixa.setText("Caixa: ");
                      txtNotasinicio.setText("Notas: ");
                      txtMoedasinicio.setText("Moedas: ");
                      txtCaixainicial.setText("Início: ");
                      btnNovo.setEnabled(false);
                      btnExcluir.setEnabled(false);
                      btnFecharcaixa.setEnabled(false);
                      ftxtValor.setEnabled(false);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
                           break;
                       case 1:
                           btnNovo.setEnabled(true);                          
        try {
            data = new java.sql.Date(formatbr.parse("27.03.2019").getTime());
            sdf = new java.sql.Date(formatbr.parse(datahoje).getTime());
                           RefazerConexao rfc = new RefazerConexao();
                           rfc.refazerconexao();
                           List<Entradas> selecionasaida = new ArrayList<>();
                           MovimentoDAO movdao = new MovimentoDAO();
                           selecionasaida = movdao.selecionarsaida(movidponto);
                             for(Entradas entradas : selecionasaida){
                                 data = entradas.getData();
                             }

                 if(data.before(sdf)){
                     JOptionPane.showMessageDialog(null,"Este caixa tem data anterior a de hoje e precisa ser"
                             + " fechado, por favor confirme os valores e feche o caixa.", "Bragança"
                             , JOptionPane.INFORMATION_MESSAGE);
                 }
                           
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
                          break;
        }
    }
    
}