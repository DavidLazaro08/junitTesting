package evaluable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaTest {

    @Test
    void testSetYGetSaldo() {
        com.evaluable.Cuenta cuenta = new com.evaluable.Cuenta(null); // No usamos Usuario para evitar Scanner
        cuenta.setSaldo(100.0);
        assertEquals(100.0, cuenta.getSaldo());
    }

    @Test
    void testAgregarIngreso() {
        com.evaluable.Cuenta cuenta = new com.evaluable.Cuenta(null);
        com.evaluable.Ingreso ingreso = new com.evaluable.Ingreso(150.0, "Pago extra");
        cuenta.getIngresos().add(ingreso);
        assertFalse(cuenta.getIngresos().isEmpty());
        assertEquals(150.0, cuenta.getIngresos().get(0).getDinero());
    }

    @Test
    void testAgregarGasto() {
        com.evaluable.Cuenta cuenta = new com.evaluable.Cuenta(null);
        com.evaluable.Gasto gasto = new com.evaluable.Gasto(80.0, "Cine");
        cuenta.getGastos().add(gasto);
        assertFalse(cuenta.getGastos().isEmpty());
        assertEquals("Cine", cuenta.getGastos().get(0).getDescripcion());
    }
}
