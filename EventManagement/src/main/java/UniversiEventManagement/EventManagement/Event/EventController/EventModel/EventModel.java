package UniversiEventManagement.EventManagement.Event.EventController.EventModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EventModel {
    @Id
    private Integer eventid;
    private Event eventName;
    private String locationOfEvent;
    private LocalDate date;
    private LocalDateTime starttime;
    private LocalDateTime endtime;
}
