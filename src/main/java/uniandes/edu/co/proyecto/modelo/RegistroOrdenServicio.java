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
@Table(name="REGISTROORDENSERVICIO")
public class RegistroOrdenServicio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private int IdRegistro;
    private char Estado;
    private Date Fecha;
    //clob Observaciones
    @ManyToOne
    @JoinColumn(name = "Id_Orden", referencedColumnName = "Id")
    private Orden Id_Orden;

    @ManyToOne
    @JoinColumn(name = "Id_Servicio", referencedColumnName = "Id_Servicio")
    private Servicio Id_Servicio;

    public RegistroOrdenServicio(char estado, Date fecha, Orden id_Orden, Servicio id_Servicio) {
        Estado = estado;
        Fecha = fecha;
        Id_Orden = id_Orden;
        Id_Servicio = id_Servicio;
    }

    public RegistroOrdenServicio(){;}

    public int getIdRegistro() {
        return IdRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        IdRegistro = idRegistro;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char estado) {
        Estado = estado;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Orden getId_Orden() {
        return Id_Orden;
    }

    public void setId_Orden(Orden id_Orden) {
        Id_Orden = id_Orden;
    }

    public Servicio getId_Servicio() {
        return Id_Servicio;
    }

    public void setId_Servicio(Servicio id_Servicio) {
        Id_Servicio = id_Servicio;
    }

}
