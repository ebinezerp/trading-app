package wipro.training.assignmentonemonolithtradingapp.service;

import wipro.training.assignmentonemonolithtradingapp.model.StockInfo;

import java.util.List;

public interface StockInfoService {
    public List<StockInfo> get();
    public StockInfo get(String companyName);
}
