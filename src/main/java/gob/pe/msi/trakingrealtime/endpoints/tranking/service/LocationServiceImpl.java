package gob.pe.msi.trakingrealtime.endpoints.tranking.service;

import gob.pe.msi.trakingrealtime.endpoints.tranking.dto.LocationDto;
import gob.pe.msi.trakingrealtime.endpoints.tranking.entity.LocationEntity;
import gob.pe.msi.trakingrealtime.endpoints.tranking.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationRepository locationRepository;

    @Override
    public LocationDto saveLocation(LocationDto locationDto) {

        //LocationEntity entity = locationDtoToEntity(locationDto);
        int response = locationRepository.saveLocation(
                locationDto.getId_user(),
                locationDto.getLatitude(),
                locationDto.getLongitude(),
                locationDto.getRegistered());


        System.out.println("response =====> " + response);
        return null;
    }



    @Override
    public List<LocationEntity> getAllLocation() {

        return locationRepository.getAllLocation();
    }

    private LocationEntity locationDtoToEntity(LocationDto locationDto){
        if(locationDto == null) return null;

        return LocationEntity
                .builder()
                .id(locationDto.getId())
                .id_user(locationDto.getId_user())
                .latitude(locationDto.getLatitude())
                .longitude(locationDto.getLongitude())
                .registered(locationDto.getRegistered())
                .build();
    }

}
