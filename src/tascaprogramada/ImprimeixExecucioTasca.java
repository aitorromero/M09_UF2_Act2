package tascaprogramada;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ImprimeixExecucioTasca implements Runnable{

        /**
         * Gracies a la classe Calendar pasem l'hora, els minuts i els segons
         * a cadascuna de les variables hora, min, seg respectivament i l'imprimim.
         */
        @Override
        public void run() {

            int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            int min = Calendar.getInstance().get(Calendar.MINUTE);
            int seg = Calendar.getInstance().get(Calendar.SECOND);
            System.out.println(hora+":"+min+":"+seg);
        }
        
}
