package studentreg;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {

	private String CourseName;
    private ArrayList moduleList;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String CourseName, ArrayList moduleList, LocalDate start, LocalDate end){
        this.CourseName = CourseName;
        this.moduleList = moduleList;
        this.startDate = start;
        this.endDate = end;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
    
    public ArrayList getModuleList() {
        return moduleList;
    }

    public void setModuleList(ArrayList moduleList) {
        this.moduleList = moduleList;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void printStudents(){
        ArrayList<Student> CourseStudents = new ArrayList<Student>();
        
        ArrayList<module> modules = new ArrayList<module>();
        modules = this.getModuleList();
        for (int i=0 ; i<modules.size() ; i++){
            module m = modules.get(i);
            ArrayList<Student> ModuleStudents = new ArrayList<Student>();
            ModuleStudents = m.getStudentList();
            for (int j=0 ; j<ModuleStudents.size();j++){
                Student s = ModuleStudents.get(j);
                if (s.getCourse().equals(this.getCourseName()) && !(CourseStudents.contains(s))){
                    CourseStudents.add(s);
                    System.out.println(s.getName() + "\t Course: " + s.getCourse());
                    System.out.print("\t Modules: ");
                    for(int k=0; k<modules.size();k++){
                        System.out.print(modules.get(k).getName() + " -- ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
