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
    System.out.println("dfddfdf!");
    System.out.println("fddfdff!");
    System.out.println("eeeeeeefdfdfeeeeeeeeeeee");
     System.out.println("eeeeedfdfdeeeeedfdee哈哈哈ede哈哈啊好v2dev2dev2dev2dev2d哈哈发等丰富的非发的丰富的ev2等丰富的非dev2eeeeeeeee");
     System.out.println("eeeeedfdfdfdeeeeeeeedffdfdfdeeeeee");
     System.out.println("dfdfdfd");
     System.out.println("eeeeeeedfdfdfdfeeedfdfeeeeeeeee");
  }
}
