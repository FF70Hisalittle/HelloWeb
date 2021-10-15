package pers.niaonao.crudproject.test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping("/hello")
    public String TestController(){
        return "Helloworld Spring Boot!";
    }
}

