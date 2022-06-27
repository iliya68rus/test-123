package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Requisites {
    public String Status;
    public String Section;
    public String Number;
    public String DateReg;
    public String DateExpiry;
    public NoExpiry NoExpiry;
    public BaseDeclaration BaseDeclaration;
    public Discontinued Discontinued;
}
