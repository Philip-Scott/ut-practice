

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
        assertEquals ("1 año 1 mes y 1 dia", date.age ("27/7/2015"));
    }

    @Test
    public void dia_invalido () {
        assertEquals ("Error: Dia invalido", date.age ("44/7/2015"));
        assertEquals ("Error: Dia invalido", date.age ("0/7/2015"));
    }

    @Test
    public void mes_invalido () {
        assertEquals ("Error: Mes invalido", date.age ("24/72/2015"));
        assertEquals ("Error: Mes invalido", date.age ("24/0/2015"));
    }

    @Test
    public void ano_invalido () {
        assertEquals ("Error: Ano invalido", date.age ("24/7/fasdf"));
        assertEquals ("Error: Ano invalido", date.age ("24/7/-2133"));
    }

    @Test
    public void formato_invalido () {
        assertEquals ("Error: Formato invalido", date.age ("24-7-2015"));
    }

    @Test
    public void fecha_futura () {
        assertEquals ("Error: fecha futura", date.age ("24/7/3015"));
    }
}
