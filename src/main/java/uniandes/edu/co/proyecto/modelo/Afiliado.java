package uniandes.edu.co.proyecto.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AFILIADO")
public class Afiliado {

    @Id
    private int NumeroDocumento;
    private char TipoDocumento;
    private char Nombre;
    private char NumeroTelefonico;
    private Date FechaNacimiento;
    private char Direccion;

    public Afiliado(){;}

    public Afiliado(int numeroDocumento, char tipoDocumento, char nombre, char numeroTelefonico, Date fechaNacimiento,
            char direccion) {
        NumeroDocumento = numeroDocumento;
        TipoDocumento = tipoDocumento;
        Nombre = nombre;
        NumeroTelefonico = numeroTelefonico;
        FechaNacimiento = fechaNacimiento;
        Direccion = direccion;
    }

    public int getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        NumeroDocumento = numeroDocumento;
    }

    public char getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(char tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public char getNombre() {
        return Nombre;
    }

    public void setNombre(char nombre) {
        Nombre = nombre;
    }

    public char getNumeroTelefonico() {
        return NumeroTelefonico;
    }

    public void setNumeroTelefonico(char numeroTelefonico) {
        NumeroTelefonico = numeroTelefonico;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public char getDireccion() {
        return Direccion;
    }

    public void setDireccion(char direccion) {
        Direccion = direccion;
    }

    
}
