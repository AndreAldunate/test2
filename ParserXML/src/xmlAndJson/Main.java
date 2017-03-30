package xmlAndJson;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {
	public static void main(String[] args) throws JAXBException {
		Persona p = new Persona("Pepe", 20);
		//CREAR XML
		JAXBContext  context = JAXBContext.newInstance(Persona.class); 
		Marshaller marshall = context.createMarshaller();
		marshall.marshal(p, new File("pepe.xml"));
		// LEER XML
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Persona unmarshalled = (Persona) unmarshaller.unmarshal(new File("pepe.xml"));
		System.out.println(unmarshalled);
		
		
	}
}
