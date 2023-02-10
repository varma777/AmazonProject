package AmazonTestPage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Base {

public static List<HashMap<String, String>> Datareader(String filepath) throws IOException {		
String File =FileUtils.readFileToString(new File(filepath), StandardCharsets.UTF_8);			
ObjectMapper mapper = new ObjectMapper();
List<HashMap<String,String>> data = mapper.readValue(File,new TypeReference <List<HashMap<String, String >>>(){});
		  
return data;

	}

}
