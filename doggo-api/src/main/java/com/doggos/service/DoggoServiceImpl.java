package com.doggos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doggos.domain.Doggo;
import com.doggos.repository.DoggoRepository;


@Service
public class DoggoServiceImpl implements DoggoService {
	@Autowired
	private DoggoRepository repo;
	
	public Iterable<Doggo> findAllDoggos() {
		return repo.findAll();
	}

	@Override
	public Optional<Doggo> findOneDoggo(String id) {
		return repo.findById(Long.parseLong(id));
	}

	@Override
	public Doggo createDoggo(Doggo dog) {
		return repo.save(dog);
	}

	@Override
	public void deleteDog(String id) {
		repo.deleteById(Long.parseLong(id));
		return;
	}

	@Override
	public Doggo updateDoggo(Doggo dog) {
		return repo.save(dog);
	}

}
