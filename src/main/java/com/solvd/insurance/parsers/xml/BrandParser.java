package com.solvd.insurance.parsers.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.solvd.insurance.models.Brand;

import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BrandParser {
	private final static Logger LOGGER = LogManager.getLogger(BrandParser.class);
	
	public List<Brand> parseBrands(){
		List<Brand> brands = new ArrayList<Brand>();
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	        Document doc = dBuilder.parse(new File("src/main/resources/brands.xml"));
	        doc.getDocumentElement().normalize();
	        LOGGER.info("Root element: "+doc.getDocumentElement().getNodeName());
	        NodeList nodeList = doc.getElementsByTagName("brand");
	        
	        for (int i= 0; i < nodeList.getLength(); i++) {
	        	Node node = nodeList.item(i);
	        	if (node.getNodeType()== Node.ELEMENT_NODE) {
	        		Element element = (Element) node;
	        		Brand tmpBrand = this.getBrandInfo(element);
	        		brands.add(tmpBrand);
	        	}
	        }
		} catch (ParserConfigurationException | IOException | SAXException e) {
			LOGGER.error(e);
		}
		return brands;
	}
	
	public Brand getBrandInfo (Element element) {
		Brand tmpBrand = new Brand();
		tmpBrand.setId(Long.parseLong(element.getAttribute("id")));
		tmpBrand.setDescription(element.getElementsByTagName("description").item(0).getTextContent());		
		return tmpBrand;
	}
}
