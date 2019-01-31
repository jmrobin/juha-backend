package jmr.sb.juhabackend.security;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
	User findByUsername(String username);
}