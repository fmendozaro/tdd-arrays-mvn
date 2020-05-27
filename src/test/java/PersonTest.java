import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    Person fer;
    Person delayne;

    @Before
    public void setup(){
         fer = new Person("Fer", "Mendoza");
         delayne = new Person("Delayne", "Labove");
    }

    // person class need to 2 props firstName and lastName
    @Test
    public void testPersonClass(){
        assertEquals("Fer",  fer.getFirstName());
        assertEquals("Delayne",  delayne.getFirstName());
    }

    @Test
    public void testIfArrayOfPersonWorks(){
        Person[] people = {fer, delayne};
        assertEquals(2, people.length);
        assertEquals("Mendoza", people[0].getLastName());
        assertEquals("Labove", people[1].getLastName());
    }


}
