
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

import com.goldsign.csfrm.ui.panel.BasePanel;
import com.goldsign.csfrm.vo.CallParam;
import com.goldsign.csfrm.vo.CallResult;
import javax.swing.JTabbedPane;
import org.apache.log4j.Logger;

/**
 * 设备诊断
 * 
 * @author Administrator
 */
public class DeviceCheckPanel extends BasePanel {

    private static Logger logger = Logger.getLogger(DeviceCheckPanel.class.getName());
    
    protected boolean IS_RUNNING = false;//正在运行
    
    protected int cardNo = 1;//卡号
   
    /** Creates new form GenIssueRequestPanel */
    public DeviceCheckPanel() {
        //initComponents();
    }

    /**
     * 离开窗口判断
     *
     * @param callParam
     * @return
     */
    @Override
    public CallResult closingEventCallBack(CallParam callParam) {

        if (IS_RUNNING) {
            return new CallResult("正在发卡，不能关闭窗口！");
        }
        return super.closingEventCallBack(callParam);
    }
    
    protected void addCommonPanel(JTabbedPane cJPanel){
        cJPanel.add("打印机", new PrinterCheckPanel());
        cJPanel.add("读写器", new RwCheckPanel());
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(845, 589));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 845, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 589, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    /**
     * 休息
     * 
     * @param time 
     */
    protected void sleepTime(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            logger.error(ex);
        }
    }
}