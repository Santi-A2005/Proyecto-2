package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="ORDENCITA")
public class OrdenCita {

    @EmbeddedId
    private OrdenCitaPK pk;

    public OrdenCita(){;}
    
    public OrdenCita(CitaMedica Id_Cita, Orden Id_Orden){
        super();
        this.pk = new OrdenCitaPK(Id_Cita, Id_Orden);
    }

    public OrdenCitaPK getPk() {
        return pk;
    }

    public void setPk(OrdenCitaPK pk) {
        this.pk = pk;
    }

    
}
