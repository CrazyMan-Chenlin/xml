import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class demo2 {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\contact.xml"));
        Element rootEle=document.getRootElement();
        System.out.println(rootEle.getName());
        Element conElem=rootEle.element("contact");
        System.out.println(conElem.getName());
        List<Element> elements = rootEle.elements();
        Iterator<Element> it=elements.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Element nameElem=rootEle.element("contact").element("name");
        System.out.println(nameElem.getName());
    }
}
