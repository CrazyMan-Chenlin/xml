import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;

public class demo6 {
    public static void main(String[] args) throws IOException, DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\contact.xml"));
        OutputStream out=new FileOutputStream("../contact1.xml");//拷贝数据最好用字节
        XMLWriter writer = new XMLWriter( out);
    }
}
