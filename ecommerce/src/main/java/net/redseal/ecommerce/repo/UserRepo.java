package net.redseal.ecommerce.repo;

import net.redseal.ecommerce.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
