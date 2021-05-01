package cloud.suchanek.sb.openapi.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.springdoc.core.Constants.CLASSPATH_RESOURCE_LOCATION;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Setting order fixes /swagger-ui/index.html but breaks everything else
        registry
        //        .setOrder(Integer.MIN_VALUE + 1)
                .addResourceHandler("/webjars/**")
                .addResourceLocations(CLASSPATH_RESOURCE_LOCATION + "/webjars/");
    }
}
