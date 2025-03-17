package uniandes.edu.co.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
import uniandes.edu.co.proyecto.modelo.ServicioIPS;
import uniandes.edu.co.proyecto.modelo.ServicioIPSPK;

public interface ServicioIPSRepository  extends JpaRepository<ServicioIPS, ServicioIPSPK> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO SERVICIOIPS(Nit_EPS, Id_Servicio) VALUES(:Nit_EPS, :Id_Servicio)", nativeQuery = true)
    void asignarServicioIPS(@Param("Nit_EPS") int Nit_EPS, @Param("Id_Servicio") int Id_Servicio);
}
