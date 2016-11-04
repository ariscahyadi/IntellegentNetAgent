package intelligent.net.agent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class LogReader {
	
	public static String[] FileReader () throws IOException {
		
		Reader fileReader = new FileReader("quagga.log");
        BufferedReader input = new BufferedReader(fileReader);
        
        List<String> lines = new ArrayList<String>();
       
        try {
        
        	String line = null;
        	while ((line = input.readLine()) != null ) {
        		lines.add(line);
        	}
        	
        	String[] arr = lines.toArray(new String[lines.size()]);
        	return arr;
        } finally {
        	input.close();
        }
	}
}
