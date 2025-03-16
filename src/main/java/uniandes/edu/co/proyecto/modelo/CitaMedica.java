package uniandes.edu.co.proyecto.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="CITA_MEDICA")
public class CitaMedica {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private int Id;
    private Date Fecha;
    private Date Hora;
    private char Estado;

    @ManyToOne
    @JoinColumn(name = "Medico", referencedColumnName = "NumeroDocumento")
    private Medico Medico;

    @ManyToOne
    @JoinColumn(name = "Afiliado", referencedColumnName = "NumeroDocumento")
    private Afiliado Afiliado;

    public CitaMedica(Date fecha, Date hora, char estado, Medico medico,
            Afiliado afiliado) {
        Fecha = fecha;
        Hora = hora;
        Estado = estado;
        Medico = medico;
        Afiliado = afiliado;
    }
    public CitaMedica(){;}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Date getHora() {
        return Hora;
    }

    public void setHora(Date hora) {
        Hora = hora;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char estado) {
        Estado = estado;
    }

    public Medico getMedico() {
        return Medico;
    }

    public void setMedico(Medico medico) {
        Medico = medico;
    }

    public Afiliado getAfiliado() {
        return Afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        Afiliado = afiliado;
    }

    
    
    
}
