import java.util.*;

class StudentYm {
    int id;
    String name;
    int[] yearlyPercentile;


    StudentYm(int id, String name){
        this.id = id;
        this.name = name;
        yearlyPercentile = new int[4];
    }

    StudentYm(int id, String name, int[] yearlyPercentile){
        this.id = id;
        this.name = name;
        this.yearlyPercentile = yearlyPercentile;
    }

    String getInformation(){
        String info = "";
        info += "\nID : " + id + "\tName : " + name;
        info += "\nYear wise consolidated marks %";

        for(int i=0;i<yearlyPercentile.length;i++){
            info += "\n" + (i+1) + " year " + yearlyPercentile[i] + " %" ;
        }
        return info;
    }
}

class TestStudent{
    public static void main(String[] args){
        int id;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter name: ");
        name = sc.nextLine();
        StudentYm s1 = new StudentYm(id, name);
        System.out.print(s1.getInformation());

        int[] marksPercentage = new int[4];

        System.out.print("\nEnter student id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter student name: ");
        name = sc.nextLine();

        System.out.print("\nEnter the 4 years percentage of marks: ");
        for(int i=0;i<marksPercentage.length;i++){
            marksPercentage[i]=sc.nextInt();
        }

        StudentYm s2 = new StudentYm(id,name, marksPercentage);
        System.out.println(s2.getInformation());
    }
}
