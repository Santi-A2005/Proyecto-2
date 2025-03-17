package uniandes.edu.co.proyecto.repositorio;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
import uniandes.edu.co.proyecto.modelo.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Integer>{

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO ORDEN(Id, Fecha, Estado, Medico, Afiliado) VALUES(:Fecha, :Estado, :Medico, :Afiliado)", nativeQuery = true)
    void registrarOrden(@Param("Fecha") Date Fecha, @Param("Estado") char Estado, @Param("Medico") int Medico,
    @Param("Afiliado") int Afiliado);

} 
