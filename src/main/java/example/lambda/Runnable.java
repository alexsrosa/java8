package example.lambda;

public class Runnable {

    public static void main(String[] args) {

        new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }
        }).start();

        //OR

        new Thread(() -> System.out.println("Executando um Runnable 2")).start();
    }
}
