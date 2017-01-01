package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    List<String> strList;
	
	public int countWords(String words){
		String[] wordsSplit = StringUtils.split(words, ' ');
		return (wordsSplit == null)? 0 : wordsSplit.length;
	}
	
	public void greet(){
		System.out.println ("Inside greet..");
	}
	
    public Application() {
        System.out.println ("Inside Application");
		strList = new ArrayList<>();
		strList.add("Hello");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords("Hello There");
		System.out.println("Application words : "+count);
    }
	
	
}