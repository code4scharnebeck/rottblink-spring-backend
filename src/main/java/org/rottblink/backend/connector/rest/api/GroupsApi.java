package org.rottblink.backend.connector.rest.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.rottblink.backend.connector.rest.model.GroupDto;
import org.rottblink.backend.connector.rest.model.NewGroupDto;
import org.rottblink.backend.core.groupmgnt.domain.Group;
import org.rottblink.backend.core.groupmgnt.domain.domainvalue.BBox;
import org.rottblink.backend.core.groupmgnt.process.GroupProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;

@RestController
@RequestMapping(value = "/groups", produces = { APPLICATION_JSON_VALUE })
@Api(value = "/groups", description = "the groups API")
public class GroupsApi {

	@Autowired
	private GroupProcess groupProcess;

	@Autowired
	private Mapper mapper;

	@ApiOperation(value = "create a new group", //
			notes = "This endpoint has to be used to create a new Group.\nProvide as much information as you like. \nTu successfully submit this request a user has to be logged in.", //
			response = GroupDto.class, authorizations = { @Authorization(value = "basicAuth") })
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 201, message = "the new created group"),
			@io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error") })
	@RequestMapping(value = "", produces = { "application/json" }, method = RequestMethod.POST)
	public GroupDto addGroup(@ApiParam(value = "", required = true) @RequestBody NewGroupDto group)
			throws NotFoundException {

		Group newGroup = mapper.map(group, Group.class);
		Group createdGroup = groupProcess.create(newGroup);
		return mapper.map(createdGroup, GroupDto.class);
	}

	@ApiOperation(value = "searchs for groups", notes = "The Groups endpoint returns information about groups near\na given location. The response includes the display name\nand other details about each group, and lists the groups \nin alphabetical order.", response = GroupDto.class, responseContainer = "List")
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "An array of the nearest groups"),
			@io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error") })
	@RequestMapping(produces = { "application/json" }, method = RequestMethod.GET)
	public List<GroupDto> getGroupsByBBox(
			@ApiParam(value = "Max Latitude component of bbox.", required = true) @RequestParam(value = "top", required = true) Double top,
			@ApiParam(value = "Min Longitude component of bbox.", required = true) @RequestParam(value = "left", required = true) Double left,
			@ApiParam(value = "Min Latitude component of bbox.", required = true) @RequestParam(value = "bottom", required = true) Double bottom,
			@ApiParam(value = "Max Longitude component of bbox.", required = true) @RequestParam(value = "right", required = true) Double right)
			throws NotFoundException {

		// return Arrays.asList(groupDto);
		List<Group> groups = groupProcess.getAllInBBox(new BBox(top, left, bottom, right));
		List<GroupDto> result = new ArrayList<>(groups.size());
		for (Group group : groups) {
			result.add(mapper.map(group, GroupDto.class));
		}
		return result;
	}

	@ApiOperation(value = "update an existing group", notes = "This endpoint has to be used to update an existing Group.\nRequest from users diffrent to the group owner will result in\na change request which has to be accepted by the owner.", response = GroupDto.class)
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "the updated Group"),
			@io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error") })
	@RequestMapping(value = "/{groupId}", produces = { "application/json" }, method = RequestMethod.PUT)
	public GroupDto updateGroup(@ApiParam(value = "", required = true) @PathVariable("groupId") Long groupId,
			@ApiParam(value = "", required = true) @RequestBody GroupDto group) throws NotFoundException {
		Group g = mapper.map(group, Group.class);
		g.setId(groupId);
		Group updatedGroup = groupProcess.update(g);
		return mapper.map(updatedGroup, GroupDto.class);
	}

	@ApiOperation(value = "read an existing group", notes = "This endpoint has to be used to get an existing Group.", response = GroupDto.class)
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "the Group"),
			@io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error") })
	@RequestMapping(value = "/{groupId}", produces = { "application/json" }, method = RequestMethod.GET)
	public GroupDto readGroup(@ApiParam(value = "", required = true) @PathVariable("groupId") Long groupId)
			throws NotFoundException {
		Group group = groupProcess.read(groupId);
		return mapper.map(group, GroupDto.class);
	}

}
