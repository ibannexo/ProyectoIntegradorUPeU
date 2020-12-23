package pe.edu.upeu.nicc.modelo;

public class Clientes {
	
	public String DNI;
    public String NombreApellidos;
	public String DireccionDeSuDomicilio;
    public String NumTelf;
	public String DireccionParaLaEntrega;
    
	public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI= DNI;
    }
	
    public String getNombreApellidos() {
        return NombreApellidos;
    }
    public void setNombreApellidos(String NombreApellidos) {
        this.NombreApellidos = NombreApellidos;
    }

	public String getDireccionDeSuDomicilio() {
        return DireccionDeSuDomicilio;
    }

    public void setDireccionDeSuDomicilio(String DireccionDeSuDomicilio) {
        this.DireccionDeSuDomicilio = DireccionDeSuDomicilio;
    }
	    public String getNumTelf() {
        return NumTelf;
    }

    public void setNumTelf(String NumTelf) {
        this.NumTelf = NumTelf;
    }
    public String getDireccionParaLaEntrega() {
        return DireccionParaLaEntrega;
    }

    public void setDireccionParaLaEntrega(String DireccionParaLaEntrega) {
        this.DireccionParaLaEntrega = DireccionParaLaEntrega;
    }



}