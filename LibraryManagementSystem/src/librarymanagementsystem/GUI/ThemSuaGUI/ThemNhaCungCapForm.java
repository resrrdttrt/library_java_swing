
package librarymanagementsystem.GUI.ThemSuaGUI;

import java.awt.Color;
import librarymanagementsystem.GUI.*;
import librarymanagementsystem.Toolkit.DataProcessing;
import librarymanagementsystem.BUS.QLNhaCungCapBUS;
import librarymanagementsystem.DTO.QLNhaCungCapDTO;

public class ThemNhaCungCapForm extends javax.swing.JFrame{
    int x_Mouse, y_Mouse; // For Moving Window
    static String error_mess;
    DataProcessing dp = new DataProcessing();
    static QLNhaCungCapBUS nccBUS = new QLNhaCungCapBUS();
    
    
    public ThemNhaCungCapForm() {
        initComponents();
        setSize(550, 402);
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addButton = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        movingWindow = new javax.swing.JLabel();
        tenNCC_textField = new javax.swing.JTextField();
        sdt_textField = new javax.swing.JTextField();
        email_textField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        diaChi_textField = new javax.swing.JTextField();
        nhaCungCapForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T235936.194.png"))); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        addButton.setBounds(10, 7, 35, 35);
        jPanel1.add(addButton);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools (43).png"))); // NOI18N
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        exitButton.setBounds(510, 16, 20, 20);
        jPanel1.add(exitButton);

        movingWindow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingWindowMouseDragged(evt);
            }
        });
        movingWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingWindowMousePressed(evt);
            }
        });
        movingWindow.setBounds(0, 0, 550, 60);
        jPanel1.add(movingWindow);

        tenNCC_textField.setBackground(new java.awt.Color(245, 247, 250));
        tenNCC_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tenNCC_textField.setText("");
        tenNCC_textField.setBorder(null);
        tenNCC_textField.setOpaque(false);
        tenNCC_textField.setBounds(40, 123, 190, 30);
        jPanel1.add(tenNCC_textField);

        diaChi_textField.setBackground(new java.awt.Color(245, 247, 250));
        diaChi_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        diaChi_textField.setText("");
        diaChi_textField.setBorder(null);
        diaChi_textField.setOpaque(false);
        diaChi_textField.setBounds(40, 246, 190, 30);
        jPanel1.add(diaChi_textField);

        sdt_textField.setBackground(new java.awt.Color(245, 247, 250));
        sdt_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sdt_textField.setText("");
        sdt_textField.setBorder(null);
        sdt_textField.setOpaque(false);
        sdt_textField.setBounds(312, 123, 157, 30);
        jPanel1.add(sdt_textField);

        email_textField.setBackground(new java.awt.Color(245, 247, 250));
        email_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email_textField.setText("");
        email_textField.setBorder(null);
        email_textField.setOpaque(false);
        email_textField.setBounds(315, 246, 200, 30);
        jPanel1.add(email_textField);

        nhaCungCapForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtoolsthemncc.png"))); // NOI18N
        nhaCungCapForm.setBounds(0, 0, 550, 402);
        jPanel1.add(nhaCungCapForm);
        jPanel1.setBounds(0, 0, 550, 402);
        
        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean check_input(String tenNCC, String diaChi, String sdt, String email){
        if (tenNCC.equals("")){
            error_mess = "Tên Nhà Cung Cấp trống!!!";
            return false;
        }
        else if (diaChi.equals("")){
            error_mess = "Địa Chỉ trống!!!";
            return false;
        }
        else if (sdt.equals("")){
            error_mess = "Số Điện Thoại trống!!!";
            return false;
        }
        else if (email.equals("")){
            error_mess = "Email trống!!!";
            return false;
        }
        else if (dp.check_sdt(sdt)!=true){
            error_mess = "Số Điện Thoại nhập sai!!!";
            return false;
        }
        else if (dp.check_email(email)!=true){
            error_mess = "Email nhập sai!!!";
            return false;
        }
        
        return true;
    }
    
    private void movingWindowMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingWindowMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        setLocation(x - x_Mouse, y - y_Mouse);
    }//GEN-LAST:event_movingWindowMouseDragged

    
    private void movingWindowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingWindowMousePressed
        x_Mouse = evt.getX();
        y_Mouse = evt.getY();
    }//GEN-LAST:event_movingWindowMousePressed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitButtonMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        String tenNCC = tenNCC_textField.getText();
        String diaChi = diaChi_textField.getText();
        String sdt = sdt_textField.getText();
        String email = email_textField.getText();
        String maNCC = dp.next_maNCC(nccBUS.getPKey());
        
        if (check_input(tenNCC, diaChi, sdt, email)){
            System.out.println("Nhập Thành Công");
            if (nccBUS.add(maNCC,tenNCC, sdt, email, diaChi)){
                new AlertGUI(3, "Success", "Nhập Nhà Cung Cấp Thành Công!!!", "Quay Lại").setVisible(true);
                this.dispose();
            }
        }
        else{
            System.err.println(error_mess);
            System.out.println("Nhập Thất Bại");
            new AlertGUI(2, "Error", error_mess, "Quay Lại").setVisible(true);
            // Alert Form
        }
        
        System.out.println(maNCC);
        System.out.println(tenNCC);
        System.out.println(diaChi);
        System.out.println(sdt);
        System.out.println(email);
    }//GEN-LAST:event_addButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ThemNhaCungCapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemNhaCungCapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemNhaCungCapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemNhaCungCapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemNhaCungCapForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nhaCungCapForm;
    private javax.swing.JLabel movingWindow;
    private javax.swing.JTextField tenNCC_textField;
    private javax.swing.JTextField sdt_textField;
    private javax.swing.JTextField email_textField;
    private javax.swing.JTextField diaChi_textField;
    // End of variables declaration//GEN-END:variables
}


