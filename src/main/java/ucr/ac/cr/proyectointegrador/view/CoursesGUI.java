/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.view;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author familiacr
 */
public class CoursesGUI extends javax.swing.JFrame {

    /**
     * Creates new form CoursesGUI
     */
    public CoursesGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void listen(ActionListener controller) {
        this.btnBack.addActionListener(controller);
    }

    public static void getMessage(String msj) {
        JOptionPane.showMessageDialog(null, msj);
    }

    public CoursesDataPanel getCoursesDataPanel() {
        return this.coursesDataPanel;
    }

    public ButtonsPanel getButtonsPanel() {
        return this.buttonsPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonsPanel = new ucr.ac.cr.proyectointegrador.view.ButtonsPanel();
        btnBack = new javax.swing.JButton();
        coursesDataPanel = new ucr.ac.cr.proyectointegrador.view.CoursesDataPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonsPanel.setOpaque(false);
        getContentPane().add(buttonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 220, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnBack.png"))); // NOI18N
        btnBack.setActionCommand("Back");
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 70, -1, -1));

        coursesDataPanel.setOpaque(false);
        getContentPane().add(coursesDataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 760));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoCourses.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private ucr.ac.cr.proyectointegrador.view.ButtonsPanel buttonsPanel;
    private ucr.ac.cr.proyectointegrador.view.CoursesDataPanel coursesDataPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
