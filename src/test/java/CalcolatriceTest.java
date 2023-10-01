import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalcolatriceTest {

    Calcolatrice calcolatrice;

    @Before
    public final void setUp(){
        calcolatrice = new Calcolatrice();
    }

    @Test
    public void testSomma(){
        assertTrue("somma corretta" , calcolatrice.somma(11 , 1) == 12);
    }

    @Test
    public void testMoltiplicazione(){
        assertTrue("moltiplicazione coretta" , calcolatrice.moltiplicazione(10 , 2) == 20);
    }

    @Test
    public void testSottrazione () {
        assertTrue("sottrazione corretta", calcolatrice.sottrazione(15, 7) == 8);
    }

    @Test
    public void testDivisione () {
        assertTrue("divisione corretta", calcolatrice.divisione(20, 4) == 5);
    }

    @Test
    public void testDivisionePerZero () {
        assertTrue("divisione per zaro corretta", calcolatrice.divisione(42, 0) == 0);
    }
}
