
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;

public class demo1 {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\contact.xml"));
        System.out.println(document);

    }
}
