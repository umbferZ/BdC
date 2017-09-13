/*
 * 
 * Created by Umberto Ferracci from urania's PC
 * email: umberto.ferracci@gmail.com
 * Project: BdC
 * Package: main.org.bdc.controls
 * Type: C_UC_Main
 * Last update: 13-set-2017 0.19.24
 * 
 */

package main.org.bdc.controls;

import java.awt.EventQueue;

import main.org.bdc.model.people.UserRegegistered;
import main.org.bdc.view.JFrameMain;

public class C_UC_Main {

    private UserRegegistered user;

    private JFrameMain       view;

    public C_UC_Main(UserRegegistered user) {
        this.user = user;
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    view = new JFrameMain();
                    // if (user.getUserType() == UserType.ADMIN)
                    // view.setJMenuBar(new MenuBarAdmin());
                    // else
                    // view.setJMenuBar(new MenuBarUser());
                    view.setVisible(true);
                    view.welcome(String.format("%s", user.getUserId()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}