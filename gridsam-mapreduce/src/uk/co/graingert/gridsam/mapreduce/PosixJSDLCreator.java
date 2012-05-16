package uk.co.graingert.gridsam.mapreduce;
import static org.joox.JOOX.$;


import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;


public class PosixJSDLCreator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(createJSDLDescription("foo", "foo", "foo"));
	}

	
	public static String createJSDLDescription(String execName, String args, String ftpServer) {
		String s_jsdl = "";
		try {
			InputStream in = PosixJSDLCreator.class.getResourceAsStream("posix.jsdl");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db;
			db = dbf.newDocumentBuilder();
			Document jsdl = db.parse(in);
			
			$(jsdl).find("#execName").text(execName);
			$(jsdl).find("#args").text(args);
			$(jsdl).find("URI.ftp").text(ftpServer);
			
		    DOMImplementationLS domImplementation = (DOMImplementationLS) jsdl.getImplementation();
		    LSSerializer lsSerializer = domImplementation.createLSSerializer();
		    s_jsdl = lsSerializer.writeToString(jsdl); 

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s_jsdl;
	}
}
