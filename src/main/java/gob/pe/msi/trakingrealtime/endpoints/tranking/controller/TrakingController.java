package gob.pe.msi.trakingrealtime.endpoints.tranking.controller;


import com.google.gson.Gson;
import gob.pe.msi.trakingrealtime.endpoints.tranking.dto.LocationDto;
import gob.pe.msi.trakingrealtime.endpoints.tranking.entity.LocationEntity;
import gob.pe.msi.trakingrealtime.endpoints.tranking.model.Location;
import gob.pe.msi.trakingrealtime.endpoints.tranking.model.TrakingRealTime;
import gob.pe.msi.trakingrealtime.endpoints.tranking.service.LocationService;
import jdk.jfr.Description;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;
import java.util.List;

@RestController
@RequestMapping("/api/v1/traking")
public class TrakingController {

    @Autowired
    private LocationService locationService;

    /*
     * Generar QR via iamgen
     * @Param: barcode
     * Return iamgen
     * */
    @Description("Generar QR via iamgen")
    @PostMapping(value = "")
    public ResponseEntity<LocationDto> saveLocation(@RequestBody LocationDto location) {

        Gson gson = new Gson();

        String json = gson.toJson(location);
        System.out.println("location ==> " + json);

        LocationDto locationDto = locationService.saveLocation(location);


        return new ResponseEntity<>(locationDto, HttpStatus.OK);
    }

    @GetMapping(value = "")
    public ResponseEntity<List<LocationEntity>> getAllLocation() {
        List<LocationEntity> locations =  locationService.getAllLocation();

        Gson gson = new Gson();
        String json = gson.toJson(locations);
        System.out.println("location ==> " + json);

        return new ResponseEntity<>(locations, HttpStatus.OK);
    }


}
