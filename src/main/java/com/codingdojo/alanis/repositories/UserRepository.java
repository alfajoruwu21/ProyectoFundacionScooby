package com.codingdojo.alanis.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;

import com.codingdojo.alanis.models.User;

@Controller
public interface UserRepository extends CrudRepository<User, Long>{

	User findByEmail(String email);
}
