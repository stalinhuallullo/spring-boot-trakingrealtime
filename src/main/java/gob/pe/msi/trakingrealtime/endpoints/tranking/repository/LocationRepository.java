package gob.pe.msi.trakingrealtime.endpoints.tranking.repository;

import gob.pe.msi.trakingrealtime.endpoints.tranking.entity.LocationEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface LocationRepository extends JpaRepository<LocationEntity, Integer> {

    @Query(value = "SELECT * FROM locations", nativeQuery = true)
    List<LocationEntity> getAllLocation();

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO locations (id_user, latitude, longitude, registered) VALUES (:id_user, :latitude, :longitude, :registered)", nativeQuery = true)
    int saveLocation(
            @Param("id_user") int id_user,
            @Param("latitude") String latitude,
            @Param("longitude") String longitude,
            @Param("registered") String registered);

}