package UniversiEventManagement.EventManagement.StudentController;

import UniversiEventManagement.EventManagement.StudentModel.Depeartment;
import UniversiEventManagement.EventManagement.StudentModel.StudentModel;
import UniversiEventManagement.EventManagement.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentservice;

    @PostMapping("AddStudents")
    public String Addstudents(@RequestBody List<StudentModel> students){
        return studentservice.Addstudents(students);
    }
    @PutMapping("UpdateStudentDepartment/{id}/{department}")
    public String updatestudentdepartment(@PathVariable Integer id, @PathVariable Depeartment department){
        return studentservice.updatestudentdepartment(id,department);
    }
    @DeleteMapping("RemoveStudent/{id}")
    public String removestudent(@PathVariable Integer id){
        return studentservice.removestudent(id);
    }
    @GetMapping("Allstudents")
    public String getallstudents(){
        return studentservice.getallstudents();
    }
    @GetMapping("Getstudentbyid/{id}")
    public String getstudentbyid(@PathVariable Integer id){
        return studentservice.getstudentbyid(id);
    }

}
