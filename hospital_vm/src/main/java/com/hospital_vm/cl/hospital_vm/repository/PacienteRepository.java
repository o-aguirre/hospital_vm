package com.hospital_vm.cl.hospital_vm.repository;

import com.hospital_vm.cl.hospital_vm.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    // Encuentra pacientes por apellidos
    List<Paciente> findByApellido(String apellido);

    // Encuentra pacientes por correo
    Paciente findByCorreo(String correo);

    // Encuentra pacientes por nombre y apellido
    List<Paciente> findByNombreAndApellido(String nombre, String apellido);

    // Usando JPQL
    @Query("SELECT p FROM Paciente p WHERE p.apellido = :apellido")
    List<Paciente> buscarPorApellido(@Param("apellido") String apellido);

    // Usando SQL nativo
    @Query(value = "SELECT * FROM paciente WHERE correo = :correo", nativeQuery = true)
    Paciente buscarPorCorreo(@Param("correo") String correo);
}
