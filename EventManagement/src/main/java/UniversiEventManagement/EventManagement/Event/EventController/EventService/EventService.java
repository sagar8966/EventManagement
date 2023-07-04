package UniversiEventManagement.EventManagement.Event.EventController.EventService;

import UniversiEventManagement.EventManagement.Event.EventController.EventModel.Event;
import UniversiEventManagement.EventManagement.Event.EventController.EventModel.EventModel;
import UniversiEventManagement.EventManagement.Event.EventController.EventRepo.Irepoevent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    Irepoevent eventrepo;

    public String addevents(List<EventModel> event) {
        eventrepo.saveAll(event);
        return "events added";
    }

    public String updateevent(Integer id, Event event) {
        Optional<EventModel> events = eventrepo.findById(id);
        EventModel eventss = null;
        if(events.isPresent())
        {
           eventss = events.get();
        }
        else {
            return "Id not Found!!!";
        }
        eventss.setEventName(event);
        eventrepo.save(eventss);
        return "room type updated";

    }
    public String removeevent(Integer id){
        eventrepo.deleteById(id);
        return "event removed";
    }


}
