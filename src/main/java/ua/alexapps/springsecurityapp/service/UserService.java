package ua.alexapps.springsecurityapp.service;

import ua.alexapps.springsecurityapp.model.User;

/**
 * Created by OIvanchenko on 16.08.2017.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
