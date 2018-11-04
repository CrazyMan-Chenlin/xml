package SAX;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class demo3 {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        SAXParser parser= SAXParserFactory.newInstance().newSAXParser();
        MyDefaultHandler3 dh3=new MyDefaultHandler3();
        parser.parse(new File("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\contact.xml"),dh3);
        List<Contact> conList=dh3.getConList();
        for (Contact con: conList
             ) {
            System.out.println(con.toString());
        }
    }
}
