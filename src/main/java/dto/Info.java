package dto;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Info {

    @Expose
    private Long page;
    @Expose
    private Long results;
    @Expose
    private String seed;
    @Expose
    private String version;
}
