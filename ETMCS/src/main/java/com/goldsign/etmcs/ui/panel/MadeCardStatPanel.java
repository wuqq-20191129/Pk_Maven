
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GenIssueRequestPanel.java
 *
 * Created on 2011-8-3, 8:31:03
 */

package com.goldsign.etmcs.ui.panel;

import com.goldsign.csfrm.ui.common.JDatePicker;
import com.goldsign.csfrm.util.DateHelper;
import com.goldsign.csfrm.util.ExcelExport;
import com.goldsign.csfrm.util.MessageShowUtil;
import com.goldsign.csfrm.util.UIUtil;
import com.goldsign.csfrm.vo.SelectOptionVo;
import com.goldsign.etmcs.env.AppConstant;
import com.goldsign.etmcs.service.IMakeCardService;
import com.goldsign.etmcs.service.impl.MakeCardService;
import com.goldsign.etmcs.vo.MakeCardParam;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import org.apache.log4j.Logger;

/**
 * 制卡订单查询
 * 
 * @author Administrator
 */
public class MadeCardStatPanel extends javax.swing.JPanel {

    private static Logger logger = Logger.getLogger(MadeCardStatPanel.class.getName());
    
    private IMakeCardService makeCardService;
    
    private JTable resultSetTableMain;
    

    /** Creates new form GenIssueRequestPanel */
    public MadeCardStatPanel() {
        this.makeCardService = new MakeCardService();
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
        mainSPn = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        begDateCb = new javax.swing.JComboBox();
        btQuery = new javax.swing.JButton();
        endDateCb = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        typeCb = new javax.swing.JComboBox();
        btExport = new javax.swing.JButton();

        setBackground(new Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(845, 589));

        mainPnl.setBackground(new Color(254, 254, 254));
        mainPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mainPnl.setPreferredSize(new java.awt.Dimension(807, 74));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new Color(185, 227, 241));
        jTextField5.setFont(new java.awt.Font("宋体", 1, 16)); // NOI18N
        jTextField5.setForeground(new Color(94, 55, 16));
        jTextField5.setText("   结果列表");
        jTextField5.setAlignmentX(0.0F);
        jTextField5.setAlignmentY(0.0F);
        jTextField5.setBorder(null);

