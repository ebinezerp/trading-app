package wipro.training.assignmentonemonolithtradingapp.model;

import javax.persistence.*;

@Entity
public class StockInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "company_name", nullable = false, unique = true)
    private String companyName;
    @Column(name = "unit_stock_price", nullable = false)
    private Double unitStockPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getUnitStockPrice() {
        return unitStockPrice;
    }

    public void setUnitStockPrice(Double unitStockPrice) {
        this.unitStockPrice = unitStockPrice;
    }

    @Override
    public String toString() {
        return "StockInfo{" + "id=" + id + ", companyName='" + companyName + '\'' + ", unitStockPrice=" + unitStockPrice + '}';
    }
}
