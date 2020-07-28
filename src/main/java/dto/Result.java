package dto;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Result {

    @Expose
    private Info info;
    @Expose
    private List<User> results;
}
