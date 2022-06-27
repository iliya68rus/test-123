package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseDeclaration {
    public String Documents;
    public String Schema;
    public Base Base;
    public Laboratory Laboratory;
}
