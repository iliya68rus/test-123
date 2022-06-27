package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    public String DeclareType;
    public String DcOriginType;
    public String Name;
    public String ProductInfo;
    public String Okp;
    public String OkpdText;
    public String Standart;
    public String SizeNumber;
    public String DetailsShippingDocumentation;
    public String ContractInfo;
    public String Info;
    public String PlaceMark;
    transient TechRegs TechRegs;
}
