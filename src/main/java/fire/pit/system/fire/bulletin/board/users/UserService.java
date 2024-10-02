//package fire.pit.system.fire.bulletin.board.users;
//
//import org.springframework.stereotype.Service;
//import java.time.LocalDateTime;
//
//@Service
//public class UserService {
//
//    private final UserRepository userRepository;
//
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public Users saveUser(String name, String role, LocalDateTime createdAt) {
//        Users users = new Users();
//        users.setName(name);
//        users.setRole(role);
//        users.setCreatedAt(createdAt);
//        return userRepository.save(users);
//    }
//}

package fire.pit.system.fire.bulletin.board.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}

