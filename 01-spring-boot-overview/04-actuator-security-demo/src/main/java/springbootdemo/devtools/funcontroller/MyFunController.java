package springbootdemo.devtools.funcontroller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFunController{


    @Value("${coach.name}")
    private String teamName;
    @Value("${team.name}")
    private String coachName;
    @Value("${abc.xyz}")
    private String randomValue;

    @GetMapping("/")
    public String getHello(){
        return "Hello World!!!";
    }

    @GetMapping("/workout")
    public String getWorkOut(){
        return "Do a hard workout to live a healthy life";
    }
    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is  lucky day";

    }
    @GetMapping("/team")
    public String getTeamName(){
       return "Coach Name: "+coachName+" ,Team Name: "+teamName+", Random Value: "+randomValue;
    }
}
