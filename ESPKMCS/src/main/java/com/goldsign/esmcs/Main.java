/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.goldsign.esmcs;

import com.goldsign.csfrm.env.BaseConstant;
import com.goldsign.esmcs.application.PKApplication;
import com.goldsign.esmcs.env.ConfigConstant;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) throws Exception{
        PKApplication app = new PKApplication("V1.4.6");
    //    BaseConstant.appWorkDir=BaseConstant.appWorkDir+"/ESPKMCS/src/main/resources";
        app.run();
        //CallParam callParam = new CallParam();
       // baseApp.login(callParam);
    }
//    public static  void main(String[] args) throws Exception{
//        System.out.println("项目路径"+ ConfigConstant.appWorkDir);
//
//    }
}
