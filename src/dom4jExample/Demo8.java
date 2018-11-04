import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;

public class Demo8 {
    public static void main(String[] args) throws IOException, DocumentException {
        //添加
       /* Document doc=DocumentHelper.createDocument();
        Element element = doc.addElement("contact-list");
        Element conelement=element.addElement("contact");
        conelement.addElement("name").addText("chenlin");
        conelement.addElement("gender").addText("男");
        conelement.addAttribute("id","001");*/
        SAXReader reader = new SAXReader();
        Document doc = reader.read(new File("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\contact.xml"));
        Element conElement = doc.getRootElement().element("contact");
        Attribute atrrid = conElement.attribute("id");
        atrrid.detach();
        /*conElement.detach();*/
        conElement.getParent().remove(conElement);
        //修改文本
        /*Attribute id = conElement.attribute("id");
        id.setValue("002");
        Element name = conElement.element("name");
        name.setText("chenlin");*/
        OutputStream out=new FileOutputStream("../contact4.xml" );
        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter writer=new XMLWriter(out,format);
        writer.write(doc);
    }
}
