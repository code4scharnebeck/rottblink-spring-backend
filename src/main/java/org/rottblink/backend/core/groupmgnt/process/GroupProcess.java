package org.rottblink.backend.core.groupmgnt.process;

import java.util.List;

import org.rottblink.backend.core.groupmgnt.domain.Group;
import org.rottblink.backend.core.groupmgnt.domain.domainvalue.BBox;

public interface GroupProcess {

	// protected List<GroupMeeting> getMeetingsByDate(Date date);

	/**
	 * creates a group with rules and events
	 * 
	 * triggers a update of calendar file
	 * 
	 * @param group
	 * @return
	 */
	public Group create(Group group);

	/**
	 * reads Group (contains only future events)
	 * 
	 * @param groupId
	 * @return
	 */
	public Group read(Long groupId);
	
	public List<Group> getAllInBBox(BBox area);

	/**
	 * Updates a group including regular and unregular meetings
	 * 
	 * where are the drafts?
	 * 
	 * triggers a update of calendar file
	 * 
	 * @param group
	 * @return
	 */
	public Group update(Group group);

}
