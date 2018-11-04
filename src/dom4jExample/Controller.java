package dom4jExample;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Controller {
    public void addContact(Model m) throws IOException, DocumentException {
        File file=new File("../contact5.xml");
        if(file.exists()){
            Document doc=XMLUtil.getDocuemnt();
            Element rootlement = doc.getRootElement();
            Element conelement=rootlement.addElement("contact");
            conelement.addAttribute("id",m.getId());
            conelement.addElement("name").setText(m.getName());
            conelement.addElement("gender").setText(m.getGender());
            conelement.addElement("phone").setText(m.getPhone());
            conelement.addElement("email").setText(m.getEmail());
            conelement.addElement("address").setText(m.getAddress());
            XMLUtil.writeDocument(doc);
        }else {
            Document doc= DocumentHelper.createDocument();//定义一个文档对象
            Element element = doc.addElement("contact-list");
            Element conelement=element.addElement("contact");
            conelement.addAttribute("id",m.getId());
            conelement.addElement("name").setText(m.getName());
            conelement.addElement("gender").setText(m.getGender());
            conelement.addElement("phone").setText(m.getPhone());
            conelement.addElement("email").setText(m.getEmail());
            conelement.addElement("address").setText(m.getAddress());
            XMLUtil.writeDocument(doc);
        }

    }
    public void updateContact(int i,Model m) throws DocumentException, IOException {
        Document doc=XMLUtil.getDocuemnt();
        Element conElement = doc.getRootElement().elements("contact").get(i-1);
        Attribute id = conElement.attribute("id");
        id.setValue(m.getId());
        Element name = conElement.element("name");
        name.setText(m.getName());
        Element gender = conElement.element("gender");
        gender.setText(m.getGender());
        Element phone = conElement.element("phone");
       phone.setText(m.getPhone());
        Element email = conElement.element("email");
        email.setText(m.getEmail());
        Element address = conElement.element("address");
        address.setText(m.getAddress());
        XMLUtil.writeDocument(doc);
    }
    public void delteContact(int i) throws DocumentException, IOException {
        Document doc=XMLUtil.getDocuemnt();
        Element conElement = doc.getRootElement().elements("contact").get(i-1);
        conElement.detach();
        XMLUtil.writeDocument(doc);
    }
    public void selectContact() throws DocumentException {
        Document doc=XMLUtil.getDocuemnt();
        List<Model> list=new ArrayList();
        List<Element> elelist=doc.getRootElement().elements("contact");
        for (Element e: elelist
             ) {
            Model m=new Model();
            m.setId(e.attribute("id").getValue());
            m.setName(e.elementText("name"));
            m.setGender(e.elementText("gender"));
            m.setPhone(e.elementText("phone"));
            m.setAddress(e.elementText("address"));
            m.setEmail(e.elementText("email"));
            list.add(m);
        }
        for (Model m: list
             ) {
            System.out.println(m.toString());
        }

    }
}
