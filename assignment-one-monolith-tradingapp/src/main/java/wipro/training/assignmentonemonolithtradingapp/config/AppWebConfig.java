package wipro.training.assignmentonemonolithtradingapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class AppWebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                        "/css/**",
                        "/js/**")
                .addResourceLocations(
                        "classpath:/static/bootstrap/dist/css/",
                        "classpath:/static/bootstrap/dist/js/");

    }
}
