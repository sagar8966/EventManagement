package UniversiEventManagement.EventManagement.Studentrepo;

import UniversiEventManagement.EventManagement.StudentModel.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Istudentrepo extends CrudRepository<StudentModel, Integer> {
}
