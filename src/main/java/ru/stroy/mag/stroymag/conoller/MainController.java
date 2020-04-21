package ru.stroy.mag.stroymag.conoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MainController {


    @GetMapping("/home")
    private String home() {
        return "index";
    }

    @GetMapping("/")
    private void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("/home");
    }

}
