/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Modelo.Barras;
import Modelo.Pizza;
import form.Actualizacao;
import form.Armazem;
import form.Cad;
import form.Panel1;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import menu.MenuItem;

/**
 *
 * @author RavenPC
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }

    private void execute() {
        ImageIcon iconStaff = new ImageIcon(getClass().getResource("/menu/user.png"));
        ImageIcon iconSetting = new ImageIcon(getClass().getResource("/menu/setting.png"));
        ImageIcon iconDatabase = new ImageIcon(getClass().getResource("/menu/database.png"));
        ImageIcon iconMessage = new ImageIcon(getClass().getResource("/menu/message.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/menu/subMenu.png"));
        ImageIcon iconNext = new ImageIcon(getClass().getResource("/menu/next.png"));
        //  create submenu staff
        MenuItem menuStaff1 = new MenuItem(iconSubMenu, "Cadastrar Funcionarios", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.add(new Panel1());
                panelBody.repaint();
                panelBody.revalidate();
               
                
            
            }
        });
        MenuItem menuStaff2 = new MenuItem(iconSubMenu, "Cadastrar Produtos", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel1 p = new Panel1();
                p.setVisible(false);
                panelBody.remove(p);
                panelBody.add(new Cad());
                panelBody.repaint();
                panelBody.revalidate();
                
                
            }
        });
        MenuItem menuStaff3 = new MenuItem(iconSubMenu, "Ver o Armazem", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.add(new Armazem());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        //  create submenu setting message

        MenuItem message1 = new MenuItem(iconNext, "Actualizaçao Do Staff", null);
        MenuItem message2 = new MenuItem(iconNext, "Relatorio", null);
        MenuItem message3 = new MenuItem(iconNext, "Sobre Nos", null);

        //  create submenu setting 
        MenuItem menuSetting1 = new MenuItem(iconSubMenu, "Actualizazaco de Produtos", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Actualizacao act = new Actualizacao();
                panelBody.add(new Actualizacao());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem menuSettingMessage = new MenuItem(iconMessage, "Mais", null, message1, message2, message3);
        MenuItem menuSetting3 = new MenuItem(iconSubMenu, "Estatistica Barra", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Barras b = new Barras();
                b.setVisible(true);
                Pizza p = new Pizza();
                p.setVisible(false);
                
            }
        });
        MenuItem menuSetting4 = new MenuItem(iconSubMenu, "Estatistica Pizza", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pizza p = new Pizza();
                p.setVisible(true);
                Barras b = new Barras();
                b.setVisible(false);
            }
        });

        MenuItem menuStaff = new MenuItem(iconStaff, "Cadastro", null, menuStaff1, menuStaff2, menuStaff3);
        MenuItem menuSetting = new MenuItem(iconSetting, "Avançados", null, menuSetting1, menuSettingMessage, menuSetting3, menuSetting4);
        MenuItem menuDatabase = new MenuItem(iconDatabase, "System Database", null);
        addMenu(menuStaff, menuSetting, menuDatabase);
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lblhora = new javax.swing.JLabel();
        lbldata = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        panelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelHeader.setBackground(new java.awt.Color(45, 113, 248));
        panelHeader.setPreferredSize(new java.awt.Dimension(561, 50));

        lblhora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbldata.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(655, Short.MAX_VALUE)
                .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbldata, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldata, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        panelMenu.setBackground(new java.awt.Color(115, 120, 230));
        panelMenu.setPreferredSize(new java.awt.Dimension(250, 384));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(871, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        Date  dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lbldata.setText(formato.format(dataSistema));
        
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldata;
    private javax.swing.JLabel lblhora;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables


    class hora implements ActionListener{
       
        @Override
        public void actionPerformed(ActionEvent e) { 
            Calendar now = Calendar.getInstance();
            lblhora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }
}
