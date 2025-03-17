package uniandes.edu.co.proyecto.repositorio;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.RegistroOrdenServicio;

public interface RegistroOrdenServicioRepository extends JpaRepository<RegistroOrdenServicio, Integer>{

    @Query(value = "INSERT INTO REGISTROORDENSERVICIO(IdResgistro, Estado, Fecha, Id_Orden, Id_Servicio) VALUES(:Estado, :Fecha, :Id_Orden, :Id_Servicio)", nativeQuery = true)
    void insertarOrdenServicio(@Param("Estado") char Estado, @Param("Fecha") Date Fecha, @Param("Id_Orden") int Id_Orden, @Param("Id_Servicio") int Id_Servicio);
    
}
