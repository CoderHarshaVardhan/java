import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.List;
import java.util.LinkedList;

public class OpenActionListener implements ActionListener {
    File tableFile;
    FileDialog openFileDialog;
    Frame displayFrame;
    List<Student> students;
    BufferedReader bufferedReader;
    int count;
    String[] student;

    OpenActionListener(Frame displayFrame){
        this.count = 0;
        this.student = new String[2];
        this.displayFrame = displayFrame;
        this.tableFile = null;
        this.openFileDialog = new FileDialog(displayFrame, "openFile", FileDialog.LOAD);
        this.students = new LinkedList<Student>();

    }

    public void actionPerformed(ActionEvent e){
        openFileDialog.setVisible(true);
        tableFile = new File(openFileDialog.getFile());
        try{
            openFileForReading();
            readFileAndPopulateStudentList();

        }catch(IOException ex){
            ex.printStackTrace();
        }
        displayStudentList();
    }

    private void openFileForReading() throws IOException{
        FileReader fileReader = new FileReader(tableFile);
        bufferedReader = new BufferedReader(fileReader);
    }

    private void readFileAndPopulateStudentList() throws IOException{
        String line = "";
        while((line = bufferedReader.readLine()) != null){
            student = line.split(",");
            students.add(new Student(student[0], student[1]));
            count++;
        }
        bufferedReader.close();
    }

    private void displayStudentList(){
        ScrollPane sp = (ScrollPane) displayFrame.getComponent(0);
        Panel panel = (Panel) sp.getComponent(0);
        panel.setLayout(new GridLayout(count, 2));
        Label lblHTNo = null;
        Label lblName = null;

        for(int i=0;i<count;i++){
            lblHTNo = new Label(students.get(i).getHTNo());
            lblName = new Label(students.get(i).getName());
            panel.add(lblHTNo);
            panel.add(lblName);
        }

        displayFrame.repaint();
        displayFrame.pack();

    }
}
