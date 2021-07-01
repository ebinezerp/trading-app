package wipro.training.assignmentonemonolithtradingapp.service;

import org.springframework.stereotype.Service;
import wipro.training.assignmentonemonolithtradingapp.model.User;
import wipro.training.assignmentonemonolithtradingapp.repository.UserRepository;

public interface UserService {
    public User saveUser(User user);
    public User authenticate(String username, String password);
}
