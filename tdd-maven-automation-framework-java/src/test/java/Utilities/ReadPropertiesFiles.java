package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFiles {

    public String readProperties(String propertyName) throws IOException {
        FileReader fileReader = new FileReader("src/test/resources/config.properties");
        Properties properties = new Properties();
        properties.load(fileReader);
        return properties.getProperty(propertyName);
    }

}
