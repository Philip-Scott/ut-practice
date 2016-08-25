

import mx.iteso.ut_practice.Date;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by felipe on 8/25/16.
 */
public class Date_Test {

    Date date;
    @Before
    public void setUp () {
        date = new Date ();
    }

    @Test
    public void fecha_valida () {
        assertEquals   ("1 año 1 mes y 1 dia", date.age ("24/7/2015"));
    }

    @Test
    public void dia_invalido () {}

    @Test
    public void mes_invalido () {}

    @Test
    public void ano_invalido () {}

    @Test
    public void formato_invalido () {}

    @Test
    public void fecha_futura () {}

}
