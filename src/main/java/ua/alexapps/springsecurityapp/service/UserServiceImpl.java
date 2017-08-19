package ua.alexapps.springsecurityapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.alexapps.springsecurityapp.dao.RoleDao;
import ua.alexapps.springsecurityapp.dao.UserDao;
import ua.alexapps.springsecurityapp.model.Role;
import ua.alexapps.springsecurityapp.model.User;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by OIvanchenko on 17.08.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder  bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<Role>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.save(user);

    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
