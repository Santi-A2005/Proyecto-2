package uniandes.edu.co.proyecto.modelo;

import java.io.Serializable;


import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class OrdenCitaPK implements Serializable{
    
    @ManyToOne
    @JoinColumn(name="Id_Cita", referencedColumnName="Id")
    private CitaMedica Id_Cita;

    @ManyToOne
    @JoinColumn(name="Id_Orden", referencedColumnName="Id")
    private Orden Id_Orden;

    public OrdenCitaPK(){
        super();
    }

    public OrdenCitaPK(CitaMedica id_Cita, Orden id_Orden) {
        super();
        Id_Cita = id_Cita;
        Id_Orden = id_Orden;
    }

    public CitaMedica getId_Cita() {
        return Id_Cita;
    }

    public void setId_Cita(CitaMedica id_Cita) {
        Id_Cita = id_Cita;
    }

    public Orden getId_Orden() {
        return Id_Orden;
    }

    public void setId_Orden(Orden id_Orden) {
        Id_Orden = id_Orden;
    }

    

    

}
