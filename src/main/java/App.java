import httpClient.CityOwResponse;
import httpClient.HttpClientService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var isRunning = true;
        var isFirstRun = true;
        while(isRunning) {
            if (isFirstRun) {
                System.out.println("""
                ----------------------
                WELCOME!
                type X to quit
                type Y to get a weather stats
                ----------------------
                """);
                isFirstRun = false;
            }

            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();

            switch (userInput) {
                case "X" -> isRunning = false;
                case "Y" -> {
                    final CityOwResponse weatherFromOpenWeather = new WeatherService().getWeatherFromOpenWeather();
                    System.out.println("City name: " + weatherFromOpenWeather.getName());
                }
                default -> System.out.println("ERROR!!! INVALID INPUT");
            }
        }
    }
}
