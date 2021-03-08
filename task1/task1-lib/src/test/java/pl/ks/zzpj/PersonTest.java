package pl.ks.zzpj;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void personTest() {
        Person person = new Person("Adam");
        assertEquals("Adam", person.getName());
        person.setName("Ewa");
        assertEquals("Ewa", person.getName());
    }
}