        org.jdesktop.layout.GroupLayout mainPnlLayout = new org.jdesktop.layout.GroupLayout(mainPnl);
        mainPnl.setLayout(mainPnlLayout);
        mainPnlLayout.setHorizontalGroup(
            mainPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPnlLayout.createSequentialGroup()
                .add(mainPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(mainSPn)
                    .add(jTextField5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPnlLayout.setVerticalGroup(
            mainPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPnlLayout.createSequentialGroup()
                .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainSPn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new Color(237, 247, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(792, 105));

        jLabel2.setFont(new java.awt.Font("宋体", 1, 16)); // NOI18N
        jLabel2.setForeground(new Color(0, 39, 80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("受理日期：");

        begDateCb.setFont(new java.awt.Font("宋体", 0, 16)); // NOI18N
        begDateCb.setForeground(new Color(70, 95, 125));
        begDateCb =new JDatePicker(JDatePicker.STYLE_CN_DATE1);

        btQuery.setFont(new java.awt.Font("宋体", 1, 16)); // NOI18N
        btQuery.setForeground(new Color(0, 39, 80));
        btQuery.setText("查询");
        btQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQueryActionPerformed(evt);
            }
        });

        endDateCb.setFont(new java.awt.Font("宋体", 0, 16)); // NOI18N
        endDateCb.setForeground(new Color(70, 95, 125));
        endDateCb =new JDatePicker(JDatePicker.STYLE_CN_DATE1);

        jLabel4.setFont(new java.awt.Font("宋体", 1, 16)); // NOI18N
        jLabel4.setForeground(new Color(0, 39, 80));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("至：");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new Color(185, 227, 241));
        jTextField3.setFont(new java.awt.Font("宋体", 1, 16)); // NOI18N
        jTextField3.setForeground(new Color(94, 55, 16));
        jTextField3.setText("   查询条件");
        jTextField3.setAlignmentX(0.0F);
        jTextField3.setAlignmentY(0.0F);
        jTextField3.setBorder(null);

        jLabel8.setFont(new java.awt.Font("宋体", 1, 16)); // NOI18N
        jLabel8.setForeground(new Color(0, 39, 80));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("受理类型：");

        typeCb.setFont(new java.awt.Font("宋体", 0, 16)); // NOI18N
        typeCb.setForeground(new Color(0, 39, 80));

        btExport.setFont(new java.awt.Font("宋体", 1, 16)); // NOI18N
        btExport.setForeground(new Color(0, 39, 80));
        btExport.setText("导出");
        btExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 788, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 1, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(begDateCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(endDateCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(64, 64, 64)
                        .add(btQuery, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(btExport, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(typeCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(typeCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(endDateCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btQuery)
                    .add(begDateCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btExport))
                .add(13, 13, 13))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(mainPnl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 792, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
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
        //清空提示信息
        MessageShowUtil.infoOpMsg("");
        doQuery();
    }//GEN-LAST:event_btQueryActionPerformed

    private void btExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportActionPerformed
        doExport();
    }//GEN-LAST:event_btExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox begDateCb;
    private javax.swing.JButton btExport;
    private javax.swing.JButton btQuery;
    private javax.swing.JComboBox endDateCb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JScrollPane mainSPn;
    private javax.swing.JComboBox typeCb;
    // End of variables declaration//GEN-END:variables

    /**
     * 取得查询条件
     * 
     * @return 
     */
    private MakeCardParam getCallParam(){
        
        MakeCardParam param =  new MakeCardParam();
        SelectOptionVo selectOptionVo = (SelectOptionVo)typeCb.getSelectedItem();
        param.setType(selectOptionVo.getValue());
        param.setBeginDate(DateHelper.str10yyyy_MM_ddToStr8yyyyMMdd(begDateCb.getSelectedItem().toString()));
        param.setEndDate(DateHelper.str10yyyy_MM_ddToStr8yyyyMMdd(endDateCb.getSelectedItem().toString()));
        
        return param;
    }
    
    /**
     * 查询
     * 
     */
    private void doQuery(){
    
        MakeCardParam callParam = getCallParam();
        if(!checkParam(callParam)){
            return;
        }
        
        //查询
        List<Object[]> cards = makeCardService.getMakeCardsCount(callParam);
        
        MessageShowUtil.infoOpMsg("成功查询" + cards.size() + "条记录");
        
        if(cards.size()>0){
            btExport.setEnabled(true);
            btExport.setForeground(new Color(0,39,80));
        }
        
        //生成列表
        genMainResultSetTable(cards);
        
    }
    
    /*
     * 导出查询数据
     */
    private void doExport() {
//        CSVFileHandler exp = new CSVFileHandler(resultSetTableMain,this);
//        exp.execute();
        
        resultSetTableMain.setName("制卡统计");
        JTable[] jTables = {resultSetTableMain};  
        //ExcelExport.exportXLSJTable(jTables, this);
        ExcelExport.exportXLSJTableColumnSpread(jTables, this, AppConstant.MAKE_CARD_STA_COLUMN_SIZES);
    }
    
    /**
     * 根据结果集，生成列表
     * 
     * @param result 
     */
    private void genMainResultSetTable(List<Object[]> result) {
        //列名称
        String[] columnNames = AppConstant.MAKE_CARD_STA_COLUMN_NAMES;
        //列宽度
        int[] columnSize = AppConstant.MAKE_CARD_STA_COLUMN_SIZES;
        
        //生成列表
        resultSetTableMain = UIUtil.genResultSetTable(this.mainSPn, result, columnNames, columnSize);
    }

    /**
     * 初始化查询条件
     * 
     */
    private void initQueryCon() {

        this.typeCb.removeAllItems();
        this.typeCb.addItem(new SelectOptionVo(AppConstant.SELECT_OPTION_ALL, AppConstant.SELECT_OPTION_ALL_NAME));
        this.typeCb.addItem(new SelectOptionVo(AppConstant.ET_STATE_ISSUE, AppConstant.ET_STATE_ISSUE_NAME));
        this.typeCb.addItem(new SelectOptionVo(AppConstant.ET_STATE_RETURN, AppConstant.ET_STATE_RETURN_NAME));
        
        btExport.setEnabled(false);
        btExport.setForeground(Color.gray);
    }
    
    /*
     * 表单检验提示
     */
    public boolean checkParam(MakeCardParam param) {
        boolean result = true;
        String message = "";
        Date beginOpTime = DateHelper.str8yyyyMMddToDate(param.getBeginDate());
        Date endOpTime = DateHelper.str8yyyyMMddToDate(param.getEndDate());

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(beginOpTime);
        calendar.add(Calendar.MONTH,3);
        Date after3MonthDay = calendar.getTime();
        if (after3MonthDay.before(endOpTime)) {
            message += "请选择操作日期段为三个月内！";
            result = false;
        }
        if(param.getEndDate().compareTo(param.getBeginDate()) < 0 ){
            message += "结束日期须不小于开始日期！\n";
            result = false;
        }
        if(!result){
            MessageShowUtil.alertErrorMsg(message);
        }
        
        return result;
    }
 
}