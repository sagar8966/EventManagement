package UniversiEventManagement.EventManagement.Event.EventController.EventRepo;

import UniversiEventManagement.EventManagement.Event.EventController.EventModel.EventModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Irepoevent extends CrudRepository<EventModel,Integer> {


  
}
