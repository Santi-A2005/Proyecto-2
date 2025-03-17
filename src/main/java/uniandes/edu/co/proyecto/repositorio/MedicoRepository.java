package uniandes.edu.co.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
import uniandes.edu.co.proyecto.modelo.Medico;


public interface MedicoRepository extends JpaRepository<Medico, Integer>{

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO MEDICOS(NumeroDocumento, TipoDocumento, Especialidad, RegistroMedico, IPS) VALUES(:NumeroDocumento, :TipoDocumento, :Especialidad, :RegistroMedico, :IPS)", nativeQuery= true)
    void registrarMedico(@Param("NumeroDocumento") int NumeroDocumento, @Param("TipoDocumento") char TipoDocumento, @Param("Especialidad") char Especialidad,
    @Param("RegistroMedico") char RegistroMedico, @Param("IPS") int IPS);
    
}
