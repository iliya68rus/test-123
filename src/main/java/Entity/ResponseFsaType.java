package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseFsaType {
    public RdcTr RdcTr;
}
