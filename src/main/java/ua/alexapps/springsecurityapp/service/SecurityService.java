package ua.alexapps.springsecurityapp.service;

/**
 * Service for security
 *
 *  @author  Oivanchenko.
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
