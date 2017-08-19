package ua.alexapps.springsecurityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.alexapps.springsecurityapp.model.Role;

/**
 * Created by OIvanchenko on 16.08.2017.
 */
public interface RoleDao extends JpaRepository<Role, Long> {
}
