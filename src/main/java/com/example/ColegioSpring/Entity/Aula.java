package com.example.ColegioSpring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Aulas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aula extends BaseClass{

    private String nombre;
    private Integer cantidadBancos;


}
