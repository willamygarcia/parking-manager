package br.com.cobax.parkingmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cobax.parkingmanager.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
