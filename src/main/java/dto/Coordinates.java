package dto;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Coordinates {

    @Expose
    private String latitude;
    @Expose
    private String longitude;
}
