package SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyDefaultHandler2 extends DefaultHandler {
     private  StringBuffer strbuff=new StringBuffer();
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        strbuff.append("<"+qName);
        if(attributes!=null){
            for (int i = 0; i <attributes.getLength(); i++) {
                strbuff.append(""+attributes.getQName(i)+"="+"\""+attributes.getValue(i)+"\"");
            }
        }
        strbuff.append(">");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        strbuff.append("</"+qName+">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        strbuff.append(new String(ch,start,length));
    }

    public StringBuffer getStrbuff() {
        return strbuff;
    }
}
