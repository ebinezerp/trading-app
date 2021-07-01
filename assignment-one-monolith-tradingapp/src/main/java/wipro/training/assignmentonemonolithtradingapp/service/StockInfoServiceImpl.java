package wipro.training.assignmentonemonolithtradingapp.service;

import org.springframework.stereotype.Service;
import wipro.training.assignmentonemonolithtradingapp.exceptions.CompanyNotFoundException;
import wipro.training.assignmentonemonolithtradingapp.model.StockInfo;
import wipro.training.assignmentonemonolithtradingapp.repository.StockInfoRepository;

import java.util.List;

@Service
public class StockInfoServiceImpl implements StockInfoService {

    private StockInfoRepository stockInfoRepository;

    public StockInfoServiceImpl(StockInfoRepository stockInfoRepository) {
        this.stockInfoRepository = stockInfoRepository;
    }

    @Override
    public List<StockInfo> get() {
        return stockInfoRepository.findAll();
    }

    @Override
    public StockInfo get(String companyName) {
        return stockInfoRepository
                .findByCompanyName(companyName)
                .orElseThrow(() -> new CompanyNotFoundException(companyName));
    }
}
