package studentreg;

import java.util.ArrayList;

import studentreg.Student;

public class module {
    private String Name;
    private String ID;
    private ArrayList StudentList;

public module(String name, String id, ArrayList students){
    this.Name = name;
    this.ID = id;
    this.StudentList = students;
}

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList getStudentList() {
        return StudentList;
    }

    public void setStudentList(ArrayList StudentList) {
        this.StudentList = StudentList;
    }

    public void addToStudentList(Student s){
        this.StudentList.add(s);
    }


}

