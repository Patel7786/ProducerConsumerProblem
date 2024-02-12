package ProducerAndConsumer;

public class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {

        while (true) {
            this.c.consumer_items();
            try {
                Consumer.sleep(5000);
            } catch (Exception e) {
            }
        }

    }

}
