/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.goldsign.etmcs.service.impl;

import com.goldsign.csfrm.service.impl.BaseService;
import com.goldsign.etmcs.dao.IOperateLogDao;
import com.goldsign.etmcs.dao.impl.OperateLogDao;
import com.goldsign.etmcs.service.IOperateLogService;
import com.goldsign.etmcs.vo.OperateLogParam;
import com.goldsign.etmcs.vo.OperateLogVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class OperateLogService extends BaseService implements IOperateLogService{

    private IOperateLogDao operateLogDao;
    
    public OperateLogService(){
        operateLogDao = new OperateLogDao();
    }

    @Override
    public List<Object[]> getOperaterLogs(OperateLogParam operateLogParam) {
        
        List<OperateLogVo> operateLogVoRets = operateLogDao.getOperaterLogs(operateLogParam);
        
        List<Object[]> operateLogRets = new ArrayList<Object[]>();
        for(OperateLogVo operateLogVoRet: operateLogVoRets){
            Object[] operateLogRet = new Object[]{
                operateLogVoRet.getOperId(), operateLogVoRet.getOprtTime(), 
                operateLogVoRet.getOprtContent(), operateLogVoRet.getOprtResultDesc()
            };
            operateLogRets.add(operateLogRet);
        }
        
        return operateLogRets;
    }

    @Override
    public void insertOperaterLogs(OperateLogVo vo) {
        operateLogDao.insertOperaterLogs(vo);
    }
}
