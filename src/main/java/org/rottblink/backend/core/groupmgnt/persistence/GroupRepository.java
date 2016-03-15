package org.rottblink.backend.core.groupmgnt.persistence;

import java.util.List;

import org.rottblink.backend.core.groupmgnt.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface GroupRepository extends JpaRepository<Group, Long> {
	List<Group> findByNameLike(@Param("groupName") String groupName);
	List<Group> findByMapMarkerPositionLatitudeBetweenAndMapMarkerPositionLongitudeBetween(Double minLat, Double maxLat, Double minLng, Double maxLng);
}