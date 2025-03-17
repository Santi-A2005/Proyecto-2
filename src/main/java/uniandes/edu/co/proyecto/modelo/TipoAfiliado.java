package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TIPOAFILIADO")
public class TipoAfiliado {

    private char Tipo;
    private char Relacion;

    @Id
    @ManyToOne
    @JoinColumn(name = "Afiliado", referencedColumnName = "NumeroDocumento")
    private Afiliado Afiliado;

    public TipoAfiliado(char tipo, char relacion, uniandes.edu.co.proyecto.modelo.Afiliado afiliado) {
        Tipo = tipo;
        Relacion = relacion;
        Afiliado = afiliado;
    }

    public char getTipo() {
        return Tipo;
    }

    public void setTipo(char tipo) {
        Tipo = tipo;
    }

    public char getRelacion() {
        return Relacion;
    }

    public void setRelacion(char relacion) {
        Relacion = relacion;
    }

    public Afiliado getAfiliado() {
        return Afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        Afiliado = afiliado;
    }

    

    
    
}
