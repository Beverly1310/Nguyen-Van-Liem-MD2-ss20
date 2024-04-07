package bai1;

import bai7.MyThread;

public class Test {
    public static void main(String[] args) {
        CountingThread thread = new CountingThread();
        thread.start();
    }
}
