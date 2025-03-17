package uniandes.edu.co.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
import uniandes.edu.co.proyecto.modelo.IPS;

public interface IPSRepository extends JpaRepository<IPS, Integer>{

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO IPS(Nit, nombre, direccion, telefono) VALUES(:Nit, :nombre, :direccion, :telefono)", nativeQuery = true)
    void registrarIPS(@Param("Nit") int Nit, @Param("nombre") char nombre, @Param("direccion") char direccion,
    @Param("telefono") char telefono);
    
}
