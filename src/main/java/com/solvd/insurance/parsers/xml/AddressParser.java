package com.solvd.insurance.parsers.xml;

import com.solvd.insurance.models.Address;
import com.solvd.insurance.models.Cities;
import com.solvd.insurance.models.Country;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AddressParser {
	private final static Logger LOGGER = LogManager.getLogger(AddressParser.class);

	public List<Address> parseAddresss () {
		List <Address> addresses = new ArrayList<Address>();
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	        Document doc = dBuilder.parse(new File("src/main/resources/address.xml"));
	        doc.getDocumentElement().normalize();
	        LOGGER.info("Root element: "+doc.getDocumentElement().getNodeName());
	        NodeList nodeList = doc.getElementsByTagName("address");
	        
	        for (int i = 0; i < nodeList.getLength(); i++ ) {
	        	Node node = nodeList.item(i);
	        	if (node.getNodeType() == Node.ELEMENT_NODE) {
	        		Element element = (Element) node;
	        		Address auxad =this.getAddressInfo(element);	        		
	        		NodeList aCity = element.getElementsByTagName("position");
	        		Node nodeAdCity = aCity.item(0);
	        		Element elementAdCity = (Element) nodeAdCity;
	        		if (aCity.getLength() > 0) {
	        			auxad.setCities(this.getCityInfo(elementAdCity));
	        		}
	        		addresses.add(auxad);		
	        	}
	        }

		} catch (ParserConfigurationException | IOException | SAXException e) {
			 LOGGER.error(e);
		}
		return addresses;
	}
	
	public Address getAddressInfo (Element element) {
		Address auxad = new Address();
		auxad.setId(Long.parseLong(element.getAttribute("id")));
		auxad.setStreet(element.getElementsByTagName("street").item(0).getTextContent());
		auxad.setNumber(element.getElementsByTagName("number").item(0).getTextContent());
		return auxad;
	}
	
	public Cities getCityInfo (Element elementAdCity) {
		Cities auxadCity = new Cities();
		auxadCity.setId(Long.parseLong(elementAdCity.getAttribute("id")));
		auxadCity.setName(elementAdCity.getElementsByTagName("name").item(0).getTextContent());
		return auxadCity;
	}
}
