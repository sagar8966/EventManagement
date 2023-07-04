package UniversiEventManagement.EventManagement.Event.EventController;

import UniversiEventManagement.EventManagement.Event.EventController.EventModel.Event;
import UniversiEventManagement.EventManagement.Event.EventController.EventModel.EventModel;
import UniversiEventManagement.EventManagement.Event.EventController.EventService.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventservice;

    @PostMapping("Events")
    public String addevents(@RequestBody List<EventModel> event){
        return eventservice.addevents(event);
    }
    @PutMapping("updateevent/{id}")
    public String updateevent(@PathVariable Integer id, @PathVariable Event event) {
        return eventservice.updateevent(id,event);
    }
    @DeleteMapping("removeevent/{id}")
    public String removeevent(@PathVariable Integer id) {
        return eventservice.removeevent(id);

    }
     @GetMapping("eventbydate")
    public String geteventbydate(){
        return eventservice.geteventbydate();
     }


}

