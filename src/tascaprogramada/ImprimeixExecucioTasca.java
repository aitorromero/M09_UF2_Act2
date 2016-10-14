package tascaprogramada;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ImprimeixExecucioTasca implements Runnable{


        @Override
        public void run() {

            int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            int min = Calendar.getInstance().get(Calendar.MINUTE);
            int seg = Calendar.getInstance().get(Calendar.SECOND);
            System.out.println(hora+":"+min+":"+seg);
        }
        
}
