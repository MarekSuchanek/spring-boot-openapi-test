package cloud.suchanek.sb.openapi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping(path = "")
    public String helloWorld() {
        return "Hello, world!";
    }

    @GetMapping(path = "**")
    public String genericPath(HttpServletRequest request) {
        return String.format("You requested: %s", request.getRequestURI());
    }
}
