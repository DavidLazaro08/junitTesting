package evaluable;

import com.evaluable.Gasto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GastoTest {

    @Test
    void testConstructorYGetters() {
        Gasto gasto = new Gasto(200.0, "Vacaciones");
        assertEquals(200.0, gasto.getDinero());
        assertEquals("Vacaciones", gasto.getDescripcion());
    }

    @Test
    void testToString() {
        Gasto gasto = new Gasto(100.0, "Cine");
        String texto = gasto.toString();
        assertTrue(texto.contains("Gasto realizado"));
        assertTrue(texto.contains("Cine"));
    }
}
