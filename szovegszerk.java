/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szovszerk;

import java.awt.Cursor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ut221-02
 */
public class Szovegszerkeszto extends javax.swing.JFrame {

    TxtAllomany allomany;
    JFileChooser fajlValaszto;

    public Szovegszerkeszto() {
        initComponents();
        allomany = new TxtAllomany("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAllapot = new javax.swing.JLabel();
        tbEszkoztar = new javax.swing.JToolBar();
        btUj = new javax.swing.JButton();
        btMegnyitas = new javax.swing.JButton();
        btMentes = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btKivagas = new javax.swing.JButton();
        btMasolas = new javax.swing.JButton();
        btBeillesztes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSzoveg = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mFajl = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        miMegnyitas = new javax.swing.JMenuItem();
        miMentes = new javax.swing.JMenuItem();
        miMentesMaskent = new javax.swing.JMenuItem();
        mibeillesztes = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        miBeallitasok = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        miNevjegy = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Szövegszerkesztő");

        lbAllapot.setText("Sor: 1 Oszlop: 1");
        getContentPane().add(lbAllapot, java.awt.BorderLayout.PAGE_END);

        tbEszkoztar.setRollover(true);

        btUj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/uj.png"))); // NOI18N
        btUj.setFocusable(false);
        btUj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btUj.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uj(evt);
            }
        });
        tbEszkoztar.add(btUj);

        btMegnyitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/megnyitas.png"))); // NOI18N
        btMegnyitas.setFocusable(false);
        btMegnyitas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btMegnyitas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btMegnyitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megnyitas(evt);
            }
        });
        tbEszkoztar.add(btMegnyitas);

        btMentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/mentes.png"))); // NOI18N
        btMentes.setFocusable(false);
        btMentes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btMentes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentes(evt);
            }
        });
        tbEszkoztar.add(btMentes);
        tbEszkoztar.add(jSeparator1);

        btKivagas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kivag.png"))); // NOI18N
        btKivagas.setFocusable(false);
        btKivagas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btKivagas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbEszkoztar.add(btKivagas);

        btMasolas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/masol.png"))); // NOI18N
        btMasolas.setFocusable(false);
        btMasolas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btMasolas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbEszkoztar.add(btMasolas);

        btBeillesztes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/beilleszt.png"))); // NOI18N
        btBeillesztes.setFocusable(false);
        btBeillesztes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBeillesztes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbEszkoztar.add(btBeillesztes);

        getContentPane().add(tbEszkoztar, java.awt.BorderLayout.PAGE_START);

        taSzoveg.setColumns(20);
        taSzoveg.setRows(5);
        taSzoveg.setPreferredSize(new java.awt.Dimension(208, 128));
        jScrollPane1.setViewportView(taSzoveg);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        mFajl.setMnemonic('F');
        mFajl.setText("Fájl");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/uj.png"))); // NOI18N
        jMenuItem1.setMnemonic('\u00da');
        jMenuItem1.setText("Új");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uj(evt);
            }
        });
        mFajl.add(jMenuItem1);

        miMegnyitas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        miMegnyitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/megnyitas.png"))); // NOI18N
        miMegnyitas.setMnemonic('n');
        miMegnyitas.setText("Megnyitás...");
        miMegnyitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megnyitas(evt);
            }
        });
        mFajl.add(miMegnyitas);

        miMentes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miMentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/mentes.png"))); // NOI18N
        miMentes.setMnemonic('m');
        miMentes.setText("Mentés");
        miMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentes(evt);
            }
        });
        mFajl.add(miMentes);

        miMentesMaskent.setText("Mentés másként...");
        miMentesMaskent.setToolTipText("s");
        mFajl.add(miMentesMaskent);

        jMenuBar1.add(mFajl);

        mibeillesztes.setMnemonic('z');
        mibeillesztes.setText("Szerkesztés");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kivag.png"))); // NOI18N
        jMenuItem5.setMnemonic('k');
        jMenuItem5.setText("Kivágás");
        mibeillesztes.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/masol.png"))); // NOI18N
        jMenuItem6.setMnemonic('m');
        jMenuItem6.setText("Másolás");
        mibeillesztes.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setMnemonic('b');
        jMenuItem7.setText("Beillesztés");
        mibeillesztes.add(jMenuItem7);

        jMenuBar1.add(mibeillesztes);

        miBeallitasok.setMnemonic('s');
        miBeallitasok.setText("Eszközök");

        jMenuItem8.setMnemonic('t');
        jMenuItem8.setText("Beállítások");
        miBeallitasok.add(jMenuItem8);

        jMenuBar1.add(miBeallitasok);

        miNevjegy.setMnemonic('g');
        miNevjegy.setText("Súgó");

        jMenuItem9.setMnemonic('n');
        jMenuItem9.setText("Névjegy...");
        miNevjegy.add(jMenuItem9);

        jMenuBar1.add(miNevjegy);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mentes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentes
        allomany.setTartalom(taSzoveg.getText());
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        fajlValaszto = new JFileChooser();
        if (allomany.getFajl() == null) {
            fajlValaszto.setDialogTitle("Mentes");
            if (fajlValaszto.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                //Ok gomb
                allomany.setFajl(fajlValaszto.getSelectedFile());
            } else return;
        }
        try {
                allomany.mentes();
                setTitle(allomany.getFaljNev());
            } catch (IOException ex) {
                System.err.println("IEException!");
                JOptionPane.showMessageDialog(null, "Fajl írási hiba!!!", "Hiba", JOptionPane.OK_OPTION);
            }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mentes

    private void uj(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uj
        taSzoveg.setText("");
        setTitle("Névtelen");
        allomany.setFajl(null);
        allomany.setTartalom(null);
    }//GEN-LAST:event_uj

    private void megnyitas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megnyitas
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        fajlValaszto = new JFileChooser();
        fajlValaszto.setDialogTitle("Megnyitas");
        if(fajlValaszto.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){ 
            try {
                allomany.setFajl(fajlValaszto.getSelectedFile());
                allomany.megnyit();
                taSzoveg.setText(allomany.getTartalom());
                setTitle(allomany.getFaljNev());
            } catch (IOException ex) {
                JOptionPane.showInternalMessageDialog(null, "A fajl megnyitasa sikertelen!", "HIBA", JOptionPane.OK_OPTION);
            } 
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_megnyitas

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
            java.util.logging.Logger.getLogger(Szovegszerkeszto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szovegszerkeszto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szovegszerkeszto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szovegszerkeszto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szovegszerkeszto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBeillesztes;
    private javax.swing.JButton btKivagas;
    private javax.swing.JButton btMasolas;
    private javax.swing.JButton btMegnyitas;
    private javax.swing.JButton btMentes;
    private javax.swing.JButton btUj;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JLabel lbAllapot;
    private javax.swing.JMenu mFajl;
    private javax.swing.JMenu miBeallitasok;
    private javax.swing.JMenuItem miMegnyitas;
    private javax.swing.JMenuItem miMentes;
    private javax.swing.JMenuItem miMentesMaskent;
    private javax.swing.JMenu miNevjegy;
    private javax.swing.JMenu mibeillesztes;
    private javax.swing.JTextArea taSzoveg;
    private javax.swing.JToolBar tbEszkoztar;
    // End of variables declaration//GEN-END:variables
}
