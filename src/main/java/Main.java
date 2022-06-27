import Entity.ResponseFsaType;
import Entity.YAML;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        XmlMapper mapper = new XmlMapper();
        ResponseFsaType responseFsaType = mapper.readValue(new File("src/main/resources/sample.xml"), ResponseFsaType.class);
        System.out.println(responseFsaType);

        YAML yaml = new YAML();
        yaml.setResponseFsaType(responseFsaType);

        ObjectMapper mapper1 = new ObjectMapper(new YAMLFactory());
        mapper1.writeValue(new File("src/main/resources/output.yml"), yaml);
    }
}
