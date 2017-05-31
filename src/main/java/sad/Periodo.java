package sad;

import java.util.ArrayList;
import java.util.List;

public class Periodo {

	public Periodo (int anio){
		this.anio = anio;
	}
	
	//Atributos
	
	 private List<Cuenta> cuentas = new ArrayList<>();
	 private int anio;

	//Metodos
	
	//Getters and Setters
	public int getPeriodo (){
        return anio;
    }
	public List<Cuenta> getCuentas() {
        return cuentas;
    }
	public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
	
}
