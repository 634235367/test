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
    System.out.println("Hello World222222222222222222222222!");
    System.out.println("Hello 3333333333333333333!");
    System.out.println("Hello 44444444444444444444!");

    System.out.println("Hello china zhongguoWorld!");
    System.out.println("He辅导辅导llo chainaWochinarld丰富的辅导辅导费!");
    System.out.println("wwwwwwwwwwwwwwwwwww!");
    System.out.println("的辅导辅导辅导辅导!");
    System.out.println("打发打发大幅度辅导费方法打发打发errreggggrrggfgggg");
     System.out.println("eeeeeeeeeedfdeeedevshitouzukuizhanghsnagmei2dev2dev2dev2dev2dev2szgfdsfdffdfdfdfdev2eeeeeeeee");
     System.out.println("eeeeeeeeeeeeeeeeeee");
     System.out.println("eeeeeeeeeedfdee哈哈哈ede哈哈啊好v2dev2dev2dev2dev2d哈哈发等丰富的非发的丰富的ev2等丰富的非dev2eeeeeeeee");
     System.out.println("eeeeeeeeeeeeedffdfdfdeeeeee");
     System.out.println("eeeeeeeeeeeeee的地方都等丰富的非eeeee");
     System.out.println("eeeeeeeeeedfdfeeeeeeeee");
    System.out.println("dfddfdf!");
    System.out.println("fddfdff!");
    System.out.println("eeeeeeefdfdfeeeeeeeeeeee");
     System.out.println("eeeeedfdfdeeeeedfdee哈哈哈ede哈哈啊好v2dev2dev2dev2dev2d哈哈发等丰富的非发的丰富的ev2等丰富的非dev2eeeeeeeee");
     System.out.println("eeeeedfdfdfdeeeeeeeedffdfdfdeeeeee");
     System.out.println("dfdfdfd");
     System.out.println("eeeeeeedfdfdfdfeeedfdfeeeeeeeee");
  }
}
