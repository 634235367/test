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
    System.out.println("He辅导辅导llo chainaWochinarld丰富的辅导辅导费!");
    System.out.println("wwwwwwwwwwwwwwwwwww!");
    System.out.println("Hdddddnindfffdddddd!");
    System.out.println("eeeeeeeeeeeeeeeeeee");
     System.out.println("eeeeeeeeeedfdee哈哈哈ede哈哈啊好v2dev2dev2dev2dev2d哈哈发等丰富的非发的丰富的ev2等丰富的非dev2eeeeeeeee");
     System.out.println("eeeeeeeeeeeeedffdfdfdeeeeee");
     System.out.println("eeeeeeeeeeeeee的地方都等丰富的非eeeee");
     System.out.println("eeeeeeeeeedfdfeeeeeeeee");
  }
}
