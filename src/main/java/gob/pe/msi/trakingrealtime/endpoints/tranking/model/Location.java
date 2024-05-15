package gob.pe.msi.trakingrealtime.endpoints.tranking.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
public class Location {
    private int id;
    private int id_user;
    private String latitude;
    private String longitude;
    private String registered;
}