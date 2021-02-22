package leecode.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinwentao
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 线程交替打印
 * @createTime 2021年02月20日 15:15:00
 */
public class Lee_1 {

    private static final Lee_1 lock = new Lee_1();

    // 线程交替打印
    public static void main(String[] args) {
        Lock a = new ReentrantLock();

        Thread a1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("1");
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        Thread a2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("2");
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        a1.start();
        a2.start();
    }
}
