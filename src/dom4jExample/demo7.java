package  dom4jExample;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;

public class demo7 {
    public static void main(String[] args) throws DocumentException, IOException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\contact.xml"));
        OutputStream out=new FileOutputStream("C:\\Users\\chenlin\\");//
        OutputFormat outputFormat=OutputFormat.createPrettyPrint();//
        OutputFormat outputFormat1=OutputFormat.createCompactFormat();//
        outputFormat.setEncoding("utf-8");
        XMLWriter writer = new XMLWriter(out,outputFormat);
        writer.write(document);
        writer.close();
    }
}
