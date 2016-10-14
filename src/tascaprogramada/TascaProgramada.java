package tascaprogramada;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TascaProgramada {

    public static void main(String[] args) {
        
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);

        scheduledThreadPool.scheduleWithFixedDelay(new ImprimeixExecucioTasca(), 2, 3, TimeUnit.SECONDS);
        
        try {
            scheduledThreadPool.awaitTermination(15, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            
        }
        
        scheduledThreadPool.shutdown();

    }

    
}
