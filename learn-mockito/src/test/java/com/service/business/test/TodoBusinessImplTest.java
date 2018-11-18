package com.service.business.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.service.business.TodoBusinessImpl;
import com.service.data.api.TodoService;

public class TodoBusinessImplTest {
	
	@Test
	public void TestRetrieveTodosRelatedToSpring_withData()
	{
		TodoService todoservicemock = mock(TodoService.class);
		
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		
		when(todoservicemock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoservicemock);
		
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		
		assertEquals(0,filteredTodos.size());
	}

}
