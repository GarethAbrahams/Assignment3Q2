public class Staff {

    String Name, Surname, EmpNum, Department;

    public Staff() {
    }

    public Staff(String name, String surname, String empNum, String department) {
        Name = name;
        Surname = surname;
        EmpNum = empNum;
        Department = department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmpNum() {
        return EmpNum;
    }

    public void setEmpNum(String empNum) {
        EmpNum = empNum;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
