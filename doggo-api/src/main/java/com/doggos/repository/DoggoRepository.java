package com.doggos.repository;

import com.doggos.domain.Doggo;
import org.springframework.data.repository.CrudRepository;

public interface DoggoRepository extends CrudRepository<Doggo, Long> {

}
