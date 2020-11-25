package com.goldsign.sammcs;

import com.goldsign.csfrm.env.BaseConstant;
import com.goldsign.csfrm.exception.AuthenException;
import com.goldsign.csfrm.exception.AuthorException;
import com.goldsign.csfrm.exception.InitException;
import com.goldsign.csfrm.exception.LoadException;
import com.goldsign.sammcs.application.Application;
import com.goldsign.sammcs.dll.library.PSamIssueDll;
import com.goldsign.sammcs.env.AppConstant;
import com.sun.jna.Native;

import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws LoadException, InitException, AuthenException, AuthorException,
            ClassNotFoundException, InstantiationException, IllegalAccessException,
            UnsupportedLookAndFeelException {

        Application app = new Application(AppConstant.VERSION);
    //    BaseConstant.appWorkDir=BaseConstant.appWorkDir+"/src/main/resources";
        app.run();
    }
//    public static void main(String[] args){
//        PSamIssueDll INSTANCE = (PSamIssueDll) Native.loadLibrary(Main.class.getResource("").getPath().replaceFirst("/","").replaceAll("%20","")+"dll/library/PSAM_ISSUE", PSamIssueDll.class);
////        System.out.println(Main.class.getResource("").getPath().replaceFirst("/","").replaceAll("%20",""));
//    }
}

