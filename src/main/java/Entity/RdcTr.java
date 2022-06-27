package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RdcTr {
    public String Type;
    public Requisites Requisites;
    public Applicant Applicant;
    public ApplicantUl ApplicantUl;
    public String ApplicantFl;
    public String ApplicantAl;
    public String ApplicantAu;
    public Manufacturer Manufacturer;
    public Product Product;
    public String DeclareAddInfo;
    public CertificationOrgan CertificationOrgan;
}
