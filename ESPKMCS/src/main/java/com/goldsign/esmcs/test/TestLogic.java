package com.goldsign.esmcs.test;

import com.goldsign.csfrm.util.DateHelper;
import com.goldsign.csfrm.util.StringUtil;
import com.goldsign.csfrm.vo.CallParam;
import com.goldsign.csfrm.vo.CallResult;
import com.goldsign.esmcs.dao.IPhyLogicDao;
import com.goldsign.esmcs.dao.impl.PhyLogicDao;
import com.goldsign.esmcs.env.AppConstant;
import com.goldsign.esmcs.exception.CardNotFoundException;
import com.goldsign.esmcs.exception.FileException;
import com.goldsign.esmcs.service.IFileService;
import com.goldsign.esmcs.service.impl.FileService;
import com.goldsign.esmcs.vo.AnalyzeVo;
import org.apache.log4j.Logger;
import com.goldsign.csfrm.vo.*;

import java.util.Hashtable;

public class TestLogic {


    public static final Logger logger = Logger.getLogger(TestLogic.class);

    private IPhyLogicDao phyLogicDao;
    private IFileService fileService; //文件操作接口

    public TestLogic(){
        this.phyLogicDao = new PhyLogicDao();
        this.fileService = new FileService();
    }

    public void setPhyLogicMap() throws FileException {

        try {
            AppConstant.phyLogicVos = phyLogicDao.getPhyLogicMap();
        } catch (Exception ex) {
            logger.error("设置物理对照表失败，" + ex);
            throw new FileException(ex);
        }
    }
    private CallResult loadConfigAndLogFile(CallParam callParam){

        CallResult callResult = null;
        try {
            //加载配置和日志文件
            callResult =fileService.loadConfigAndLogFile(callParam);
        } catch (FileException ex) {
            System.out.println("配置文件加载异常："+ex);
            return new CallResult("配置文件加载异常，请联系管理员!");
        }
        if (!callResult.isSuccess()) {
            System.out.println("配置文件加载失败："+callResult.getMsg());
            callResult.resetMsg("配置文件加载失败："+callResult.getMsg());
            return callResult;
        }
        //保存配置文件信息
        AppConstant.configs = (Hashtable) callResult.getObj();
        DateHelper.screenPrintForEx(AppConstant.configs);//打印

        return callResult;
    }

    protected String getCardLogicNo(String phyLoic) {
        String logicNo = AppConstant.phyLogicVos.get(phyLoic);

        if(StringUtil.isEmpty(logicNo)|| logicNo.trim().equals("")){
            logger.error("物理卡号(" + phyLoic+")没找到相应的逻辑卡号！");
            throw new CardNotFoundException("物理卡号(" + phyLoic+")没找到相应的逻辑卡号！");
        }
        logger.info("逻辑卡号：" + logicNo);
        return logicNo;
    }
    public static void main(String[] args) throws FileException {
         CallParam  callParam=null;
        TestLogic testLogic =new TestLogic();
         CallResult callResult =testLogic.loadConfigAndLogFile(callParam);
        if (!callResult.isSuccess()) {
            System.out.println("加载配置文件失败");
        }
        testLogic.setPhyLogicMap();
        testLogic.getCardLogicNo("D31F7B3C            ");
    //    TestLogic testLogic =new TestLogic();
    }
}
