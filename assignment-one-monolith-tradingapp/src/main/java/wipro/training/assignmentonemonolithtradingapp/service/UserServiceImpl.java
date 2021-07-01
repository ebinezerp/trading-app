package wipro.training.assignmentonemonolithtradingapp.service;

import org.springframework.stereotype.Service;
import wipro.training.assignmentonemonolithtradingapp.exceptions.InvalidCredentialsException;
import wipro.training.assignmentonemonolithtradingapp.exceptions.NullUserException;
import wipro.training.assignmentonemonolithtradingapp.model.User;
import wipro.training.assignmentonemonolithtradingapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        try {
            user.setTradingAmountBalance(100000.00);
            return userRepository.save(user);
        } catch (IllegalArgumentException e) {
            throw new NullUserException();
        }
    }

    @Override
    public User authenticate(String username, String password) {
        return userRepository
                .findByUsernameAndPassword(username, password)
                .orElseThrow(() -> new InvalidCredentialsException());

    }
}
