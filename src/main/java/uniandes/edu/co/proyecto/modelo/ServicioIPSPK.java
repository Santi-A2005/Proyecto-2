package uniandes.edu.co.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ServicioIPSPK implements Serializable{

    @ManyToOne
    @JoinColumn(name="Nit_EPS", referencedColumnName="Nit")
    private IPS Nit_EPS;

    @ManyToOne
    @JoinColumn(name="Id_Servico", referencedColumnName="Id_Servicio")
    private Servicio Id_Servico;

    public ServicioIPSPK(){
        super();
    }

    public ServicioIPSPK(IPS nit_eps, Servicio id_Servicio) {
        super();
        Nit_EPS = nit_eps;
        Id_Servico = id_Servicio;
    }

    public IPS getNit_EPS() {
        return Nit_EPS;
    }

    public void setNit_EPS(IPS nit_EPS) {
        Nit_EPS = nit_EPS;
    }

    public Servicio getId_Servico() {
        return Id_Servico;
    }

    public void setId_Servico(Servicio id_Servico) {
        Id_Servico = id_Servico;
    }

    
    
}
