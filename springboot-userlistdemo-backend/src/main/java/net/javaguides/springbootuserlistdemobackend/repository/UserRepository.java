package net.javaguides.springbootuserlistdemobackend.repository;

import net.javaguides.springbootuserlistdemobackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
