package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SERVICIO")
public class Servicio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private int Id_Servicio;
    private char Servicio;
    public Servicio(char servicio) {
        Servicio = servicio;
    }
    public Servicio(){;}
    
    public int getId_Servicio() {
        return Id_Servicio;
    }
    public void setId_Servicio(int id_Servicio) {
        Id_Servicio = id_Servicio;
    }
    public char getServicio() {
        return Servicio;
    }
    public void setServicio(char servicio) {
        Servicio = servicio;
    }
    
    
}
