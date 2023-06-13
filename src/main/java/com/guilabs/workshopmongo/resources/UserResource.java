package com.guilabs.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilabs.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User rachel = new User("1", "Rachel Green", "rachel@gmail.com");
		User ross = new User("2", "Ross Geller", "ross@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(rachel, ross));
		return ResponseEntity.ok().body(list);
	}
}
