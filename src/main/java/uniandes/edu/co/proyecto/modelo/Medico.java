package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="MEDICO")
public class Medico {
    
    @Id
    private int NumeroDocumento;
    private char TipoDocumento;
    private char Especialidad;
    private char RegistroMedico;
    
    @ManyToOne
    @JoinColumn(name = "IPS", referencedColumnName = "Nit")
    private IPS IPS;

    public Medico(){;}

    public Medico(int numeroDocumento, char tipoDocumento, char especialidad, char registroMedico, IPS iPS) {
        NumeroDocumento = numeroDocumento;
        TipoDocumento = tipoDocumento;
        Especialidad = especialidad;
        RegistroMedico = registroMedico;
        IPS = iPS;
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

    public char getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(char especialidad) {
        Especialidad = especialidad;
    }

    public char getRegistroMedico() {
        return RegistroMedico;
    }

    public void setRegistroMedico(char registroMedico) {
        RegistroMedico = registroMedico;
    }

    public IPS getIPS() {
        return IPS;
    }

    public void setIPS(IPS iPS) {
        IPS = iPS;
    }

    
}
