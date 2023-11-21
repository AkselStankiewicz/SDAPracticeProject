package httpClient;

import com.sun.tools.javac.Main;
import lombok.Getter;
import params.Wind;

import java.time.LocalDateTime;

@Getter
public class CityOwResponse {
    private Wind wind;
    private Main main;
    private String name;
    private LocalDateTime dt;

    public CityOwResponse(Wind wind, Main main, String name, LocalDateTime dt) {
        this.wind = wind;
        this.main = main;
        this.name = name;
        this.dt = dt;
    }
}
