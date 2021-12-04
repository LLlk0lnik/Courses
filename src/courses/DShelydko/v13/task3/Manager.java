package courses.DShelydko.v13.task3;

public class Manager {
    private String name;
    private int age;
    private String work;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }
    public void setName(String upname) {
        name = upname;
    }
    public void setAge(int upAge) {
        age = upAge;
    }
    public void setWork(String upWork) {
        work = upWork;
    }
    public void toConsole() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(work);
    }

}
