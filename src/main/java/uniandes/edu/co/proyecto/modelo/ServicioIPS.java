package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="SERVICIOIPS")
public class ServicioIPS {
    
    @EmbeddedId
    private ServicioIPSPK pk;

    public ServicioIPS(){;}
    
    public ServicioIPS(IPS Nit_EPS, Servicio Id_Servicio){
        super();
        this.pk = new ServicioIPSPK(Nit_EPS, Id_Servicio);
    }

    public ServicioIPSPK getPk() {
        return pk;
    }

    public void setPk(ServicioIPSPK pk) {
        this.pk = pk;
    }

    
}
