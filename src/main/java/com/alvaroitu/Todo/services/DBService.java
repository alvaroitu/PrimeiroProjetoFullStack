package com.alvaroitu.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvaroitu.todo.domain.Todo;
import com.alvaroitu.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDados() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Todo t1 = new Todo(null, "Estudar", "Estudar Spring boot & Angular", sdf.parse("25/11/2021"), false);
		Todo t2 = new Todo(null, "Estudar", "Estudar Java", sdf.parse("26/11/2021"), false);
		Todo t3 = new Todo(null, "Exercícos", "Exercícios aeróbicos", sdf.parse("25/06/2021"), true);
		Todo t4 = new Todo(null, "Exercícios", "Musculação", sdf.parse("25/11/2021"), true);
		Todo t5 = new Todo(null, "Compras", "Lista de compras", sdf.parse("25/11/2021"), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5));

	}

}
