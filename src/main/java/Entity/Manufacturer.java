package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Manufacturer {
    public String Type;
    public ManufacturerUl ManufacturerUl;
    public String ManufacturerAl;
    public String ManufacturerFl;
}
