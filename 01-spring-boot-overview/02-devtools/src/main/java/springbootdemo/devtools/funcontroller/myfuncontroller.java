package springbootdemo.devtools.funcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myfuncontroller {
    
    
    @GetMapping("/")
    public String getHello(){
        return "Hello World!!!";
    }

    @GetMapping("/workout")
    public String getWorkOut(){
        return "Do a hard workout to live a healthy life";
    }  @GetMapping("/fortune")
    public String getFortune(){
        return "Today is your lucky day";
    }
}
