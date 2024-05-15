package gob.pe.msi.trakingrealtime.endpoints.tranking.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
    private int id;
    private String name;
    private String firt_name;
    private String last_name;
    private String email;
    private String password;
    private String status;
}
