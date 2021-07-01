package wipro.training.assignmentonemonolithtradingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import wipro.training.assignmentonemonolithtradingapp.service.StockInfoService;

@Controller
public class HomeController {

    private StockInfoService stockInfoService;

    public HomeController(StockInfoService stockInfoService) {
        this.stockInfoService = stockInfoService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("stockInfos", stockInfoService.get());
        return "home";
    }

}
