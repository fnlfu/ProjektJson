import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjektTest {



    @Test
    public void testPerson(){

        Person osoba = new Person();
        osoba.setImie("imie");
        osoba.setNazwisko("nazwisko");
        Assert.assertEquals(osoba.getImieNazwisko(),"imie nazwisko");

    }



}
