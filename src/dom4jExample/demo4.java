import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

public class demo4 {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\contact.xml"));
        Element nameElement = document.getRootElement().element("contact").element("name");
        String s=nameElement.getText();
        System.out.println(s);
        Element conElem=document.getRootElement().element("contact");
        System.out.println(conElem.getText());
    }
}
