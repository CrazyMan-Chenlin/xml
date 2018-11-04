package SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class MyDefaultHandler3 extends DefaultHandler{
   private List<Contact> conList=new ArrayList();
   private  Contact con=null;
   private  String preTag;
    public List<Contact> getConList() {
        return conList;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("contact")) {
            con = new Contact();
            String id=attributes.getValue("id");
           con.setId(id);
        }
        preTag=qName;
    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("contact")){
            conList.add(con);
        }
        preTag=null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       String content=new String(ch,start,length);
       if ("name".equals(preTag)){
        con.setName(content); }
        if ("gender".equals(preTag)){
        con.setGender(content);}
        if ("email".equals(preTag)){
        con.setEmail(content);}
        if ("address".equals(preTag)) {
            con.setPhone(content);
        }
    }
}
