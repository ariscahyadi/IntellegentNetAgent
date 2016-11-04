package intelligent.net.agent;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SendStatus {

	public static void writeToFile(String status, String event) {
		   {	
		    	try{
		    		String AgentName = "Agent0";
		    		String AgentID = "0";
		    		File file =new File("status.log");
		    		
		    		//if file doesnt exists, then create it
		    		if(!file.exists()){
		    			file.createNewFile();
		    		}
		    		
		    		//true = append file
		    		FileWriter fileWritter = new FileWriter(file.getName(),true);
		    	        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
		    	        bufferWritter.write(AgentID + "," + AgentName + "," + status + ",\"" + event + "\"");
		    	        bufferWritter.newLine();
		    	        bufferWritter.close();
		    	    
		    	}catch(IOException e){
		    		e.printStackTrace();
		    	}
		    }
	}
}