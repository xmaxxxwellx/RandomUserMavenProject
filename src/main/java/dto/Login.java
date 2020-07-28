package dto;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Login {

    @Expose
    private String md5;
    @Expose
    private String password;
    @Expose
    private String salt;
    @Expose
    private String sha1;
    @Expose
    private String sha256;
    @Expose
    private String username;
    @Expose
    private String uuid;
}
