package gob.pe.msi.trakingrealtime.endpoints.tranking.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TrakingRealTime {
    private User user;
    private Location location;
}
