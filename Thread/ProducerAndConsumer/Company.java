package ProducerAndConsumer;

public class Company {
    int n;
    boolean flag = false;

    // flag==false then producer term
    synchronized public void producer_item(int n) {
        if (flag) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.n = n;
        System.out.println("Produce items :" + this.n);
        flag = true;
        notify();
    }

    // flag ==true then consumer term
    synchronized public int consumer_items() {
        if (!flag) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Consume items :" + this.n);
        flag = false;
        notify();
        return this.n;
    }
}
