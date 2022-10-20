package gcukakao.jenkins.calculator; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController; 
 
@RestController 
class PersonController { 
     @Autowired 
     private Person person; 
 
     // @RequestMapping("/sum") 
     // String sum(@RequestParam("a") Integer a,  
     //            @RequestParam("b") Integer b) { 
     //      return String.valueOf(calculator.sum(a, b)); 
     // } 
     
     @RequestMapping("/register") 
     String register(@RequestParam("a") String a) { 
          return String.valueOf(person.register(a)); 
     } 


} 
