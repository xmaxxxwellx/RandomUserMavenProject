package dto;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Name {

    @Expose
    private String first;
    @Expose
    private String last;
    @Expose
    private String title;
}
