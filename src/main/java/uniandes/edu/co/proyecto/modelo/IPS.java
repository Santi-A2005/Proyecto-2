package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="IPS")
public  class IPS {
    
    @Id
    private int Nit;
    private char nombre;
    private char direccion;
    private char telefono;

    public IPS(int Nit, char nombre, char direccion, char telefono){
        this.Nit=Nit;
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    public IPS(){;}

    public int getNit() {
        return Nit;
    }
    public void setNit(int nit) {
        Nit = nit;
    }
    public char getNombre() {
        return nombre;
    }
    public void setNombre(char nombre) {
        this.nombre = nombre;
    }
    public char getDireccion() {
        return direccion;
    }
    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }
    public char getTelefono() {
        return telefono;
    }
    public void setTelefono(char telefono) {
        this.telefono = telefono;
    }

}
