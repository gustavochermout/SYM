package unifeso.mobile.sym.Controls;

import java.util.Calendar;

/**
 * Created by Usuario on 05/09/2017.
 */

public class ResumoControl {

    public ResumoControl() {
    }

    public String retornaMesSelecionado(){
        return String.valueOf(Calendar.getInstance().get(Calendar.MONTH));
    }
}
