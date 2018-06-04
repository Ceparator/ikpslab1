package Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.vlsu.kyrsach2.api.UserApi;
import ru.vlsu.kyrsach2.model.User;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController implements UserApi {

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        return null;
    }

    @Override
    public ResponseEntity<List<User>> getUsersInRole(String rolename) {
        return null;
    }

    @Override
    public ResponseEntity<Void> loginUser(String username, String password) {
        return null;
    }

    @Override
    public ResponseEntity<Void> userRegisterPost(String username, String password, String name, String surename, String phone) {
        return null;
    }
}
