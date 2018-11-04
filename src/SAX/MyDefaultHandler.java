package SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyDefaultHandler extends DefaultHandler {
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("MyDefaultHandler.startElement->"+qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("MyDefaultHandler.endElement->"+qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       String content=new String(ch,start,length);
        System.out.println("MyDefaultHandler.characters->"+content);
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("MyDefaultHandler.startDocument->");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("MyDefaultHandler.endDocument");
    }
}
