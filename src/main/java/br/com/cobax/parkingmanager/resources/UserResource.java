package br.com.cobax.parkingmanager.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cobax.parkingmanager.domain.User;
import br.com.cobax.parkingmanager.services.UserService;

@RestController
@RequestMapping("users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public void create(@RequestBody User user) {userService.create(user);}
	
	@GetMapping("{id}")
	public User findById(@PathVariable Long id) {return userService.findById(id);}
	
	@GetMapping
	public List<User> findAll(){return userService.findAll();}
	
	@PutMapping("{id}")
	public void update(@RequestBody User user, @PathVariable Long id) { userService.update(user, id);}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {userService.delete(id);}

}
