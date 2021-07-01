package wipro.training.assignmentonemonolithtradingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wipro.training.assignmentonemonolithtradingapp.model.StockInfo;

import java.util.Optional;

public interface StockInfoRepository extends JpaRepository<StockInfo,Integer> {
    public Optional<StockInfo> findByCompanyName(String companyName);
}
