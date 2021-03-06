
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

import com.goldsign.csfrm.util.UIUtil;
import com.goldsign.esmcs.env.AppConstant;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import org.apache.log4j.Logger;

/**
 * 城市参数查询
 * 
 * @author Administrator
 */
public class ParamQueryPanel extends javax.swing.JPanel {

    private static Logger logger = Logger.getLogger(ParamQueryPanel.class.getName());
    
    private JTable resultSetTableMain;
    

    /** Creates new form GenIssueRequestPanel */
    public ParamQueryPanel() {
        initComponents();
        doQuery();
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

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(845, 589));

        mainPnl.setBackground(new java.awt.Color(254, 254, 254));
        mainPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mainPnl.setPreferredSize(new java.awt.Dimension(807, 74));

        jTextField5.setBackground(new java.awt.Color(185, 227, 241));
        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("宋体", 1, 15)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(94, 55, 16));
        jTextField5.setText("   结果列表");
        jTextField5.setAlignmentX(0.0F);
        jTextField5.setAlignmentY(0.0F);
        jTextField5.setBorder(null);

        mainSPn.setBackground(new java.awt.Color(255, 255, 255));
        mainSPn.setBorder(null);

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
                .add(mainSPn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(mainPnl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 792, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(mainPnl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 576, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JScrollPane mainSPn;
    // End of variables declaration//GEN-END:variables
    
    /**
     * 查询
     * 
     */
    private void doQuery(){
    
        //查询
        List<Object[]> params = getParams();
        
        //生成列表
        genMainResultSetTable(params);
        
    }
    
    /**
     * 取得参数
     * 
     * @return 
     */
    private List<Object[]> getParams(){
    
        List<Object[]> params = new ArrayList<Object[]>();
        Object[] param = new Object[]{AppConstant.cityParamVo.getCityCode(), 
            AppConstant.cityParamVo.getIndustryCode(),
            AppConstant.cityParamVo.getKeyVersion(),
            AppConstant.cityParamVo.getSenderCode(),
            AppConstant.cityParamVo.getCardVersion(),
            AppConstant.cityParamVo.getAppVersion()};
        params.add(param);
        
        return params;
    }
    
    /**
     * 根据结果集，生成列表
     * 
     * @param result 
     */
    private void genMainResultSetTable(List<Object[]> result) {
        //列名称
        String[] columnNames = {"城市代码", "行业代码", "密钥版本","发卡商代码","卡版本","应用版本"};
        //列宽度
        int[] columnSize = {120, 120, 120, 120, 120, 120};
        //生成列表
        resultSetTableMain = UIUtil.genResultSetTable(this.mainSPn, result, columnNames, columnSize);
    }
 
}
