/*
 * 文件名：IRwDeviceService
 * 版权：Copyright: goldsign (c) 2013
 * 描述：RW读写器IRwDeviceService服务实例
 */

package com.goldsign.ecpmcs.service;

import com.goldsign.csfrm.service.IBaseService;
import com.goldsign.csfrm.vo.CallResult;
import com.goldsign.ecpmcs.vo.CommonCfgParam;


/*
 * @author     lindaquan
 * @version    V1.0
 */

public interface IRwDeviceService extends IBaseService{

    CallResult openConnection(String portNo);
    
    CallResult initDevice(CommonCfgParam param);
    
    CallResult analyze();
     
    CallResult closeConnection(); 
    
    CallResult esVersions();
}
