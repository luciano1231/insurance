package com.solvd.insurance.parsers.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GenericJaxbParser<T> {
	private final static Logger LOGGER = LogManager.getLogger(GenericJaxbParser.class);

	public static <T> T jabxXmlToObject(Class<T> genericClass, String inputFilePath) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(genericClass);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			T object = genericClass.cast(unmarshaller.unmarshal(new File(inputFilePath)));
			return object;
		} catch (JAXBException e) {
			LOGGER.error(e);
		}
		return null;
	}

	public static <T> void jabxObjectToXml(Class<T> genericClass, T t, String outputFilePath) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(genericClass);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // output format with linefeeds and
																					// indentation
			marshaller.marshal(t, new File(outputFilePath));
		} catch (JAXBException e) {
			LOGGER.error(e);
		}
	}
}
