package ProducerAndConsumer;

public class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 0;
        while (true) {

            this.c.producer_item(i);
            try {
                Producer.sleep(1000);
            } catch (Exception e) {
            }
            i++;
        }

    }

}
