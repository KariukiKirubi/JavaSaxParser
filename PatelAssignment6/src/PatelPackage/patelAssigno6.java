package PatelPackage;



import patelAssign6.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class patelAssigno6 extends DefaultHandler {

       private LegoSet legoset;
       private String temp;
       private ArrayList<LegoSet> legsetList = new ArrayList<LegoSet>();

       /** The main method sets things up for parsing */
       public static void main(String[] args) throws IOException, SAXException,
                     ParserConfigurationException {
             
              //Create a "parser factory" for creating SAX parsers
              SAXParserFactory spfac = SAXParserFactory.newInstance();

              //Now use the parser factory to create a SAXParser object
              SAXParser sp = spfac.newSAXParser();

              //Create an instance of this class; it defines all the handler methods
              patelAssigno6 handler = new patelAssigno6();

              //Finally, tell the parser to parse the input and notify the handler
              sp.parse("legoSets.xml", handler);
             
              handler.readList();

       }


       /*
        * When the parser encounters plain text (not XML elements),
        * it calls(this method, which accumulates them in a string buffer
        */
       public void characters(char[] buffer, int start, int length) {
              temp = new String(buffer, start, length);
       }
      

       /*
        * Every time the parser encounters the beginning of a new element,
        * it calls this method, which resets the string buffer
        */ 
       public void startElement(String uri, String localName,
                     String qName, Attributes attributes) throws SAXException {
              temp = "";
              if (qName.equalsIgnoreCase("set")) {
                     legoset = new LegoSet();
                  //   legoset.setsetNum(attributes.getValue("set-num"));

              }
       }

       /*
        * When the parser encounters the end of an element, it calls this method
        */
       public void endElement(String uri, String localName, String qName)
                     throws SAXException {

              if (qName.equalsIgnoreCase("set")) {
                     // add it to the list
                     legsetList.add(legoset);

              } else if (qName.equalsIgnoreCase("name")) {
                     legoset.setName(temp);
              } else if (qName.equalsIgnoreCase("set-num")) {
                     legoset.setsetNum(temp);
              }

       }

       private void readList() {
              System.out.println("No of  the LegoSet in bank '" + legsetList.size()  + "'.");
              Iterator<LegoSet> it = legsetList.iterator();
              while (it.hasNext()) {
                    System.out.println(it.next().toString());
              }
       }
      
}

