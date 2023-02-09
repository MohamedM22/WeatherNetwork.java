public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = -12;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!

        if (temp <= -1) {
            System.out.println("The wweather is FREEZING!Stay Home!");
        } else if (temp <= 10){
            System.out.println("The forecast is Chilly. Wear a coat!");
        } else {
            System.out.println("It's warm. Go outside!");
        }

          
        
        
        System.out.println(forecast);
    }
}
