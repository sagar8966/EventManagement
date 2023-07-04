package UniversiEventManagement.EventManagement.StudentService;

import UniversiEventManagement.EventManagement.StudentModel.Depeartment;
import UniversiEventManagement.EventManagement.StudentModel.StudentModel;
import UniversiEventManagement.EventManagement.Studentrepo.Istudentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    Istudentrepo studentrepo;

    public String Addstudents(List<StudentModel> students) {
        studentrepo.saveAll(students);
        return "Students added";
    }

    public String updatestudentdepartment(Integer id, Depeartment department) {
        Optional<StudentModel> students = studentrepo.findById(id);
        StudentModel student = null;
        if(students.isPresent())
        {
           student= students.get();
        }
        else {
            return "Id not Found!!!";
        }
        student.setDepartment(department);
        studentrepo.save(student);
        return "room type updated";

    }

    public String removestudent(Integer id) {
        studentrepo.deleteById(id);
        return "student removed";
    }

    public String getallstudents() {
        studentrepo.findAll();
        return "all students list";
    }

    public String getstudentbyid(Integer id) {
        studentrepo.findById(id);
        return "student by id";
    }
}
