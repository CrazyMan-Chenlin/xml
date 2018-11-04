package Xpath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Demo3 {
    public static void main(String[] args) throws DocumentException {
        Document doc = new SAXReader().read("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\personList.html");
        String xpath="//th";
        List<Node> list=doc.selectNodes(xpath);
        for (Node n : list){
            System.out.print(n.getText()+"\t\t");
        }
        System.out.println();
        xpath="//tbody/tr";
        List<Node> trlist=doc.selectNodes(xpath);
        for (Node n: trlist
             ) {
            Element trElem=(Element) n;
            List<Element> tdElementList=trElem.elements("td");
            for (Element e: tdElementList
                 ) {
                System.out.print(e.getText()+"\t\t");
            }
            System.out.println();
        }
    }
}
