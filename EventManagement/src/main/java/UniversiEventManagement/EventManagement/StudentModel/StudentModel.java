package UniversiEventManagement.EventManagement.StudentModel;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Enumeration;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StudentModel {

    @Id
    private Integer studentid;
    private String firstname;
    private String lastname;

    @Min(18)
    @Max(25)
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Depeartment department;
}
