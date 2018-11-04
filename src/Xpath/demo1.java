package Xpath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import java.util.List;
public class demo1 {
    public static void main(String[] args) throws DocumentException {
        Document doc=new SAXReader().read("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\contact.xml");
        String xpath="";
        xpath="/contact-list";
        xpath="/contact-list/contact";
        xpath="//contact";
        xpath="//contact/name";
        xpath="/contact-list/*";
        xpath="/contact-list//*";
        xpath="//contact[1]";//选择第一个contact
        xpath="//contact[last()]";
        xpath="//@id";
        xpath="//contact[@id]";
        xpath="//contact[@id='002']";
        xpath="//contact[@id='002'and @name='chenlin']";
        xpath="//name[1]/text()";//[1] 1代表contact里第一个name
        xpath="//contact[@id='001']/name/text()";
        xpath="//name[text()='李四']";
        List<Node> list=doc.selectNodes(xpath);
        for (Node node:list){
            System.out.println(node);
        }
    }
}
