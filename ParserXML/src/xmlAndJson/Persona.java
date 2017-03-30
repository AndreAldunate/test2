package xmlAndJson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona {
	private String name;
	private int age;
	
	public Persona(){
	}
	
	public Persona(String n, int a){
		name = n;
		age = a;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
