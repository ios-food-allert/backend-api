/**
 * 
 */
package com.foodallert.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.foodallert.dto.AssistantRequest;
import com.foodallert.extension.FoodAllertMessageResponse;
import com.foodallert.watson.services.AssistantConnector;

/**
 * @author Jose Gil Ramirez Sanchez
 *
 */
@Path("/rest")
public class WatsonAssistantService {
	static final Logger logger = Logger.getLogger(WatsonAssistantService.class);
	
	@POST
	@Path("/sendAssistantInput")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public FoodAllertMessageResponse sendAssistantInput(AssistantRequest request) {
		logger.info("POST /sendAssistantInput");
		FoodAllertMessageResponse response = new FoodAllertMessageResponse();
		logger.info(request.getUserInput());
		
		AssistantConnector connector = new AssistantConnector();
		response = connector.sendAssistantRequest(request);

		return response;
	}
}
