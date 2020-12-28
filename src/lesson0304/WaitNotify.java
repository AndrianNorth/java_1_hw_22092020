package lesson0304;

public class WaitNotify {
    private final Object letter = new Object();
    private char currentLetter = 'A';

    public static void main(String[] args) {
        WaitNotify w = new WaitNotify();

        new Thread(() -> {
            w.printA();
        }).start();
        new Thread(() -> {
            w.printB();
        }).start();
        new Thread(() -> {
            w.printC();
        }).start();

    }

    public void printA(){
        synchronized (letter) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'A')
                        letter.wait();
                    System.out.print("A");
                    currentLetter = 'B';
                    letter.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB(){
        synchronized (letter) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B')
                        letter.wait();
                    System.out.print("B");
                    currentLetter = 'C';
                    letter.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC(){
        synchronized (letter) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'C')
                        letter.wait();
                    System.out.print("C");
                    currentLetter = 'A';
                    letter.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
