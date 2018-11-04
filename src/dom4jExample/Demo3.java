import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\contact.xml"));
        Element conElement = document.getRootElement().element("contact");
        String s=conElement.attributeValue("id");
        System.out.println(s);
        Element conElem2=document.getRootElement().elements().get(1);
        System.out.println(conElem2.attributeValue("id"));
        Attribute id = conElem2.attribute("id");
        System.out.println(id.getName()+"="+id.getValue());
        List<Attribute> attributes = conElem2.attributes();
        for (Attribute a: attributes
             ) {
            System.out.println(a.getName());         }


    }
}
