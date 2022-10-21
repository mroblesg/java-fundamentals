package CustomExercises;

class Iterable implements Runnable {

    int sum = 0;
    Thread t;

    public Iterable(String threadName) {
        t = new Thread(this, threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println(t.getName() + " actual value is :" + sum);
        }

        System.out.println(t.getName() + " Sum is: " + sum);

    }
}


//https://baptiste-wicht.com/categories/concurrency.html More concurrency examples and explanations
//ToDo: Take a look to semaphores
public class Ex1 {
    public static void main(String[] args) {
        Iterable obj1 = new Iterable("Thread 1");
        Iterable obj2 = new Iterable("Thread 2");
        Iterable obj3 = new Iterable("Thread 3");

        obj1.t.start();
        obj2.t.start();
        obj3.t.start();

        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }

    }
}
