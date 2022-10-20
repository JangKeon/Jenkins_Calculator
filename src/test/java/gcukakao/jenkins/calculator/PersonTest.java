package gcukakao.jenkins.calculator; 
import org.junit.Test;

import gcukakao.jenkins.calculator.Person;

import static org.junit.Assert.assertEquals; 
 
public class PersonTest { 
     private Person person = new Person(); 
 
     // @Test 
     // public void testSum() { 
     //      assertEquals(5, calculator.sum(2, 3)); 
     // } 

     @Test
     public void testRegister() {
          assertEquals("JangKeon", person.register("Jang Keon"));
     }
} 
