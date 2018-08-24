package org.xgh.btrace.app;

public class HelloWorld {


    public static void main(String[] args) {

        while (true){
            Thread thread = new Thread(new HelloWorldRunnable());
            thread.start();
            HelloWorldMainService helloWorldMainService = new HelloWorldMainService();
            helloWorldMainService.method1(100);


            try {
                System.out.println("sleep for a while");
                Thread.sleep(5L * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
