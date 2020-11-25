
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
import com.goldsign.esmcs.vo.NoticeParam;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import org.apache.log4j.Logger;

/**
 * 文件通知查询
 * 
 * @author Administrator
 */
public class EsFileNoticePanel extends javax.swing.JPanel {

    private static Logger logger = Logger.getLogger(EsFileNoticePanel.class.getName());
    
    private IFileService fileService;
    private ICommuService commuService;
    private JTable resultSetTableMain;
    

    /** Creates new form GenIssueRequestPanel */
    public EsFileNoticePanel() {
        this.fileService = new FileService();
        this.commuService =((Application) AppConstant.application).getCommuService();
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

        mainPnl = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        mainSPn = new JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btQuery1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        begDateCb = new javax.swing.JComboBox();
        btQuery = new javax.swing.JButton();
        endDateCb = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        noticeTypeCb = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(845, 589));

        mainPnl.setBackground(new java.awt.Color(254, 254, 254));
        mainPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mainPnl.setPreferredSize(new java.awt.Dimension(807, 74));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(185, 227, 241));
        jTextField5.setFont(new java.awt.Font("宋体", 1, 15)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(94, 55, 16));
        jTextField5.setText("   结果列表");
        jTextField5.setAlignmentX(0.0F);
        jTextField5.setAlignmentY(0.0F);
        jTextField5.setBorder(null);

        mainSPn.setBackground(new java.awt.Color(255, 255, 255));
        mainSPn.setBorder(null);

        btQuery1.setBackground(new java.awt.Color(255, 255, 255));
        btQuery1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btQuery1.setForeground(new java.awt.Color(0, 39, 80));
        btQuery1.setContentAreaFilled(false);
        btQuery1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuery1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(317, 317, 317)
                .add(btQuery1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(btQuery1)
                .add(0, 6, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout mainPnlLayout = new org.jdesktop.layout.GroupLayout(mainPnl);
        mainPnl.setLayout(mainPnlLayout);
        mainPnlLayout.setHorizontalGroup(
            mainPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPnlLayout.createSequentialGroup()
                .add(mainPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainPnlLayout.createSequentialGroup()
                        .add(mainPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(mainSPn)
                            .add(jTextField5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPnlLayout.setVerticalGroup(
            mainPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPnlLayout.createSequentialGroup()
                .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainSPn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .add(3, 3, 3)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(1, 1, 1))
        );

        jPanel1.setBackground(new java.awt.Color(237, 247, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(792, 105));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 39, 80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("通知日期：");

        begDateCb.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        begDateCb.setForeground(new java.awt.Color(70, 95, 125));
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

        jLabel8.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 39, 80));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("通知结果：");

        noticeTypeCb.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        noticeTypeCb.setForeground(new java.awt.Color(0, 39, 80));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(78, 78, 78)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(begDateCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(noticeTypeCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(50, 50, 50)
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(endDateCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(45, 45, 45)
                .add(btQuery, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 788, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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
                    .add(noticeTypeCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(mainPnl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 792, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(mainPnl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 461, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQueryActionPerformed
        // TODO add your handling code here:
        doQuery();
    }//GEN-LAST:event_btQueryActionPerformed

    private void btQuery1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuery1ActionPerformed
        // TODO add your handling code here:
        doUpload();
    }//GEN-LAST:event_btQuery1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox begDateCb;
    private javax.swing.JButton btQuery;
    private javax.swing.JButton btQuery1;
    private javax.swing.JComboBox endDateCb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel mainPnl;
    private JScrollPane mainSPn;
    private javax.swing.JComboBox noticeTypeCb;
    // End of variables declaration//GEN-END:variables

  /**
     * 取得查询条件
     * 
     * @return 
     */
    private NoticeParam getNoticeParam(){
        
        NoticeParam noticeParam =  new NoticeParam();
        SelectOptionVo selectOptionVo = (SelectOptionVo)noticeTypeCb.getSelectedItem();
        noticeParam.setNoticeType(selectOptionVo.getValue());
        noticeParam.setBeginDate(DateHelper.str10yyyy_MM_ddToStr8yyyyMMdd(begDateCb.getSelectedItem().toString()));
        noticeParam.setEndDate(DateHelper.str10yyyy_MM_ddToStr8yyyyMMdd(endDateCb.getSelectedItem().toString()));
        
        return noticeParam;
    }
    
    /**
     * 取得通知或未通知文件
     * 
     * @param noticeParam
     * @return 
     */
    private List<Object[]> getNoticeOrUnNoticeFiles(NoticeParam noticeParam){
        
        List<Object[]> noticeFiles = new ArrayList<Object[]>();
        
        CallResult callResult = null;
        try{
            if(AppConstant.ES_FILE_NOTICE_TYPE_SUCCESS.equals(noticeParam.getNoticeType())){
                callResult = fileService.getEsNoticeFiles(noticeParam);
            }else{
                callResult = fileService.getEsUnNoticeFiles(noticeParam);
            }
            if (!callResult.isSuccess()) {
                MessageShowUtil.alertInfoMsg("取文件通知失败！");
            }else{
                MessageShowUtil.infoOpMsg("查询成功！");
                noticeFiles.addAll(callResult.getObjs());
            }
        } catch (FileException ex) {
            logger.error(ex);
            MessageShowUtil.errorOpMsg(ex.getMessage());
        }
        
        return noticeFiles;
    }
    
    /**
     * 查询
     * 
     */
    private void doQuery(){
    
        //查询参数
        NoticeParam noticeParam =  getNoticeParam();
        
        List<Object[]> noticeFiles = getNoticeOrUnNoticeFiles(noticeParam);
        
        //生成列表
        genMainResultSetTable(noticeFiles);
        
    }
    
    /**
     * 根据结果集，生成列表
     * 
     * @param result 
     */
    private void genMainResultSetTable(List<Object[]> result) {
        
            //列名称
            String[] columnNames = {"操作员", "订单编号", "通知时间"};
            //列宽度
            int[] columnSize = {100, 150, 180};
            //生成列表
            resultSetTableMain = UIUtil.genResultSetTable(this.mainSPn, result, columnNames, columnSize);
       
    }

    /**
     * 初始化查询条件
     * 
     */
    private void initQueryCon() {
        try {
            this.noticeTypeCb.removeAllItems();
            this.noticeTypeCb.addItem(new SelectOptionVo(AppConstant.ES_FILE_NOTICE_TYPE_SUCCESS, 
                    AppConstant.ES_FILE_NOTICE_TYPE_SUCCESS_NAME));
            this.noticeTypeCb.addItem(new SelectOptionVo(AppConstant.ES_FILE_NOTICE_TYPE_FAIL, 
                    AppConstant.ES_FILE_NOTICE_TYPE_FAIL_NAME));

        } catch (Exception e) {
            logger.error(e);
            MessageShowUtil.errorOpMsg(e.getMessage());
        }
    }
 

    
    /*
        取得列表选择通知文件
    */
    private CallParam getUINoticeFile(){
        CallParam callParam = new CallParam();
        List<String> selectedNotice = new ArrayList<String>();
        int[] row = resultSetTableMain.getSelectedRows();
        String str = null;
        if(row.length<1){
            return null;
        }
        TableModel tableModel = resultSetTableMain.getModel();
        for(int i:row){
            str = tableModel.getValueAt(i,0)+AppConstant.MAO_SIGN+tableModel.getValueAt(i,1)+AppConstant.MAO_SIGN+tableModel.getValueAt(i,2);
            selectedNotice.add(str);
        }
        callParam.setParam(selectedNotice);
        return callParam;
    }
    
    
    /*
    上传通知消息
    */
    private boolean sendUploadNoticeMsg(CallParam callParam){
        CallResult  callResult = null;
        try {
            callResult = commuService.uploadEsOrderFile(callParam);
        } catch (CommuException ex) {
            logger.error(ex);
            MessageShowUtil.infoOpMsg("上传失败："+ex.getMessage());
            return false;
        }
        
        return callResult.isSuccess();
    }
    
    
    /**
     更新本地通知和未通知文件
     */
    private CallResult updateNoticeAndUnNoticeFiles(CallParam callParam){
         CallResult  callResult = null;
        try {
           callResult = fileService.updateNoticeOrderMsg(callParam);
        } catch (FileException ex) {
            logger.error(ex);
            MessageShowUtil.infoOpMsg(ex.getMessage());
            return null;
        }
        return callResult;
    }
    
    /**
     * 手工上传条件判断
     * 
     * @return 
     */
    private boolean noticeCheck(NoticeParam noticeParam){
        
        if(resultSetTableMain == null ||
                resultSetTableMain.getSelectedRowCount()==0){
            MessageShowUtil.alertInfoMsg("请选择记录操作！");
            return false;
        } 
        if(!AppConstant.ES_FILE_NOTICE_TYPE_FAIL.equals(noticeParam.getNoticeType())){
            MessageShowUtil.alertInfoMsg("只能上传通知结果为失败的记录！");
            return false;
        }
        return true;
    }
    
    /*
    手工上传通知文件
    */
    private void doUpload(){
       
       CallResult callResult = null;
       //查询参数
       NoticeParam noticeParam =  getNoticeParam();
       if(noticeCheck(noticeParam)){
           //获取列
            CallParam callParam = getUINoticeFile();
            //上传
            boolean isSuccess = sendUploadNoticeMsg(callParam);
            //调整本地通知和未通知文件
            if(isSuccess){
                callResult = updateNoticeAndUnNoticeFiles(callParam);
                doQuery();
                if(callResult.isSuccess()){
                    MessageShowUtil.infoOpMsg("上传更新成功！");
                }
            }
            
       }
    }
}