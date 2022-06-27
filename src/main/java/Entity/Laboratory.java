package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Laboratory {
    public String NumberReg;
    public String Name;
    public String DateReg;
    public String DateExpiry;
    public Document Document;
    public Info Info;
}
