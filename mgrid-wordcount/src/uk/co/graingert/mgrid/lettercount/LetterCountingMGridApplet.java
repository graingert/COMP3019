package uk.co.graingert.mgrid.lettercount;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import mgridapplet.MGridApplet;
public class LetterCountingMGridApplet extends MGridApplet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6119217355265008276L;

	@Override
	public void initApplet(int parameterNum, String parameter) {
		InputStream in = getClass().getResourceAsStream("textfile.txt");
		try {
			String textfile = IOUtils.toString(in, "UTF-8");
			int count = StringUtils.countMatches(textfile, parameter);
			submitResults(Integer.toString(count));
		} catch (IOException e) {
			submitException(e);
		}
	}
	
	public static void main(String[] args){
		LetterCountingMGridApplet lcmda = new LetterCountingMGridApplet();
		lcmda.init();
		lcmda.start();
	}
}
