/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penggajian.main;

import com.penggajian.view.FrmLogin;
import com.penggajian.view.FrmMain;
import javax.swing.UIManager;

/**
 *
 * @author rofiq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
        
        FrmLogin frmLogin = new FrmLogin();
        frmLogin.show();
          
        
        
    }
    
}
