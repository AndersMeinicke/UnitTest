import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void GreetingTestOne(){
        System.out.println("Greet a person");
        String actual = new Greetings().greet("bob");
        String expected = "Hello, bob";
        assertEquals(expected, actual);
    }
    @Test
    public void GreetingTestTwo(){
        System.out.println("Greet a person without a name");
        String actual = new Greetings().greet(null);
        String expected = "Hello, friend";
        assertEquals(expected,actual);
    }
    @Test
    public void GreetingTestThree(){
        System.out.println("Greet a person by shouting");
        String actual = new Greetings().greet("JERRY");
        String expected = "HELLO JERRY";
        assertEquals(expected,actual);
    }
    @Test
    public void GreetingTestFour(){
        System.out.println("Greet multiple people");
        String[] people = {"Jill","Jane"};
        String actual = new Greetings().greet(people);
        String expected = "Hello, Jill and Jane.";
        assertEquals(expected,actual);
    }
    @Test
    public void GreetingTestFive(){
        System.out.println("Greet multiple people");
        String[] people = {"Amy","Brian","Charlotte"};
        String actual = new Greetings().greet(people);
        String expected = "Hello, Amy, Brian, and Charlotte.";
        assertEquals(expected,actual);
    }
    @Test
    public void GreetingTestSix(){
        System.out.println("Greet multiple people, some while screaming");
        String[] people = {"Amy","BRIAN","Charlotte"};
        String actual = new Greetings().greet(people);
        String expected = "Hello, Amy and Charlotte. AND HELLO BRIAN!";
        assertEquals(expected,actual);
    }

}
