package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CertificationOrgan {
    public String FullName;
    public String Number;
    public String DateReg;
    public String Organ;
    public String Head;
    public String AddressLegal;
    public String Address;
    public String Phone;
    public String Fax;
    public String Email;
    public String Ogrn;
    public Experts Experts;
}
