package com.hospital.vm.hospitalvm.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "paciente")
@Data
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 12, unique = true)
    private String run;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String apellidos;

    private String correo;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;
}
