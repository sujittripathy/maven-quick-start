package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    List<String> strList;
    public Application() {
        System.out.println ("Inside Application");
		strList = new ArrayList<>();
		strList.add("Hello");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	System.out.println(strList);
    }
}