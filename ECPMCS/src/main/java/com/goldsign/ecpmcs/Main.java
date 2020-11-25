/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldsign.ecpmcs;

import com.goldsign.csfrm.exception.AuthenException;
import com.goldsign.csfrm.exception.AuthorException;
import com.goldsign.csfrm.exception.InitException;
import com.goldsign.csfrm.exception.LoadException;
import com.goldsign.ecpmcs.application.Application;
import javax.swing.UnsupportedLookAndFeelException;

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

            Application app = new Application();
            app.run();
    }
}
