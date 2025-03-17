package uniandes.edu.co.proyecto.repositorio;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
import uniandes.edu.co.proyecto.modelo.Afiliado;

public interface AfiliadoRepository extends  JpaRepository<Afiliado, Integer>{


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO AFILIADOS (NumeroDocumento, TipoDocumento, Nombre, NumeroTelefonico, FechaNacimiento, Direccion) VALUES (:NumeroDocumento, :TipoDocumento, :Nombre, :NumeroTelefonico, :FechaNacimiento, :Direccion)", nativeQuery = true)
    void registrarAfiliado(@Param("NumeroDocumento") int NumeroDocumento, @Param("TipoDocumento") char TipoDocumento,
    @Param("Nombre") char Nombre,@Param("NumeroTelefonico") char NumeroTelefonico, @Param("FechaNacimiento") Date FechaNacimiento,@Param("Direccion") char Direccion);
}
    

