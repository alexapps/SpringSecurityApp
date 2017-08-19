package ua.alexapps.springsecurityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.alexapps.springsecurityapp.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
