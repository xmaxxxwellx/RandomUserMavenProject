package dto;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Timezone {

    @Expose
    private String description;
    @Expose
    private String offset;
}
