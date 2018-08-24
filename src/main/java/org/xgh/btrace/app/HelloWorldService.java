package org.xgh.btrace.app;

public class HelloWorldService {
    public int method1(int i){
        try {
            Thread.sleep(200L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }

    public int method2(int i){
        try {
            Thread.sleep(400L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;

    }
}
