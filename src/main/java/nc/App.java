  package nc;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@SpringBootApplication
public class App {
  
  @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath("nc");
    return marshaller;
  }
  
  public static void main(String[] args) {
    System.out.println("Hello World!");


    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");


    System.out.println("wwwwwwwwwwwwwwwwwww!");
    System.out.println("Hdddddddddd!");
    System.out.println("eeeeeeeeeeeeeeeeeee");
     System.out.println("eeeeeeeeeeeeeeeeeee");
     System.out.println("eeeeeeeeeeeeeeeeeee");
     System.out.println("eeeeeeeeeeeeeeeeeee");
     System.out.println("eeeeeeeeeeeeeeeeeee");
     System.out.println("wwwwwwwwwwwww");
      System.out.println("ddddddddddwwwqqq");
   
  }
}
