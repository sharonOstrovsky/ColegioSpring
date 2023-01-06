package com.example.ColegioSpring;

import com.example.ColegioSpring.Entity.Alumno;
import com.example.ColegioSpring.Entity.Aula;
import com.example.ColegioSpring.Entity.Materia;
import com.example.ColegioSpring.Entity.Profesor;
import com.example.ColegioSpring.Interface.ColegioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ColegioSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ColegioSpringApplication.class, args);
		ColegioRepository repository = context.getBean(ColegioRepository.class);


		Aula aula = new Aula("Aula Magma", 35);
		repository.save(aula);
		List<Materia> materias = new ArrayList<>();

		Materia programacion = new Materia("Programacion", " Lunes 13hs", aula);
		repository.save(programacion);
		Materia matematica = new Materia("Matematica", "Martes 10hs", aula);
		repository.save(matematica);
		Materia ingles = new Materia("Ingles", "Miercoles 20hs", aula);
		repository.save(ingles);
		materias.add(programacion);
		materias.add(matematica);
		materias.add(ingles);

		Alumno alumnoUno = new Alumno("Sharon", "Ostrovsky", 26, materias);
		repository.save(alumnoUno);
		Alumno alumnoDos = new Alumno("Damian", "Bettini", 24, materias);
		repository.save(alumnoDos);


		Profesor profesorUno = new Profesor("Hector", "Sanchez", 35, programacion);
		repository.save(profesorUno);
		Profesor profesorDos = new Profesor("Carlos", "Fernandez", 43, matematica);
		repository.save(profesorDos);


	}

}
