/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/kernel/tags/sakai-10.5/kernel-impl/src/test/java/org/sakai/memory/impl/test/MockBasicMemoryService.java $
 * $Id: MockBasicMemoryService.java 308852 2014-04-25 23:22:20Z enietzel@anisakai.com $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007, 2008 Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakai.memory.impl.test;

import org.sakaiproject.authz.api.AuthzGroupService;
import org.sakaiproject.authz.api.SecurityService;
import org.sakaiproject.component.api.ServerConfigurationService;
import org.sakaiproject.event.api.EventTrackingService;
import org.sakaiproject.memory.impl.BasicMemoryService;

/**
 * @author ieb
 *
 */
public class MockBasicMemoryService extends BasicMemoryService
{

	private EventTrackingService eventTrackingService;
	private SecurityService securityService;
	private AuthzGroupService authzGroupService;
	private ServerConfigurationService serverConfigurationService;

	/**
	 * 
	 */
	public MockBasicMemoryService(EventTrackingService eventTrackingService, SecurityService securityService, AuthzGroupService authzGroupService, ServerConfigurationService serverConfigurationService)
	{
		this.eventTrackingService = eventTrackingService;
		this.securityService = securityService;
		this.authzGroupService = authzGroupService;
		this.serverConfigurationService = serverConfigurationService;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.memory.impl.BasicMemoryService#eventTrackingService()
	 */
	@Override
	protected EventTrackingService eventTrackingService()
	{
		return eventTrackingService;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.memory.impl.BasicMemoryService#securityService()
	 */
	@Override
	protected SecurityService securityService()
	{
	return securityService;
	}

	protected AuthzGroupService authzGroupService()
	{
		return authzGroupService;
	}

	@Override
	protected ServerConfigurationService serverConfigurationService() {
		return serverConfigurationService;
	}

}
