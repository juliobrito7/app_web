package com.web.classroomsystem.app;

import com.web.classroomsystem.app.Entity.Aula;
import com.web.classroomsystem.app.Repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Autowired
	private AulaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Aula aula1 = new Aula("pb2","anexo","desarrollo de software","tulio ruesjas martin","back end","2023:12:30","15:00:00","17:00:00");
		repository.save(aula1);

		Aula aula2 = new Aula("a1","cuc","desarrollo de software","belen lucero","humanistica II","2023:12:29","11:30:00","13:30:00");
		repository.save(aula2);

		 */
	}
}
