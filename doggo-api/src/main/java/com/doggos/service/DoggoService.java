package com.doggos.service;

import java.util.Optional;

import com.doggos.domain.Doggo;

public interface DoggoService {
	public Iterable<Doggo> findAllDoggos();
	public Optional<Doggo> findOneDoggo(String id);
	public Doggo createDoggo(Doggo dog);
	public void deleteDog(String id);
	public Doggo updateDoggo(Doggo dog);
}
