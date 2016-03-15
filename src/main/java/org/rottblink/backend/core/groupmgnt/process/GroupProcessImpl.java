package org.rottblink.backend.core.groupmgnt.process;

import java.util.List;


import org.rottblink.backend.core.groupmgnt.domain.Group;
import org.rottblink.backend.core.groupmgnt.domain.domainvalue.BBox;
import org.rottblink.backend.core.groupmgnt.persistence.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class GroupProcessImpl implements GroupProcess {

    @Autowired
    private Validator validator;
	
	@Autowired
	private GroupRepository groupPersistence;
	
	@Override
	public Group create(Group group) {
		Errors errors = null;
		validator.validate(group, errors);
		return groupPersistence.save(group);
	}

	@Override
	public Group read(Long groupId) {
		return groupPersistence.getOne(groupId);
	}

	@Override
	public Group update(Group group) {
		return groupPersistence.save(group);
	}

	@Override
	public List<Group> getAllInBBox(BBox area) {
		// FIXME
		return groupPersistence.findByMapMarkerPositionLatitudeBetweenAndMapMarkerPositionLongitudeBetween(area.getMinLat(), area.getMaxLat(), area.getMinLng(), area.getMaxLng());
		//return groupPersistence.findAll();
	}
}
