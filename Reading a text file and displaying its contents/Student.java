

public class Student {
    private String HTNo;
    private String name;

    Student(String HTNo, String name){
        this.HTNo = HTNo;
        this.name = name;
    }

    public String getHTNo(){
        return HTNo;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "H.T.No" + HTNo + "Name" + name;
    }
}
