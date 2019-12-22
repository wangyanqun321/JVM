package com.wyq.test1;

import java.util.ArrayList;
import java.util.List;

public class JConsole {

    public JConsole() {
        List list = new ArrayList(128 * 1024);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        List<JConsole> list = new ArrayList<>();

        for(int i = 0; i < 1000; i++){
            list.add(new JConsole());
            Thread.sleep(100);
        }
    }
}
