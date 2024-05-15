package gob.pe.msi.trakingrealtime.endpoints.tranking.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LocationDto {
    private int id;
    private int id_user;
    private String latitude;
    private String longitude;
    private String registered;
}