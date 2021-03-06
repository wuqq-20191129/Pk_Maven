
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

import com.goldsign.csfrm.util.MessageShowUtil;
import com.goldsign.csfrm.util.UIUtil;
import com.goldsign.csfrm.vo.CallResult;
import com.goldsign.esmcs.env.AppConstant;
import com.goldsign.esmcs.exception.FileException;
import com.goldsign.esmcs.service.IFileService;
import com.goldsign.esmcs.service.impl.FileService;
import com.goldsign.esmcs.vo.FtpFileParamVo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import org.apache.log4j.Logger;

/**
 * 黑名单文件查询
 * 
 * @author Administrator
 */
public class BlacklistQueryPanel extends javax.swing.JPanel {

    private static Logger logger = Logger.getLogger(BlacklistQueryPanel.class.getName());
    
    private IFileService fileService;
    
    private JTable resultSetTableMain;
    

    /** Creates new form GenIssueRequestPanel */
    public BlacklistQueryPanel() {
        
        this.fileService = new FileService();
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

        rsTabPanel = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        mainSPn = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        mainSPI = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(845, 589));

        rsTabPanel.setBackground(new java.awt.Color(255, 255, 255));
        rsTabPanel.setForeground(new java.awt.Color(94, 55, 16));
        rsTabPanel.setFont(new java.awt.Font("宋体", 1, 15)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));

        mainSPn.setBackground(new java.awt.Color(255, 255, 255));
        mainSPn.setBorder(null);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(mainSPn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 783, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 4, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(mainSPn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 539, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 5, Short.MAX_VALUE))
        );

        rsTabPanel.addTab("黑名单文件", jPanel4);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        mainSPI.setBackground(new java.awt.Color(254, 254, 254));
        mainSPI.setBorder(null);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainSPI, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainSPI, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        rsTabPanel.addTab("黑名单明细", jPanel2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(rsTabPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 792, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(rsTabPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 576, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane mainSPI;
    private javax.swing.JScrollPane mainSPn;
    private javax.swing.JTabbedPane rsTabPanel;
    // End of variables declaration//GEN-END:variables
    
    /**
     * 取黑名单文件
     * 
     * @return 
     */
    private List<Object[]> getBlackListFiles(){
        
        List<Object[]> blacklists = new ArrayList<Object[]>();
        for(FtpFileParamVo fileParamVo: AppConstant.blacklistFileVos){
            Object[] blacklist = new Object[]{fileParamVo.getFile(), fileParamVo.getLocalPath()};
            blacklists.add(blacklist);
        }
        
        return blacklists;
    }
    
    /**
     * 查询
     * 
     */
    private void doQuery(){
        
        List<Object[]> blacklistFiles = getBlackListFiles();
        
        //生成列表
        genMainResultSetTable(blacklistFiles);
        
        rsTabPanel.setSelectedIndex(0);
    }
    
    /**
     * 根据结果集，生成列表
     * 
     * @param result 
     */
    private void genMainResultSetTable(List<Object[]> result) {
        //列名称
        String[] columnNames = {"文件名称", "本地路径"};
        //列宽度
        int[] columnSize = {200, 600};
        //生成列表
        resultSetTableMain = UIUtil.genResultSetTable(this.mainSPn, result, columnNames, columnSize);
        resultSetTableMain.addMouseListener(new MouseAdapter() {

             public void mouseClicked(MouseEvent e) {
                 if (e.getClickCount() == 2) {
                     queryDetail();
                 }
             }
         });
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
        String fileName = String.valueOf(resultSetTableMain.getModel().getValueAt(row, 0));
        String filePath = String.valueOf(resultSetTableMain.getModel().getValueAt(row, 1));
        
        List<Object[]> blacklistFileDetails = getBlackListDetails(fileName, filePath);
        
        //生成列表
        genSubResultSetTable(blacklistFileDetails);
        
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
        UIUtil.genResultSetTable(this.mainSPI, result, columnNames, columnSize);
 
    }
    
    /**
     * 取黑名单明细
     * 
     * @param file
     * @return 
     */
    private List<Object[]> getBlackListDetails(String fileName, String filePath){
        
        CallResult callResult = null;
        List<Object[]> blacklistDetails = null;
        
        try {
            callResult = fileService.getLocalParamFileDetails(fileName, filePath);  
        } catch (FileException ex) {
            MessageShowUtil.errorOpMsg(ex.getMessage());
        }
        if(callResult.isSuccess()){
            blacklistDetails = callResult.getObjs();
        }else{
            blacklistDetails = new ArrayList<Object[]>();
        }

        return blacklistDetails;
    }
}
