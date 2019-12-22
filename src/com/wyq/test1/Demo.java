package com.wyq.test1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().maxMemory());
        List<Demo> list = new ArrayList<>();
        while (true){
            list.add(new Demo());
        }
    }
}
