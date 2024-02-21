package com.doggos.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doggos.domain.Doggo;
import com.doggos.service.DoggoService;

@RestController
public class DoggoAPI {
	@Autowired
	private DoggoService service;
	
	@GetMapping("/{id}")
    public Optional<Doggo> findOne(@PathVariable String id) {
        return service.findOneDoggo(id);
    }
	
	@GetMapping("/")
	public Iterable<Doggo> findAllDoggos() {
		return service.findAllDoggos();
	}
	
	@PostMapping("/")
	public Doggo createDoggo(@RequestBody Doggo dog) {
		Doggo newDog = service.createDoggo(new Doggo(dog.name));
		return newDog;
	}
	
	@PutMapping("/update")
	public Doggo updateDoggo(@RequestBody Doggo dog) {
		return service.updateDoggo(dog);
	}
	
	@DeleteMapping("/delete/{id}")
	public Optional<Doggo> deleteDoggo(@PathVariable String id) {
		Optional<Doggo> deletedDoggo = service.findOneDoggo(id);
		service.deleteDog(id);
		return deletedDoggo;
	}
	
}
