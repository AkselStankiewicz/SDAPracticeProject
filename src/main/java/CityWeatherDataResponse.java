import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CityWeatherDataResponse {
    private String cityName;
    private LocalDateTime date;

    private Float temperature;
    private Float windSpeed;
    private Float pressure;

    public CityWeatherDataResponse(String cityName, LocalDateTime date, Float temperature, Float windSpeed, Float pressure) {
        this.cityName = cityName;
        this.date = date;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }
}