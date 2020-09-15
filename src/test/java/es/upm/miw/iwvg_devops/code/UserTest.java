package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User("0", "Jaime", "Pérez", new ArrayList<Fraction>());
    }

    @Test
    void testAddFraction() {
        user.addFraction(new Fraction(4, 3));
        assertEquals(4, user.getFractions()
                .get(user.getFractions().size() - 1)
                .getNumerator());
        assertEquals(3, user.getFractions()
                .get(user.getFractions().size() - 1)
                .getDenominator());
    }

    @Test
    void testFullName() {
        assertEquals("Jaime Pérez", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("J.", user.initials());
    }

}
