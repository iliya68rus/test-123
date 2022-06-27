package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicantUl {
    public String OrganForm;
    public String FullName;
    public String ShortName;
    public String Head;
    public String HeadPost;
    public String HeadText;
    public Address Address;
    public String AddressActual;
    public String Phone;
    public String Fax;
    public String Email;
    public String Organ;
    public String Date;
    public String Ogrn;
    public String Inn;
    public String RegInfo;
    public String Contract;
}
