import java.lang.*;
import java.util.concurrent.CountDownLatch;
 
public class SleepSort {

	public static void sortAndPrinting(int[] nums) {

        final CountDownLatch doneSignal = new CountDownLatch(nums.length);
        
		for (final int num : nums) {

			new Thread(new Runnable() {

				public void run() {

                    doneSignal.countDown();
                    
					try {

                        doneSignal.await();
                        
						Thread.sleep(num * 500);
                        System.out.println(num);
                        
					} catch (InterruptedException e) {

                        e.printStackTrace();
                        
                    }
                    
                }
                
            }).start();
            
        }
        
    }
    
}
