package com.example.kursSpringBoot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/hello")
	public List<Student> hello() {
		return List.of(new Student(1L,"Mariam","mariam.jamal@gmail.com",LocalDate.of(2000, Month.JANUARY, 5),21));
	}
}
