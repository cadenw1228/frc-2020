//package praser;
import java.io.IOException;
import java.util.Iterator;
import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class parser{

      public static void main(String [] args){
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            try{
                  DocumentBuilder builder = factory.newDocumentBuilder();
                  Document doc = builder.parse("parserxml.xml");
                  doc.getElementsByTagName("idk");
            }catch(ParserConfigurationException | SAXException | IOException e){
                  e.printStackTrace();
            }


      }

}
