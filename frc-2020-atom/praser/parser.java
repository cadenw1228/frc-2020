import java.util.Scanner;
import java.io.IOException;
import java.util.Iterator;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.File;
import org.w3c.dom.Node;
import java.util.*;
public class parser{

      public static void main(String [] args){
            // new factory dont know hat it is but needed
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            //user input bs
            String userInput;
            Scanner obj = new Scanner(System.in);
            System.out.print("bitch");
            try{
                  //dont know but needed
                  DocumentBuilder builder = factory.newDocumentBuilder();
                  //grabs file either can be relative or direct(mine is direct)
                  File file = new File("C:/Users/caden/Desktop/frc-2020-atom/praser/JRE_System_Lib/parserxml.xml");
                  //looks at file
                  Document doc = builder.parse(file);
                  //dont know agian but need
                  doc.getDocumentElement().normalize();
                  //idk
                  //String tagName = doc.getDocumentElement().getNodeName();
                  //grabs a list of nodes like <food> and puts in list
                  NodeList idkList; //= doc.getElementsByTagName("food");
                  //more user input bs
                  System.out.print("what type of whafles do you want\n");
                  userInput = obj.nextLine();
                  //System.out.print(userInput);
                  for(Node myNode : idkList(doc.getElementsByTagName("food"))){
                        System.out.print(myNode.getTextContent);
                        Node nNode = idkList.item(i);
                              //still dont know
                              Element eElement = (Element) nNode;
                              //grab node <name> and checks its text contents ex:Strawberry Belgian Waffles
                              String nameCheck = eElement.getElementsByTagName("name").item(0).getTextContent();
                              //node name of Element like <name> or <price>
                              //String nodeName = eElement.getNodeName();
                              //System.out.print(nodeName);

                              if(nameCheck.equals(userInput)){
                                    //grabs all chils nodes(ex:name,price...) under Element node(food)
                                    NodeList userList = eElement.getChildNodes();
                                    //testing reasons dont know if method still works
                                    //grabs all nodes useing for loop and prints them
                                    //System.out.print(userList.getLength());
                                    //System.out.print(idkList.getLenght());
                                    for(int j = 0;j < userList.getLength()/idkList.getLength();j++){
                                          //agian grab spefic node, show text, print, rinse and reapet
                                          //Node nNode2 = userList.item(j);
                                          String textContent = nNode.getTextContent();
                                          System.out.print(textContent);
                                    }
                              }else{
                                    //System.out.print("0\n");
                              }

                              /*
                              System.out.println("Staff id : " + eElement.getAttribute("id"));
			            System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
			            System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
			            System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
			            System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
            			//System.out.println("Staff id : " + eElement.getAttribute("to"));
                              */
                        //}
                  }

                  //because java hates us
            }catch(ParserConfigurationException e){
                  e.printStackTrace();
            }catch(SAXException e){
                  e.printStackTrace();
            }catch(IOException e){
                  e.printStackTrace();
            }catch(NullPointerException e){
                  e.printStackTrace();
            }


      }

}
