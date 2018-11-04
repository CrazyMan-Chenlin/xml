package dom4jExample;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo5 {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\contact.xml"));
        List<Contact> list=new ArrayList();
        List<Element> conlist=document.getRootElement().elements("contact");
        for (Element e:conlist
             ) {
            Contact c=new Contact();
            c.setId(e.attributeValue("id"));
            c.setName(e.elementText("name"));
            c.setGender(e.elementText("gender"));
            c.setPhone(e.elementText("phone"));
            c.setAddress(e.elementText("address"));
            c.setEmail(e.elementText("email"));
            list.add(c);
        }
        Iterator<Contact> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}
