package wipro.training.assignmentonemonolithtradingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wipro.training.assignmentonemonolithtradingapp.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsernameAndPassword(String username, String password);
}
