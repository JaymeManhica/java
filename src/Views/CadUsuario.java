package Views;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MANHICA
 */
public class CadUsuario extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public CadUsuario() {
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

        btnCadastrar = new javax.swing.JButton();
        lblolho = new javax.swing.JLabel();
        lblocultar = new javax.swing.JLabel();
        lblocultar1 = new javax.swing.JLabel();
        lblolho1 = new javax.swing.JLabel();
        pasSenha = new javax.swing.JPasswordField();
        btnLimpar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblApagarApelido = new javax.swing.JLabel();
        lblApagarNome4 = new javax.swing.JLabel();
        lblapagarUs = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApelido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pasConfirmar = new javax.swing.JPasswordField();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        btnCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastrarKeyPressed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        lblolho.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblolho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icon/outline_visibility_black_24dp.png"))); // NOI18N
        lblolho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblolhoMouseClicked(evt);
            }
        });
        getContentPane().add(lblolho, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 30, 40));

        lblocultar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icon/outline_visibility_off_black_24dp.png"))); // NOI18N
        lblocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblocultarMouseClicked(evt);
            }
        });
        getContentPane().add(lblocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 30, 40));

        lblocultar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblocultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icon/outline_visibility_off_black_24dp.png"))); // NOI18N
        lblocultar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblocultar1MouseClicked(evt);
            }
        });
        getContentPane().add(lblocultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 30, 40));

        lblolho1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblolho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icon/outline_visibility_black_24dp.png"))); // NOI18N
        lblolho1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblolho1MouseClicked(evt);
            }
        });
        getContentPane().add(lblolho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 30, 40));
        getContentPane().add(pasSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 262, 330, 40));

        btnLimpar.setText("Limpar");
        btnLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLimparKeyPressed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirmar Senha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 180, 40));

        lblApagarApelido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApagarApelido.setText("x");
        lblApagarApelido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblApagarApelidoMouseClicked(evt);
            }
        });
        getContentPane().add(lblApagarApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 30, -1));

        lblApagarNome4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApagarNome4.setText("x");
        lblApagarNome4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblApagarNome4MouseClicked(evt);
            }
        });
        getContentPane().add(lblApagarNome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));

        lblapagarUs.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblapagarUs.setText("x");
        lblapagarUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblapagarUsMouseClicked(evt);
            }
        });
        getContentPane().add(lblapagarUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 20, -1));

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 330, 40));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, 50));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apelido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 80, 30));

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 330, 40));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nome do Utilizador");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, 30));

        txtApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApelidoActionPerformed(evt);
            }
        });
        txtApelido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApelidoKeyPressed(evt);
            }
        });
        getContentPane().add(txtApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 330, 40));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 70, 30));

        pasConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pasConfirmarKeyPressed(evt);
            }
        });
        getContentPane().add(pasConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 330, 40));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        btnVoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVoltarKeyPressed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda-PainelFundo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 740, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/wallpaperflare.com_wallpaper (2).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrarKeyPressed
        if(evt.getKeyCode()==evt.VK_LEFT){
            btnLimpar.requestFocus();
        }
        if(evt.getKeyCode()==evt.VK_UP){
            pasConfirmar.requestFocus();
        }
    }//GEN-LAST:event_btnCadastrarKeyPressed

    private void btnLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimparKeyPressed
        if(evt.getKeyCode()==evt.VK_LEFT){
            btnVoltar.requestFocus();
        }
        if(evt.getKeyCode()==evt.VK_RIGHT){
            btnCadastrar.requestFocus();
        }
        if(evt.getKeyCode()==evt.VK_UP){
            pasConfirmar.requestFocus();
        }
    }//GEN-LAST:event_btnLimparKeyPressed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (evt.getSource()== btnVoltar){
            Login log = new Login();
            log.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVoltarKeyPressed
        if(evt.getKeyCode()==evt.VK_RIGHT){
            btnLimpar.requestFocus();
        }
        if(evt.getKeyCode()==evt.VK_UP){
            pasConfirmar.requestFocus();
        }
    }//GEN-LAST:event_btnVoltarKeyPressed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void pasConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pasConfirmarKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            btnCadastrar.requestFocus();
        }
        if(evt.getKeyCode()==evt.VK_UP){
            pasSenha.requestFocus();
        }
        if(evt.getKeyCode()==evt.VK_DOWN){
            btnCadastrar.requestFocus();
        }
    }//GEN-LAST:event_pasConfirmarKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            pasSenha.requestFocus();
        }
        if(evt.getKeyCode()==evt.VK_UP){
            txtApelido.requestFocus();
        }
        if(evt.getKeyCode()==evt.VK_DOWN){
            pasSenha.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void lblapagarUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblapagarUsMouseClicked
        if(evt.getSource()==lblapagarUs){
            txtUsuario.setText("");
        }
    }//GEN-LAST:event_lblapagarUsMouseClicked

    private void txtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApelidoActionPerformed

    private void txtApelidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApelidoKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            txtUsuario.requestFocus();
        }
        if(evt.getKeyCode()==evt.VK_UP){
            txtNome.requestFocus();
        }
        if(evt.getKeyCode()==evt.VK_DOWN){
            txtUsuario.requestFocus();
        }
    }//GEN-LAST:event_txtApelidoKeyPressed

    private void lblApagarApelidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApagarApelidoMouseClicked
        if(evt.getSource()==lblApagarApelido){
            txtApelido.setText("");
        }
    }//GEN-LAST:event_lblApagarApelidoMouseClicked

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            txtApelido.requestFocus();
        }
        if(evt.getKeyCode()==evt.VK_DOWN){
            txtApelido.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void lblApagarNome4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApagarNome4MouseClicked
        if (evt.getSource()==lblApagarNome4){
            txtNome.setText("");
        }
    }//GEN-LAST:event_lblApagarNome4MouseClicked

    private void lblolhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblolhoMouseClicked
        lblolho.setVisible(false);
        lblocultar.setVisible(true);
        pasSenha.setEchoChar((char)0);
    }//GEN-LAST:event_lblolhoMouseClicked

    private void lblocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblocultarMouseClicked
          lblolho.setVisible(true);
        lblocultar.setVisible(false);
        pasSenha.setEchoChar('*');
    }//GEN-LAST:event_lblocultarMouseClicked

    private void lblocultar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblocultar1MouseClicked
           lblolho1.setVisible(true);
        lblocultar1.setVisible(false);
        pasConfirmar.setEchoChar('*');
    }//GEN-LAST:event_lblocultar1MouseClicked

    private void lblolho1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblolho1MouseClicked
        lblolho1.setVisible(false);
        lblocultar1.setVisible(true);
        pasConfirmar.setEchoChar((char)0);
    }//GEN-LAST:event_lblolho1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       CadUsuario cad = new CadUsuario();
       cad.setVisible(true);
       
      
        
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblApagarApelido;
    private javax.swing.JLabel lblApagarNome4;
    private javax.swing.JLabel lblapagarUs;
    private javax.swing.JLabel lblocultar;
    private javax.swing.JLabel lblocultar1;
    private javax.swing.JLabel lblolho;
    private javax.swing.JLabel lblolho1;
    private javax.swing.JPasswordField pasConfirmar;
    private javax.swing.JPasswordField pasSenha;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}