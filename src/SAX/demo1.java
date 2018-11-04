package SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParser parser= SAXParserFactory.newInstance().newSAXParser();
        parser.parse(new File("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\contact.xml"),new MyDefaultHandler());

    }
}
