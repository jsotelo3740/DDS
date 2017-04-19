package sad;

import java.util.*;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Analista {

	public Analista (){
		this.cuentas = new HashSet<Cuenta>();
	}
	
	//Atributos
	
	Set<Cuenta> cuentas;

	//Metodos
	
	public void cargarCuentaNueva(Cuenta unaCuenta){
		this.cuentas.add(unaCuenta);
	}
	
	public void cargarCuentas(String archivo){
		try {
				CsvReader archivoCuentas = new CsvReader(archivo);
				archivoCuentas.readHeaders(); 
				while (archivoCuentas.readRecord())
				{
					String nombreEmpresa = archivoCuentas.get("NombreEmpresa");
					String periodo = archivoCuentas.get("Periodo");
					String nombreCuenta = archivoCuentas.get("NombreCuenta");
					Double valor = Double.parseDouble(archivoCuentas.get("Valor"));					
					
					Cuenta unaCuenta = new Cuenta(nombreCuenta, nombreEmpresa, periodo, valor);
					this.cargarCuentaNueva(unaCuenta);
					
					
				}
				archivoCuentas.close();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public void consultarCuentas(String nombreEmpresa, String periodo) {
		System.out.println("Empresa : " +  nombreEmpresa + " Periodo : " + periodo);
		this.cuentas.stream()
		.filter(cuenta -> cuenta.perteneceAEmpresaYPeriodo(nombreEmpresa, periodo))
		.forEach(cuenta -> cuenta.mostrarCuenta());
	}
			
	//Getters and Setters

	public Set<Cuenta> getCuentas() {
		return cuentas;
	}

	
}
