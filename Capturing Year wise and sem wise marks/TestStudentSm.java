import java.util.*;

class StudentSm {
    int id;
    String name;
    int[][] semesterPercentile;


    StudentSm(int id, String name){
        this.id = id;
        this.name = name;
        semesterPercentile = new int[4][2];
    }

    StudentSm(int id, String name, int[][] semesterPercentile){
        this.id = id;
        this.name = name;
        this.semesterPercentile = semesterPercentile;
    }

    String getInformation(){
        String info = "";
        info += "\nID : " + id + "\tName : " + name;
        info += "\nSemester wise consolidated marks %";

        for(int i=0;i<semesterPercentile.length;i++){
            for(int j=0;j<semesterPercentile[i].length;j++){
                info += "\n" + (i+1) + " Year " + (j+1) + " Semester: " + semesterPercentile[i][j];
            }
        }
        return info;
    }
}

class TestStudentSm{
    public static void main(String[] args){
        int id;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter name: ");
        name = sc.nextLine();
        StudentSm s1 = new StudentSm(id, name);
        System.out.print(s1.getInformation());

        int[][] marksPercentage = new int[4][2];

        System.out.print("\nEnter student id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter student name: ");
        name = sc.nextLine();

        System.out.print("\nEnter the 4 years Sem wise percentage of marks: ");
        for(int i=0;i<marksPercentage.length;i++){
            for(int j=0;j<marksPercentage[i].length;j++){
                System.out.print("\n" + (i+1) + "-" + (j+1) + ": ");
                marksPercentage[i][j] = sc.nextInt();
            }
        }

        StudentSm s2 = new StudentSm(id,name, marksPercentage);
        System.out.println(s2.getInformation());
    }
}
