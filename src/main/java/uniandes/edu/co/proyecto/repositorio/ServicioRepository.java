package uniandes.edu.co.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
import uniandes.edu.co.proyecto.modelo.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Integer>{

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO SERVICO(Id_Servicio, Servicio) VALUES(:Servicio)", nativeQuery = true)
    void registrarServicio(@Param("Servicio") char Servicio);

}
