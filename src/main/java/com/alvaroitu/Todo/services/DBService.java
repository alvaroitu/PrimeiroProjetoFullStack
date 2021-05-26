package com.alvaroitu.Todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvaroitu.Todo.domain.Todo;
import com.alvaroitu.Todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring boot e Angular",
				LocalDateTime.parse("25/11/2021 11:00", formatter), false);

		todoRepository.saveAll(Arrays.asList(t1));

	}

}
