package org.example.counter;

public class RaceConditionDemo {
    public static void main(String[] args) {
        // 싱글톤 객체
        Counter counter = new Counter();

        // 멀티쓰레드 환경에서 하나의 자원을 공유하게 되면, 원치 않는(예상치 못한) 결과(RaceCondition)가 나올 수 있음
        // RaceCondition : 여러 프로세스(쓰레드)가 동시에 하나의 자원에 접근하기 위해 경쟁하는 상태
        // => 싱글톤 객체에서 상태를 유지(stateful)하게 설계하면 절대 안됨 !! = Thread safety 하지 않음
        // 따라서 동기화 처리를 해줘야 함 !
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
