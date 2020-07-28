package dto;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    @Expose
    private String cell;
    @Expose
    private Dob dob;
    @Expose
    private String email;
    @Expose
    private String gender;
    @Expose
    private Id id;
    @Expose
    private Location location;
    @Expose
    private Login login;
    @Expose
    private Name name;
    @Expose
    private String nat;
    @Expose
    private String phone;
    @Expose
    private Picture picture;
    @Expose
    private Registered registered;
}
