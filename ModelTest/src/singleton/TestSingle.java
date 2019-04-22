package singleton;

import java.io.FileReader;
import java.util.FormatFlagsConversionMismatchException;
import java.util.concurrent.CountDownLatch;

public class TestSingle {

    //创建100个线程
    private static int threadNum = 100;
    final static CountDownLatch countDownLatch = new CountDownLatch(threadNum);

    public static void main(String[] args) throws InterruptedException {
        StaticInnerClass s1 = StaticInnerClass.getInstance();
        StaticInnerClass s2 = StaticInnerClass.getInstance();
        System.out.println(s1+"   "+s2);


//        long start = System.currentTimeMillis();
//
//        for(int i = 1;i<=threadNum;i++){
//            //新建线程
//            new Thread(
//                    new Runnable() {
//                        @Override
//                        public void run() {
//                            for (int i=0;i<100000;i++){
//                                StaticInnerClass.getInstance();
//                                countDownLatch.countDown();
//                            }
//                        }
//                    }
//            ).run();
//        }
//        countDownLatch.await();
//        long end = System.currentTimeMillis();
//        System.out.println(end-start);
    }

}
