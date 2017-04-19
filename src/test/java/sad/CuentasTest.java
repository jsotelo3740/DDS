package sad;

import static org.junit.Assert.*;
import org.junit.*;


public class CuentasTest {
	
	//Atributo
	private Analista analista;
	//Metodos
	
	//Cantidad de cuentas que cumplen la condicion
	private long cantidadDeCuentasQue(String nombreEmpresa, String periodo) { 
		return this.analista.cuentas.stream()
					.filter(cuenta -> cuenta.perteneceAEmpresaYPeriodo(nombreEmpresa, periodo))
					.count();		
		}
	
		
	@Before
	public void init() {		
		this.analista = new Analista();
		analista.cargarCuentas("cuentasNuevas.cvs");
	}
	
	@Test
	//Probar si se cargaron las cuentas
	public void deberiaColeccionTenerCuatroObjetos() {
		assertEquals(analista.cuentas.size(),3);
	}
	
	@Test
	//Muestra las cuentas que cumplen las condiciones, deberian ser dos
	public void deberiaEncontrarTantasCuentas() {
		assertEquals(this.cantidadDeCuentasQue("Pepe","2016"),2);
	}
	
	@Test
	//Muestra las cuentas que cumplen las condiciones, deberian ser dos
	public void deberiaEncontrarMostrarDosCuentas() {
		analista.consultarCuentas("Pepe", "2016");
	}
}
