package sad;

import static org.junit.Assert.*;
import org.junit.*;

import dominio.Analista;


public class CuentasTest {
	
	//Atributo
	private Analista analista;
	//Metodos
	
	@Before
	public void init() {		
		this.analista = new Analista();
		analista.cargarEmpresas("test.json");
	}
	
	@Test
	//Probar si se cargaron las cuentas
	public void deberiaColeccionTenerCuatroObjetos() {
		assertEquals(analista.getEmpresas().size(),3);
	}
	
	@Test
	//Muestra las cuentas que cumplen las condiciones, deberian ser dos
	public void deberiaEncontrarTantasCuentas() {
		assertEquals(analista.consultarCuentasPorEmpresaYPerdiodo("Pepe",2016),2);
	}
	
}
