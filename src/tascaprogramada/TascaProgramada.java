package tascaprogramada;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TascaProgramada {

    public static void main(String[] args) {
        
        /**
         * Declarem scheduledThreadPool per a crear les dos pools, a continuacio
         * cridem a scheduleWithFixedDelay i l'hi pasem l'objecte ImprimeixExecucioTasca(),
         * el temps per a que comenci, el delay que tindra, i la unitat metrica.
         * Despres en un try catch per a finalitzar, gracies a awaitTermination 
         * posem un limit d'execució. I finalitzem amb shutdown().
         */
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);

        scheduledThreadPool.scheduleWithFixedDelay(new ImprimeixExecucioTasca(), 2, 3, TimeUnit.SECONDS);
        
        try {
            scheduledThreadPool.awaitTermination(15, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            
        }
        
        scheduledThreadPool.shutdown();

    }

    
}
