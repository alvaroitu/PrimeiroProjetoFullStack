package com.alvaroitu.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvaroitu.todo.domain.Todo;
import com.alvaroitu.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring boot & Angular", LocalDateTime.parse("25/11/2021 11:00", formatter), false);
		Todo t2 = new Todo(null, "Estudar", "Estudar Java", LocalDateTime.parse("26/11/2021 11:00", formatter), true);
		Todo t3 = new Todo(null, "Exercícos", "Exercícios aeróbicos", LocalDateTime.parse("25/06/2021 11:00", formatter), false);
		Todo t4 = new Todo(null, "Exercícios", "Musculação", LocalDateTime.parse("25/11/2021 11:00", formatter), false);
		Todo t5 = new Todo(null, "Compras", "Lista de compras", LocalDateTime.parse("25/11/2021 11:00", formatter), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5));

	}

}
