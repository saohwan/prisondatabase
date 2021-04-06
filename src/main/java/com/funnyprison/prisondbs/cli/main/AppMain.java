package com.funnyprison.prisondbs.cli.main;

import static com.funnyprison.prisondbs.cli.ui.AppUI.inputInteger;
import static com.funnyprison.prisondbs.cli.ui.AppUI.startScreen;

public class AppMain {

    public static void main(String[] args) {

        while (true) {
            startScreen();
            int selection = inputInteger(">>>");

            FrontController.chooseSystem(selection);
        }
    }
}