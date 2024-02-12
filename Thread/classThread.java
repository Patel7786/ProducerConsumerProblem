
public class classThread extends Thread {
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Value of i:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        classThread t = new classThread();
        MyThread thread = new MyThread();// thread created by runnable before
        Thread t1 = new Thread(thread);
        // both thread are working simultenousaly.
        t.start();
        t1.start();

    }
}
