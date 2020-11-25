/*
 * 文件名：PhyLogicFileDownThread
 * 版权：Copyright: goldsign (c) 2013
 */

package com.goldsign.esmcs.thread;

import com.goldsign.csfrm.util.FileHelper;
import com.goldsign.csfrm.util.StringUtil;
import com.goldsign.esmcs.application.Application;
import com.goldsign.esmcs.env.AppConstant;
import com.goldsign.esmcs.env.ConfigConstant;
import com.goldsign.esmcs.env.FileConstant;
import com.goldsign.esmcs.exception.CardNotFoundException;
import com.goldsign.esmcs.ftp.CommuFtp;
import com.goldsign.esmcs.service.IFileService;
import com.goldsign.esmcs.util.ConfigUtil;
import com.goldsign.esmcs.vo.AnalyzeVo;
import com.goldsign.esmcs.vo.FtpFileParamVo;
import java.io.File;
import org.apache.log4j.Logger;


/*
 * 物理卡号与逻辑卡号对照文件下载线程
 * @author     lindaquan
 * @version    V1.0
 * @createTime 2013-9-16
 */

public class PhyLogicFileDownThread extends Thread{
    
    private static final Logger logger = Logger.getLogger(PhyLogicFileDownThread.class.getName());
    
    //FTP锁
    public static final Object FTP_LOCK = new Object();
    
    //FTP
    private CommuFtp ftp = new CommuFtp();
    
    private IFileService fileService;
    
    public PhyLogicFileDownThread(){
        fileService = ((Application)AppConstant.application).getFileService();
    }
    
    /**
     * 运行
     * 
     */
    @Override
    public void run() {
        try {
            //文件信息获取
            FtpFileParamVo ftpFileVo = getFileParamVo();
            File file = new File(ftpFileVo.getLocalPath(), ftpFileVo.getFile());
            
            if(!file.exists()){
                synchronized(FTP_LOCK){
                    //下载文件
                    ftp.ftpGetFileSingle(ftpFileVo.getIp(), ftpFileVo.getUserCode(), ftpFileVo.getPwd(), 
                            ftpFileVo.getFile(), ftpFileVo.getLocalPath(), ftpFileVo.getRemotePath());
                }
            }
            //把结果放到缓存中
            fileService.setPhyLogicMap();
     //       getCardLogicNo();
               
        } catch (Exception e) {
            logger.error(e);
        }
    }
    
    private FtpFileParamVo getFileParamVo(){
        
        FtpFileParamVo ftpFileVo = new FtpFileParamVo(ConfigUtil.getFtpLoginParam());
        ftpFileVo.setFile(FileHelper.getFileName(FileConstant.PHY_LOGIC_FILE_PRE));
        ftpFileVo.setLocalPath(ConfigUtil.getConfigValue(ConfigConstant.DownloadTag, ConfigConstant.FtpPhyLogicLocalPathTag));
        ftpFileVo.setRemotePath(ConfigUtil.getConfigValue(ConfigConstant.DownloadTag, ConfigConstant.FtpPhyLogicRemotePathTag));
    
        return ftpFileVo;
    }
    //wuqq 20200407 测试物理卡号位数
//    protected String getCardLogicNo() {
//        AnalyzeVo analyzeVo = new AnalyzeVo();
//        analyzeVo.setcPhysicalID("9353FE3C");
//        String logicNo = null;
//        String phyNo = analyzeVo.getcPhysicalID();
//        if(phyNo.length()<20){
//            StringBuffer index = new StringBuffer(" ");
//            for(int i=phyNo.length();i<20;i++){
//                phyNo=phyNo+index;
//            }
//            logger.info("20位物理卡号 ： "+phyNo);
//        }
//        logger.info("物理卡号：" + phyNo);
//        if(!AppConstant.phyLogicVos.containsKey(phyNo)){
//            logger.error("物理卡号(" + phyNo+")不存在对应表中！");
//            throw new CardNotFoundException("物理卡号(" + phyNo+")不存在对应表中！");
//        }
//        logger.info("物理卡号：" + phyNo);
//        logicNo = AppConstant.phyLogicVos.get(phyNo).trim();
//        /*if(null != logicNo){
//            if(logicNo.length() > PKAppConstant.LEN_LOGICAL){
//                logicNo = logicNo.substring(logicNo.length() - PKAppConstant.LEN_LOGICAL);
//            }
//        }*/
//        if(StringUtil.isEmpty(logicNo)){
//            logger.error("物理卡号(" + phyNo+")没找到相应的逻辑卡号！");
//            throw new CardNotFoundException("物理卡号(" + phyNo+")没找到相应的逻辑卡号！");
//        }
//
//        logger.info("逻辑卡号：" + logicNo);
//        return logicNo;
//    }

}
