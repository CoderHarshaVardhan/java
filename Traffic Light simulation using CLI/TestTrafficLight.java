public class TestTrafficLight{
    public static void main(String[] args){
        int option;
        TrafficLight trafficLight = new TrafficLight();
        TrafficLight.TrafficLightUI trafficLightUI = trafficLight.new TrafficLightUI();

        do{
            trafficLightUI.displayColorOptions();
            option = trafficLightUI.getColorOptions();
            trafficLight.setColor(option);
            trafficLight.setMessage();
            trafficLightUI.displayMessage();
        }while(option!=4);
    }
}