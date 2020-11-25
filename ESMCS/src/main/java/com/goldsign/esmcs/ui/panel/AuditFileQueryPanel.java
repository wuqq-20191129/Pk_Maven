
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GenIssueRequestPanel.java
 *
 * Created on 2011-8-3, 8:31:03
 */

package com.goldsign.esmcs.ui.panel;

import com.goldsign.csfrm.env.BaseConstant;
import com.goldsign.csfrm.ui.common.JDatePicker;
import com.goldsign.csfrm.util.DateHelper;
import com.goldsign.csfrm.util.MessageShowUtil;
import com.goldsign.csfrm.util.UIUtil;
import com.goldsign.csfrm.vo.CallParam;
import com.goldsign.csfrm.vo.CallResult;
import com.goldsign.csfrm.vo.SelectOptionVo;
import com.goldsign.esmcs.application.Application;
import com.goldsign.esmcs.env.AppConstant;
import com.goldsign.esmcs.exception.CommuException;
import com.goldsign.esmcs.exception.FileException;
import com.goldsign.esmcs.service.ICommuService;
import com.goldsign.esmcs.service.IFileService;
import com.goldsign.esmcs.service.impl.FileService;
import com.goldsign.esmcs.vo.AuditParam;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.log4j.Logger;

/**
 * 审计文件查询
 * 
 * @author Administrator
 */
public class AuditFileQueryPanel extends javax.swing.JPanel {

    private static Logger logger = Logger.getLogger(AuditFileQueryPanel.class.getName());
    
    private IFileService fileService;
    
    private JTable resultSetTableMain;
    private JTable resultSetTableDetail;
    private ICommuService commuService;

    /** Creates new form GenIssueRequestPanel */
    public AuditFileQueryPanel() {
        this.fileService = new FileService();
        this.commuService = ((Application)AppConstant.application).getCommuService();
        initComponents();
        initQueryCon();
        //doQuery();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        begDateCb = new javax.swing.JComboBox();
        btQuery = new javax.swing.JButton();
        endDateCb = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fileTypeCb = new javax.swing.JComboBox();
        rsTabPanel = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        mainSPn = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        mainSPI = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        uploadBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fileName = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(845, 589));

