package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookApplication {

  @RequestMapping(value = "/narendra")
  public String available() {
    return "Welcome to E-Giants ";
  }

  @RequestMapping(value = "/naveen")
  public String checkedOut() {
    return "Spring Boot- E-Giants -";
  }

  public static void main(String[] args) {
    SpringApplication.run(BookApplication.class, args);
  }
}
