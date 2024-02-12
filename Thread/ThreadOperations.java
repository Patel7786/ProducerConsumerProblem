public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Program started  ");
        int a = 32 + 32;
        Thread t = Thread.currentThread();
        System.out.println("Current thread id is : " + t.getId());
        System.out.println("Current thread Name is : " + t.getName());
        t.setName("MyMain");
        try {// try vatch because sleep method throw check exception so we are using.....
            t.sleep(5000); // sleep
        } catch (Exception w) {

        }
        System.out.println("After chaning  thread Name is : " + t.getName());
        System.out.println("Value of a is :" + a);
        System.out.println("Program ended  ");
    }
}
