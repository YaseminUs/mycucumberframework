package utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configurations {
    public static String getproperties(String key) throws IOException {
        // specify the needed file
        File credsfFile = new File("src/test/resources/conf/Configuration.properties");
        // read from a file
        FileReader filereader = new FileReader(credsfFile);
        Properties properties = new Properties();
        properties.load(filereader);
//        String login = properties.getProperty("login");
//        System.out.println("my login from properties file is: " + login);
//        String url = properties.getProperty("https://google.com");
//        System.out.println("my login from properties file is: " + url);
//        String password = properties.getProperty("techtorialpassword");
//        System.out.println("my login from properties file is: " + password);
//        System.out.println(properties.stringPropertyNames());
        String value = properties.getProperty(key);
        return value;

    }
}


