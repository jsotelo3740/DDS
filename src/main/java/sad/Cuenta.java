package sad;

public class Cuenta {

	//Constructor
		
	public Cuenta(String nombreCuenta, String nombreEmpresa, String periodo, Double valor) {
		this.nombreCuenta = nombreCuenta;
		this.nombreEmpresa = nombreEmpresa;
		this.periodo = periodo;
		this.valor = valor;
	}

	//Atributos
	private String nombreCuenta;
	
	private String nombreEmpresa;
	
	private String periodo;
	
	private Double valor;
	
	//Metodos
	public void mostrarCuenta(){
		System.out.println(this.getNombreCuenta() + " : " +  this.getValor());	
	}
	
	public Boolean perteneceAEmpresaYPeriodo(String nombreEmpresa, String periodo){
		return this.getNombreEmpresa().equals(nombreEmpresa) & this.getPeriodo().equals(periodo);
	
	}
	//Getters and Setters

	public String getNombreCuenta() {
		return nombreCuenta;
	}

	public void setNombreCuenta(String nombre) {
		this.nombreCuenta = nombre;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String empresa) {
		this.nombreEmpresa = empresa;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}	
	
	
}
