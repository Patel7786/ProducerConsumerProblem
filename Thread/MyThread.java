//thread by Runnable interface
class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Task for Loop");
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i:" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread t = new Thread(thread); // helper class of Mythread
        t.start();
    }

}