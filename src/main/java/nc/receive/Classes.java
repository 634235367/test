package nc.receive;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Classes {  
      
    private String classid;  
      
    private String desc;  
      
    private List<Student> students = new ArrayList<Student>();  
    @XmlAttribute  
    public String getClassid() {  
        return classid;  
    }  
    public void setClassid(String classid) {         
      this.classid = classid;  
    }  
    @XmlElement  
    public String getDesc() {  
        return desc;  
    }  
    public void setDesc(String desc) {  
        this.desc = desc;  
    }  
    @XmlElementWrapper(name="students")  
    @XmlElement(name="student")  
    public List<Student> getStudents() {  
        return students;  
    }  
    public void setStudents(List<Student> students) {  
        this.students = students;  
    }  
    public void addStudent(Student s){  
        students.add(s);  
    }  
}  
