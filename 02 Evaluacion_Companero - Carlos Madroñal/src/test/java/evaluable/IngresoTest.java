package evaluable;

import com.evaluable.Ingreso;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IngresoTest {

    @Test
    void testConstructorYGetters() {
        Ingreso ingreso = new Ingreso(1000.0, "Nómina");
        assertEquals(1000.0, ingreso.getDinero());
        assertEquals("Nómina", ingreso.getDescripcion());
    }

    @Test
    void testToString() {
        Ingreso ingreso = new Ingreso(500.0, "Extra");
        String texto = ingreso.toString();
        assertTrue(texto.contains("Dinero ingresado"));
        assertTrue(texto.contains("Extra"));
    }
}
