package uniandes.edu.co.proyecto.repositorio;

import java.sql.Date;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
import uniandes.edu.co.proyecto.modelo.CitaMedica;

public interface CitaMedicaRepository extends  JpaRepository<CitaMedica, Integer>{

    @Query(value = "SELECT * FROM CITA WHERE Fecha BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 4 WEEKS)", nativeQuery = true)
    Collection<CitaMedica> consultarDisponibilidad(@Param("Fecha") Date Fecha);


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO CITA(Id, Fecha, Hora, Estado, Medico, Afiliado) VALUES(:Fecha, :Hora, :Estado, :Medico, :Afiliado)", nativeQuery = true)
    void agregarCita(@Param("Fecha") Date Fecha, @Param("Hora") Date Hora, @Param("Estado") char Estado, @Param("Medico") int Medico, 
    @Param("Afiliado") int Afiliado);
}
