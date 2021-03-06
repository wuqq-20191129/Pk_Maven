package com.goldsign.csfrm.ui.dialog;

import com.goldsign.csfrm.env.BaseConstant;
import com.goldsign.csfrm.ui.common.LengthLimitDocument;
import com.goldsign.csfrm.vo.CallResult;
import com.goldsign.csfrm.vo.LoginParam;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author  Administrator
 * 
 * 登录窗口
 * 
 */
public class LoginDialog extends javax.swing.JDialog {

    private static Logger logger = Logger.getLogger(LoginDialog.class.getName());
    private String sysName = BaseConstant.APP_NAME_SELF_ADAPTION;
    /** Creates new form LoginDialog */
    public LoginDialog(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
       
        initComponents();
        
        //初始化工作区域
        initWorkArea();
        jLabel1.setText(sysName);
        jLabel1.setVerticalAlignment(JLabel.BOTTOM); 
        jLabel1.setHorizontalAlignment(JLabel.CENTER);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        workPanel = new javax.swing.JPanel();
        employeeIDLabel = new JLabel();
        employeeIDTextField = new javax.swing.JTextField();
        passwordLabel = new JLabel();
        passwordField = new javax.swing.JPasswordField();
        OkButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        promptLabel = new JLabel();
        versionLbl = new JLabel();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setModal(true);
        setUndecorated(true);

        workPanel.setBackground(new java.awt.Color(255, 255, 255));
        workPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        employeeIDLabel.setText("工号");

        employeeIDTextField.setDocument(new LengthLimitDocument(8));
        employeeIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDTextFieldActionPerformed(evt);
            }
        });
        employeeIDTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                employeeIDTextFieldKeyPressed(evt);
            }
        });

        passwordLabel.setText("密码");

        passwordField.setDocument(new LengthLimitDocument(9));
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        OkButton.setBackground(new java.awt.Color(255, 255, 255));
        OkButton.setBorder(null);
        OkButton.setEnabled(false);
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        OkButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OkButtonKeyPressed(evt);
            }
        });

        cancelButton.setBorder(null);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        promptLabel.setBackground(new java.awt.Color(255, 255, 255));
        promptLabel.setFont(new java.awt.Font("黑体", 0, 12)); // NOI18N
        promptLabel.setForeground(java.awt.Color.red);
        promptLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        versionLbl.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        versionLbl.setForeground(new java.awt.Color(255, 93, 2));
        versionLbl.setText("V0.0.1");

        jLabel1.setBackground(getBackground());
        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        org.jdesktop.layout.GroupLayout workPanelLayout = new org.jdesktop.layout.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(workPanelLayout.createSequentialGroup()
                .add(workPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, workPanelLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(versionLbl))
                    .add(workPanelLayout.createSequentialGroup()
                        .add(69, 69, 69)
                        .add(workPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(workPanelLayout.createSequentialGroup()
                                .add(OkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(cancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(workPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(workPanelLayout.createSequentialGroup()
                                    .add(employeeIDLabel)
                                    .add(25, 25, 25)
                                    .add(employeeIDTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(workPanelLayout.createSequentialGroup()
                                    .add(passwordLabel)
                                    .add(25, 25, 25)
                                    .add(passwordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(0, 72, Short.MAX_VALUE)))
                .addContainerGap())
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(promptLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        workPanelLayout.linkSize(new java.awt.Component[] {employeeIDTextField, passwordField}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, workPanelLayout.createSequentialGroup()
                .add(58, 58, 58)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(promptLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .add(48, 48, 48)
                .add(workPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(employeeIDTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(employeeIDLabel))
                .add(18, 18, 18)
                .add(workPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(passwordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(passwordLabel))
                .add(26, 26, 26)
                .add(workPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(OkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(37, 37, 37)
                .add(versionLbl)
                .addContainerGap())
        );

        workPanelLayout.linkSize(new java.awt.Component[] {employeeIDLabel, employeeIDTextField, passwordField, passwordLabel}, org.jdesktop.layout.GroupLayout.VERTICAL);

        workPanelLayout.linkSize(new java.awt.Component[] {OkButton, cancelButton}, org.jdesktop.layout.GroupLayout.VERTICAL);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(workPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(workPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void OkButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OkButtonKeyPressed
        
        if (evt.getKeyCode()==evt.VK_ENTER){
            this.logResult();
        }
    }//GEN-LAST:event_OkButtonKeyPressed
    
    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        
        if (evt.getKeyCode()==evt.VK_ENTER){
            if (!this.OkButton.isEnabled()) {
                return;
            }
            this.logResult();
        }
    }//GEN-LAST:event_passwordFieldKeyPressed
    
    private void employeeIDTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeIDTextFieldKeyPressed
        
        if (evt.getKeyCode()==evt.VK_ENTER){
            this.passwordField.grabFocus();
        }
    }//GEN-LAST:event_employeeIDTextFieldKeyPressed
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
       
        System.exit(88);
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        
        this.logResult();
    }//GEN-LAST:event_OkButtonActionPerformed

    private void employeeIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeIDTextFieldActionPerformed

    /**
     * 登录
     * 
     */
    private void logResult() {
        
        String employeeid = this.employeeIDTextField.getText();
        String password = new String(this.passwordField.getPassword());
        
        LoginParam loginParam = new LoginParam();
        
        loginParam.setUserNo(employeeid.trim());
        loginParam.setPasswrod(password.trim());
        loginParam.setParam(this);
        
        try {
            CallResult callResult = BaseConstant.application.login(loginParam);    
            
            if(!callResult.isSuccess()){
                logger.info(callResult.getMsg());
                this.promptLabel.setText(callResult.getMsg());
                
                return;
            }

            this.dispose();
        } catch (Exception ex) {
            setLoginEnable(false);
            logger.log(Level.SEVERE, "登录失败...", ex);
            this.promptLabel.setText("系统异常,请联系管理员.");
        }
        
    }

    /**
     * 初始化工作区域
     * 
     */
    private void initWorkArea(){
        
        this.workPanel.setSize(this.getWidth(),this.getHeight());
        
        JLabel label = new JLabel();
        label.setSize(this.workPanel.getSize());
        
        this.workPanel.add(label);
        
        this.addImageForLabel(label,"login.jpg");
        
        addImageForLogout();    //添加取消按钮图片
        addImageForLogin();     //添加登录按钮图片
        
    }
    
    /**
     * 为标签加载图片
     * 
     * @param lable
     * @param imagName 
     */
    private void addImageForLabel(JLabel lable,String imagName){
        
        ImageIcon icon = new ImageIcon(BaseConstant.appWorkDir+"/src/main/resources/images/"+imagName);
        int  width =0;
        int  height =0;
        Image img =icon.getImage();
        width =lable.getWidth();
        height = lable.getHeight();
        img = img.getScaledInstance(width,height,Image.SCALE_DEFAULT);
        icon.setImage(img);
        lable.setIcon(icon);
        
    }

    /**
     * 为标签加载图片
     * 
     */
    private void addImageForLogin(){
        
        ImageIcon icon = new ImageIcon(BaseConstant.appWorkDir+"/src/main/resources//images/denglu.jpg");
        int  width =0;
        int  height =0;
        Image img =icon.getImage();
        width =OkButton.getWidth();
        height = OkButton.getHeight();
        img = img.getScaledInstance(width,height,Image.SCALE_DEFAULT);
        icon.setImage(img);
        this.OkButton.setIcon(icon);
        
    }

    /**
     * 为标签加载图片
     * 
     */
    private void addImageForLogout(){
        
        ImageIcon icon = new ImageIcon(BaseConstant.appWorkDir+"/src/main/resources//images/tuichu.jpg");
        int  width =0;
        int  height =0;
        Image img =icon.getImage();
        width =cancelButton.getWidth();
        height = cancelButton.getHeight();
        img = img.getScaledInstance(width,height,Image.SCALE_DEFAULT);
        icon.setImage(img);
        cancelButton.setIcon(icon);
    }
    
    public void setPromptMsg(String msg){
        
        this.promptLabel.setText(msg);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OkButton;
    private javax.swing.JButton cancelButton;
    private JLabel employeeIDLabel;
    private javax.swing.JTextField employeeIDTextField;
    private JLabel jLabel1;
    protected javax.swing.JPasswordField passwordField;
    private JLabel passwordLabel;
    private JLabel promptLabel;
    private JLabel versionLbl;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables

    /**
     * 设置按钮能动性
     * 
     * @param enable 
     */
    public void setLoginEnable(boolean enable) {
        this.OkButton.setEnabled(enable);
    }

    /**
     * 设置应用版本号
     * 
     * @param versionNo 
     */
    public void setAppVersionNo(String versionNo){
        this.versionLbl.setText(versionNo);
    }
}
