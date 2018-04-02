package nc.receive;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Test {
  public static void main(String[] args) throws JAXBException {  
            //创建一个班级  
            Classes classes = new Classes();  
            classes.setClassid("045");  
            classes.setDesc("重点班");  
              
            //创建学生  
            for(int i=0;i<5;i++){  
               Student s = new Student();  
                s.setStudentid(String.valueOf(20140+i));  
                s.setName("学生"+i);  
                s.setAddress("地址"+i);  
                s.setBirthday("生日"+i);  
                classes.addStudent(s);  
            }  
              
            //创建一个class.xml  
            File xml = new File("class.xml");         
            JAXBContext context = JAXBContext.newInstance(Classes.class);  
            Marshaller marshaller = context.createMarshaller();  
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);  
            marshaller.marshal(classes, xml);  
              
            Unmarshaller unmarshaller = context.createUnmarshaller();  
            Classes unclasses = (Classes) unmarshaller.unmarshal(xml);  
            System.out.println(unclasses);  

  }
}
