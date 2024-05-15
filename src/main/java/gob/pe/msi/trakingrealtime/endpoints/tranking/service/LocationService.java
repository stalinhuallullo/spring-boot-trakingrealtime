package gob.pe.msi.trakingrealtime.endpoints.tranking.service;

import gob.pe.msi.trakingrealtime.endpoints.tranking.dto.LocationDto;
import gob.pe.msi.trakingrealtime.endpoints.tranking.entity.LocationEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface LocationService {
    LocationDto saveLocation(LocationDto locationDto);
    List<LocationEntity> getAllLocation();
}
