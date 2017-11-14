package fr.blossom.core.user;

/**
 * Created by Maël Gargadennnec on 04/05/2017.
 */
public interface UserMailService {

  void sendAccountCreationEmail(UserDTO user) throws Exception;

  void sendChangePasswordEmail(UserDTO user) throws Exception;

}