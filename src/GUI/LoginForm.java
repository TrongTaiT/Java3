package GUI;

import Helper.Validator;
import Helper.FrameDragListener;
import Model.User;
import DAO.UserDAO;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.net.URI;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Dev-StOrM
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     *
     */
    public LoginForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        lblFormTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fploy = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        chkShowPassword = new javax.swing.JCheckBox();
        btnSignIn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblAboutAccount = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblAuthor = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainPanel.setBackground(java.awt.Color.white);
        MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FPT_lego_crop.png"))); // NOI18N
        jLabel1.setAlignmentY(1.0F);
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 390));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_close_window_24px.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        MainPanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        lblFormTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFormTitle.setText("Login");
        MainPanel.add(lblFormTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 70, 30));

        jPanel1.setBackground(new java.awt.Color(242, 111, 33));

        fploy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/banner_crop.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(fploy)
                .addContainerGap(601, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fploy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 810, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fpt_icon_1.png"))); // NOI18N
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 119, 26), 1, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setLabelFor(txtUsername);
        jLabel4.setText("Tài khoản");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername.setCaretColor(new java.awt.Color(242, 113, 37));
        txtUsername.setMargin(new java.awt.Insets(0, 10, 0, 10));
        txtUsername.setSelectedTextColor(new java.awt.Color(242, 113, 37));
        txtUsername.setSelectionColor(new java.awt.Color(0, 183, 68));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setLabelFor(pwdPassword);
        jLabel5.setText("Mật khẩu");

        pwdPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pwdPassword.setCaretColor(new java.awt.Color(242, 113, 37));
        pwdPassword.setMargin(new java.awt.Insets(0, 10, 0, 10));
        pwdPassword.setSelectedTextColor(new java.awt.Color(242, 113, 37));
        pwdPassword.setSelectionColor(new java.awt.Color(0, 183, 68));

        jPanel3.setBackground(java.awt.Color.white);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 113, 37));
        jLabel6.setText("Sign in");
        jPanel3.add(jLabel6);

        chkShowPassword.setText("Hiện mật khẩu?");
        chkShowPassword.setToolTipText("Hiển thị mật khẩu trên thanh mật khẩu");
        chkShowPassword.setBorderPaintedFlat(true);
        chkShowPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPasswordActionPerformed(evt);
            }
        });

        btnSignIn.setBackground(new java.awt.Color(251, 119, 26));
        btnSignIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("ĐĂNG NHẬP");
        btnSignIn.setToolTipText("");
        btnSignIn.setActionCommand("signin");
        btnSignIn.setBorder(null);
        btnSignIn.setBorderPainted(false);
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.setFocusable(false);
        btnSignIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignIn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSignIn.setName(""); // NOI18N
        btnSignIn.setRequestFocusEnabled(false);
        btnSignIn.setRolloverEnabled(false);
        btnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignInMouseExited(evt);
            }
        });
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        jPanel5.setBackground(java.awt.Color.white);

        lblAboutAccount.setForeground(new java.awt.Color(0, 102, 204));
        lblAboutAccount.setText("Quên mật khẩu hoặc chưa có tài khoản?");
        lblAboutAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAboutAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAboutAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAuthorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAuthorMouseExited(evt);
            }
        });
        jPanel5.add(lblAboutAccount);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chkShowPassword)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(btnSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(pwdPassword)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkShowPassword)
                .addGap(38, 38, 38)
                .addComponent(btnSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pwdPassword.getAccessibleContext().setAccessibleDescription("");

        MainPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 320, 350));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setOpaque(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0);
        flowLayout1.setAlignOnBaseline(true);
        jPanel4.setLayout(flowLayout1);

        lblAuthor.setForeground(new java.awt.Color(0, 102, 204));
        lblAuthor.setText("© Copyright - Nguyễn Trọng Tài - PS15069");
        lblAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAuthorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAuthorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAuthorMouseExited(evt);
            }
        });
        jPanel4.add(lblAuthor);

        MainPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 770, 20));

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_minimize_window_24px_1.png"))); // NOI18N
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });
        MainPanel.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        int confirmation = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát?",
                "Thoát chương trình", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitMouseClicked

    private void lblAboutAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutAccountMouseClicked
        JOptionPane.showMessageDialog(this, "Vui lòng liên hệ bộ phận IT để giải quyết");
    }//GEN-LAST:event_lblAboutAccountMouseClicked

    private void btnSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseEntered
        btnSignIn.setBackground(new Color(13, 176, 75));
    }//GEN-LAST:event_btnSignInMouseEntered

    private void btnSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseExited
        btnSignIn.setBackground(new Color(251, 119, 26));
    }//GEN-LAST:event_btnSignInMouseExited

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String username = txtUsername.getText();
        String password = String.valueOf(pwdPassword.getPassword());

        // check null
        if (Validator.isNull(username)) {
            JOptionPane.showMessageDialog(this, "Chưa nhập Tên đăng nhập", "Lỗi nhập",
                    JOptionPane.ERROR_MESSAGE);
            txtUsername.requestFocus();
            return;
        }
        if (Validator.isNull(password)) {
            JOptionPane.showMessageDialog(this, "Chưa nhập Mật khẩu", "Lỗi nhập",
                    JOptionPane.ERROR_MESSAGE);
            pwdPassword.requestFocus();
            return;
        }

        // check Account in db
        User userTemp = UserDAO.get(username);
        if (userTemp != null && userTemp.getPassword().equals(password)) {
            if (userTemp.getRole().equals("Giảng viên")) {
                EventQueue.invokeLater(() -> {
                    new FrameDragListener(new GradeManagementForm(username));
                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công\n"
                            + "Xin chào " + username + "!");
                });
            } else {
                EventQueue.invokeLater(() -> {
                    new FrameDragListener(new StudentManagementForm(username));
                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công\n"
                            + "Xin chào " + username + "!");
                });
            }
            this.dispose(); // close this form if user input correct account.
            
        } else {
            // sign in failed
            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại\nVui lòng kiểm tra lại tài khoản",
                    "Lỗi nhập", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void chkShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPasswordActionPerformed
        if (chkShowPassword.isSelected()) {
            pwdPassword.setEchoChar((char) 0);
        } else {
            pwdPassword.setEchoChar('•');
        }
    }//GEN-LAST:event_chkShowPasswordActionPerformed

    private void lblAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAuthorMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/tai.nguyen.5832343/"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_lblAuthorMouseClicked

    private void lblAuthorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAuthorMouseEntered
        JLabel tempLabel = (JLabel) evt.getSource();
        tempLabel.setForeground(new Color(242, 113, 37));
    }//GEN-LAST:event_lblAuthorMouseEntered

    private void lblAuthorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAuthorMouseExited
        JLabel tempLabel = (JLabel) evt.getSource();
        tempLabel.setForeground(new Color(0, 102, 178));
    }//GEN-LAST:event_lblAuthorMouseExited

// Main was here :(
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JCheckBox chkShowPassword;
    private javax.swing.JLabel fploy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAboutAccount;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblFormTitle;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
