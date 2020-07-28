package dto;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Location {

    @Expose
    private String city;
    @Expose
    private Coordinates coordinates;
    @Expose
    private String country;
    @Expose
    private String postcode;
    @Expose
    private String state;
    @Expose
    private Street street;
    @Expose
    private Timezone timezone;
}
