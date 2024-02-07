import java.util.Scanner;

public class TrafficLight {
    private String color;
    private String message;

    public String getColor(){
        return color;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(){
        if(color.equals("red")){
            message = "stop";
        }else if(color.equals("yellow")){
            message = "Ready";
        }else if(color.equals("green")){
            message = "Go";
        }else{
            message = "";
        }
    }

    public void setColor(int option){
        switch(option){
            case 1:
            color = "red";
            break;
            case 2:
            color = "yellow";
            break;
            case 3:
            color = "green";
            break;
            default:
            color = "";
            break;
        }
    }

class TrafficLightUI {
    int option = 0;
    void displayColorOptions(){
        System.out.println("********************");
        System.out.println("Traffic Light Simulation");
        System.out.println("********************");
        System.out.println("1.Red");
        System.out.println("2.Yellow");
        System.out.println("3.Green");
        System.out.println("4.Exit");
        System.out.println("********************");
    }

    int getColorOptions(){
        System.out.print("Choose an option: ");
        Scanner input = new Scanner(System.in);
        option = input.nextInt();
        return option;
    }

    void displayMessage(){
        System.out.println("********************");
        System.out.println(message);
        System.out.println("********************");
    }
}
}