        jPanel1.setBackground(new java.awt.Color(237, 247, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(792, 105));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 39, 80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("文件日期：");

        begDateCb.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        begDateCb.setForeground(new java.awt.Color(0, 39, 80));
        begDateCb =new JDatePicker(JDatePicker.STYLE_CN_DATE1);

        btQuery.setBackground(new java.awt.Color(255, 255, 255));
        btQuery.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btQuery.setForeground(new java.awt.Color(0, 39, 80));
        btQuery.setText("查询");
        btQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQueryActionPerformed(evt);
            }
        });

        endDateCb.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        endDateCb.setForeground(new java.awt.Color(0, 39, 80));
        endDateCb =new JDatePicker(JDatePicker.STYLE_CN_DATE1);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 39, 80));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("至：");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(185, 227, 241));
        jTextField3.setFont(new java.awt.Font("宋体", 1, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(94, 55, 16));
        jTextField3.setText("   查询条件");
        jTextField3.setAlignmentX(0.0F);
        jTextField3.setAlignmentY(0.0F);
        jTextField3.setBorder(null);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 39, 80));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("文件类型：");

        fileTypeCb.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        fileTypeCb.setForeground(new java.awt.Color(0, 39, 80));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 788, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(jPanel1Layout.createSequentialGroup()
                .add(83, 83, 83)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel8)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(begDateCb, 0, 115, Short.MAX_VALUE)
                    .add(fileTypeCb, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(50, 50, 50)
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(endDateCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(45, 45, 45)
                .add(btQuery, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(10, 10, 10)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(begDateCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(endDateCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btQuery))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fileTypeCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8))
                .add(19, 19, 19))
        );

        rsTabPanel.setBackground(new java.awt.Color(255, 255, 255));
        rsTabPanel.setForeground(new java.awt.Color(94, 55, 16));
        rsTabPanel.setFont(new java.awt.Font("宋体", 1, 15)); // NOI18N
        rsTabPanel.setPreferredSize(new java.awt.Dimension(792, 461));

        jPanel6.setBackground(new java.awt.Color(254, 254, 254));

        mainSPn.setBackground(new java.awt.Color(255, 255, 255));
        mainSPn.setBorder(null);

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .add(mainSPn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 783, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 4, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainSPn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        rsTabPanel.addTab("文件列表", jPanel6);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        mainSPI.setBackground(new java.awt.Color(254, 254, 254));
        mainSPI.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(237, 247, 249));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(790, 108));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uploadBtn.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        uploadBtn.setForeground(new java.awt.Color(0, 39, 80));
        uploadBtn.setText("上传");
        uploadBtn.setEnabled(false);
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });
        jPanel3.add(uploadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 100, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 39, 80));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("文件名称：");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 25));

        fileName.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        fileName.setForeground(new java.awt.Color(0, 39, 80));
        jPanel3.add(fileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, 470, -1));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(185, 227, 241));
        jTextField4.setFont(new java.awt.Font("宋体", 1, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(94, 55, 16));
        jTextField4.setText("文件上传");
        jTextField4.setAlignmentX(0.0F);
        jTextField4.setAlignmentY(0.0F);
        jTextField4.setBorder(null);
        jTextField4.setPreferredSize(new java.awt.Dimension(788, 19));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, 25));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainSPI, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
            .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(mainSPI, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        rsTabPanel.addTab("文件明细", jPanel2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(rsTabPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(rsTabPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 461, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQueryActionPerformed
        // TODO add your handling code here:
        doQuery();
    }//GEN-LAST:event_btQueryActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        // TODO add your handling code here:
        upload();
    }//GEN-LAST:event_uploadBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox begDateCb;
    private javax.swing.JButton btQuery;
    private javax.swing.JComboBox endDateCb;
    private javax.swing.JTextField fileName;
    private javax.swing.JComboBox fileTypeCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JScrollPane mainSPI;
    private javax.swing.JScrollPane mainSPn;
    private javax.swing.JTabbedPane rsTabPanel;
    private javax.swing.JButton uploadBtn;
    // End of variables declaration//GEN-END:variables

    /**
     * 取查询条件
     * 
     * @return 
     */
    private AuditParam getQueryParam(){
        
        AuditParam auditParam =  new AuditParam();
        SelectOptionVo selectOptionVo = (SelectOptionVo)fileTypeCb.getSelectedItem();
        auditParam.setFileType(selectOptionVo.getValue());
        auditParam.setBeginDate(DateHelper.str10yyyy_MM_ddToStr8yyyyMMdd(begDateCb.getSelectedItem().toString()));
        auditParam.setEndDate(DateHelper.str10yyyy_MM_ddToStr8yyyyMMdd(endDateCb.getSelectedItem().toString()));
        
        return auditParam;
    }
    
    /**
     * 取审计和错误文件
     * 
     * @param auditParam
     * @return 
     */
    private List<Object[]> getAuditOrErrorFiles(AuditParam auditParam){
        
        List<Object[]> auditOrErrorFiles = new ArrayList<Object[]>();
        try {
            CallResult callResult = fileService.getLocalAuditAndErrorFiles(auditParam);
            if(callResult.isSuccess()){
                auditOrErrorFiles.addAll(callResult.getObjs());
            }
        } catch (FileException ex) {
            logger.error(ex);
            MessageShowUtil.alertErrorMsg(ex.getMessage());
        }
        
        return auditOrErrorFiles;
    }
    
    /**
     * 查询
     * 
     */
    private void doQuery(){
    
        //查询参数
        AuditParam auditParam =  getQueryParam();
        
        List<Object[]> auditOrErrorFiles = getAuditOrErrorFiles(auditParam);
        
        //生成列表
        genMainResultSetTable(auditOrErrorFiles);
        
        rsTabPanel.setSelectedIndex(0);
    }
    
    /**
     * 根据结果集，生成列表
     * 
     * @param result 
     */
    private void genMainResultSetTable(List<Object[]> result) {
        //列名称
        String[] columnNames = {"文件类型", "文件名称", "文件路径"};
        //列宽度
        int[] columnSize = {100, 150, 500};
        //生成列表
        resultSetTableMain = UIUtil.genResultSetTable(this.mainSPn, result, columnNames, columnSize);
        resultSetTableMain.addMouseListener(new MouseAdapter() {

             public void mouseClicked(MouseEvent e) {
                 if (e.getClickCount() == 2) {
                     String str = String.valueOf(resultSetTableMain.getModel().getValueAt(resultSetTableMain.getSelectedRow(), 0));
                     if(str.equals("错误")){
                        uploadBtn.setEnabled(true);
                     }else{
                        uploadBtn.setEnabled(false);
                     }                         
                     queryDetail();
                     
                 }
             }
         });
    }

    /**
     * 初始化查询条件
     * 
     */
    private void initQueryCon() {
        try {
            this.fileTypeCb.removeAllItems();
            this.fileTypeCb.addItem(new SelectOptionVo("", "全部"));
            this.fileTypeCb.addItem(new SelectOptionVo(AppConstant.AUDIT_PARAM_FILE_TYPE_AUDIT, AppConstant.AUDIT_PARAM_FILE_TYPE_AUDIT_NAME));
            this.fileTypeCb.addItem(new SelectOptionVo(AppConstant.AUDIT_PARAM_FILE_TYPE_ERROR, AppConstant.AUDIT_PARAM_FILE_TYPE_ERROR_NAME));

        } catch (Exception e) {
            logger.error(e);
            MessageShowUtil.errorOpMsg(e.getMessage());
        }
    }
 
    /**
     * 查询明细
     * 
     */
    private void queryDetail() {
        
        if (resultSetTableMain.getSelectedRow() < 0) {
            return;
        }
        int row = resultSetTableMain.getSelectedRow();
        String fileName = String.valueOf(resultSetTableMain.getModel().getValueAt(row, 1));
        String filePath = String.valueOf(resultSetTableMain.getModel().getValueAt(row, 2));

        List<Object[]> auditOrErrorFileDetails = getAuditOrErrorFileDetails(fileName, filePath);

        //生成列表
        genSubResultSetTable(auditOrErrorFileDetails);

        rsTabPanel.setSelectedIndex(1);
    }
    
    /**
     * 根据结果集，生成列表
     *
     * @param result
     */
    private void genSubResultSetTable(List<Object[]> result) {
        //列名称
        String[] columnNames = {"文件内容"};
        //列宽度
        int[] columnSize = {180};
        //生成列表
        resultSetTableDetail = UIUtil.genResultSetTable(this.mainSPI, result, columnNames, columnSize);
        resultSetTableDetail.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                    generate();
                }
            }
        });
    }
    
    /**
     * 取审计明细
     * 
     * @param file
     * @return 
     */
    private List<Object[]> getAuditOrErrorFileDetails(String fileName, String filePath){
        
        CallResult callResult = null;
        List<Object[]> auditOrErrorDetails = null;
        
        try {
            callResult = fileService.getLocalParamFileDetails(fileName, filePath);  
        } catch (FileException ex) {
            MessageShowUtil.errorOpMsg(ex.getMessage());
        }
        if(callResult.isSuccess()){
            auditOrErrorDetails = callResult.getObjs();
        }else{
            auditOrErrorDetails = new ArrayList<Object[]>();
        }

        return auditOrErrorDetails;
    }
    private void generate(){
        int row = resultSetTableDetail.getSelectedRow();
        if(row<0){
            return ;
        }
        TableModel tableModel = resultSetTableDetail.getModel();
        fileName.setText(String.valueOf(tableModel.getValueAt(row, 0)));
    }
       /*
    上传通知消息
    */
    private void upload(){
        CallResult  callResult = null;
        CallParam callParam = new CallParam();
        List<String> uploadList = new ArrayList<String>();
        String str = fileName.getText().trim();
        if(str==null||str.equals("")){
            MessageShowUtil.alertInfoMsg("文件名不能为空！");
            return;
        }
        str = AppConstant.USER_NO+":"+ fileName.getText().trim();
        uploadList.add(str);
        callParam.setParam(uploadList);
        try {
            callResult = commuService.uploadEsOrderFile(callParam);
            if(callResult.isSuccess()==true){
                MessageShowUtil.alertInfoMsg("上传成功");
            }else{
                MessageShowUtil.alertInfoMsg("上传失败");
            }
        } catch (CommuException ex) {
            logger.error(ex);
            MessageShowUtil.alertInfoMsg("上传失败："+ex.getMessage());
        }        
    }
}
