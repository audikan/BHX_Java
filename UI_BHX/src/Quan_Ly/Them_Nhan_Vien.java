/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Quan_Ly;

/**
 *
 * @author trong
 */
public class Them_Nhan_Vien extends javax.swing.JFrame {

    /**
     * Creates new form Them_Nhan_Vien
     */
    public Them_Nhan_Vien() {
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

        info_label = new javax.swing.JPanel();
        HoTen_Label = new javax.swing.JLabel();
        SDT_Label = new javax.swing.JLabel();
        Tuoi_Label = new javax.swing.JLabel();
        NgayVaoLam_Label = new javax.swing.JLabel();
        Luong_Label = new javax.swing.JLabel();
        HoTen_Txt = new javax.swing.JTextField();
        SDT_Txt = new javax.swing.JTextField();
        Tuoi_Txt = new javax.swing.JTextField();
        NgayVaoLam_Txt = new javax.swing.JTextField();
        Luong_Txt = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        HoTen_Label1 = new javax.swing.JLabel();
        HoTen_Txt1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_label = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        ThemNhanVien_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm Nhân viên");

        HoTen_Label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        HoTen_Label.setText("Họ Tên");

        SDT_Label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SDT_Label.setText("Số Điện thoại");

        Tuoi_Label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Tuoi_Label.setText("Tuổi");

        NgayVaoLam_Label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NgayVaoLam_Label.setText("Ngày vào làm");

        Luong_Label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Luong_Label.setText("Lương");

        HoTen_Txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        SDT_Txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Tuoi_Txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        NgayVaoLam_Txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Luong_Txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jCheckBox1.setText("Full Time");

        HoTen_Label1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        HoTen_Label1.setText("Ảnh thẻ");

        HoTen_Txt1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout info_labelLayout = new javax.swing.GroupLayout(info_label);
        info_label.setLayout(info_labelLayout);
        info_labelLayout.setHorizontalGroup(
            info_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_labelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(info_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Luong_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NgayVaoLam_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(Tuoi_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SDT_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HoTen_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HoTen_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(info_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(info_labelLayout.createSequentialGroup()
                        .addComponent(HoTen_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(SDT_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tuoi_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgayVaoLam_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Luong_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoTen_Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        info_labelLayout.setVerticalGroup(
            info_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_labelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(info_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoTen_Label1)
                    .addComponent(HoTen_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HoTen_Label)
                    .addComponent(HoTen_Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SDT_Label)
                    .addComponent(SDT_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tuoi_Label)
                    .addComponent(Tuoi_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NgayVaoLam_Label)
                    .addComponent(NgayVaoLam_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Luong_Label)
                    .addComponent(Luong_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_them.setBackground(new java.awt.Color(153, 255, 255));
        btn_them.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(204, 255, 204));
        btn_reset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_reset.setText("Đặt lại");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_labelLayout = new javax.swing.GroupLayout(btn_label);
        btn_label.setLayout(btn_labelLayout);
        btn_labelLayout.setHorizontalGroup(
            btn_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_labelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_them)
                .addGap(18, 18, 18)
                .addComponent(btn_reset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_labelLayout.setVerticalGroup(
            btn_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_labelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_reset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ThemNhanVien_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ThemNhanVien_label.setText("THÊM NHÂN VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ThemNhanVien_label)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ThemNhanVien_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Them_Nhan_Vien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Them_Nhan_Vien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Them_Nhan_Vien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Them_Nhan_Vien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Them_Nhan_Vien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HoTen_Label;
    private javax.swing.JLabel HoTen_Label1;
    private javax.swing.JTextField HoTen_Txt;
    private javax.swing.JTextField HoTen_Txt1;
    private javax.swing.JLabel Luong_Label;
    private javax.swing.JTextField Luong_Txt;
    private javax.swing.JLabel NgayVaoLam_Label;
    private javax.swing.JTextField NgayVaoLam_Txt;
    private javax.swing.JLabel SDT_Label;
    private javax.swing.JTextField SDT_Txt;
    private javax.swing.JLabel ThemNhanVien_label;
    private javax.swing.JLabel Tuoi_Label;
    private javax.swing.JTextField Tuoi_Txt;
    private javax.swing.JPanel btn_label;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_them;
    private javax.swing.JPanel info_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    // End of variables declaration//GEN-END:variables
}
