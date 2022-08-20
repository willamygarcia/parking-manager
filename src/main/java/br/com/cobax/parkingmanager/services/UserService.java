package br.com.cobax.parkingmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cobax.parkingmanager.domain.User;
import br.com.cobax.parkingmanager.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void create(User user){
		userRepository.save(user);
	}
	
	public User findById(Long id) {
		return userRepository.findById(id).get();
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public void update(User user, Long id) {
		user.setId(id);
		userRepository.save(user);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
}
