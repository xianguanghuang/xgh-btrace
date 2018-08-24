package org.xgh.btrace.app;

public class HelloWorldRunnable implements Runnable{
    private HelloWorldService helloWorldService = new HelloWorldService();
    public void run() {
        helloWorldService.method1(100);
        helloWorldService.method2(200);
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
