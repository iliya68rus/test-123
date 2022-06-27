package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ManufacturerUl {
    public String OrganForm;
    public String FullName;
    public Address Address;
    public String AddressActual;
    public String Phone;
    public String Fax;
    public String Email;
    public String Organ;
    public String Date;
    public String Ogrn;
    public String Inn;
}
