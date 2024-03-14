package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Filip Jirsák
 */
class SvatkyTest {

    /**
     * Testuje metodu {@link Svatky#vratKdyMaSvatek(String)}
     */
    @Test
    void vratKdyMaSvatek() {
        Svatky svatky = new Svatky();
        assertEquals(MonthDay.of(5, 18), svatky.vratKdyMaSvatek("Nataša"));
        assertNull(svatky.vratKdyMaSvatek("Eva"));
    }

    /**
     * Testuje metodu {@link Svatky#jeVSeznamu(String)}
     */
    @Test
    void jeVSeznamu() {
        Svatky svatky = new Svatky();
        assertTrue(svatky.jeVSeznamu("Alex"));
        assertFalse(svatky.jeVSeznamu("Alexandr"));
    }

    /**
     * Testuje metodu {@link Svatky#getPocetJmen()}
     */
    @Test
    void getPocetJmen() {
        Svatky svatky = new Svatky();
        assertEquals(37, svatky.getPocetJmen());
    }

    /**
     * Testuje metodu {@link Svatky#getSeznamJmen()}
     */
    @Test
    void getSeznamJmen() {
        Svatky svatky = new Svatky();
        assertEquals(37, svatky.getSeznamJmen().size());
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, int)}
     */
    @Test
    void pridejSvatekDenMesicInt() {
        Svatky svatky = new Svatky();
        svatky.pridejSvatek("Linda", 9, 1);
        assertEquals(MonthDay.of(1, 9), svatky.vratKdyMaSvatek("Linda"));
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, Month)}
     */
    @Test
    void pridejSvatekDenMesicMonth() {
        Svatky svatky = new Svatky();
        svatky.pridejSvatek("Alexandr", 27, Month.FEBRUARY);
        assertEquals(MonthDay.of(2, 27), svatky.vratKdyMaSvatek("Alexandr"));
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, MonthDay)}
     */
    @Test
    void pridejSvatekMonthDay() {
        Svatky svatky = new Svatky();
        svatky.pridejSvatek("David", MonthDay.of(Month.DECEMBER, 30));
        assertEquals(MonthDay.of(12, 30), svatky.vratKdyMaSvatek("David"));
    }

    /**
     * Testuje metodu {@link Svatky#smazSvatek(String)}
     */
    @Test
    void smazSvatek() {
        Svatky svatky = new Svatky();
        svatky.smazSvatek("Viliam");
        assertEquals(36, svatky.getPocetJmen());
    }
}
