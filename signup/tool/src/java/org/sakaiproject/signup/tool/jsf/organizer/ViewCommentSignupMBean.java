/*
* Licensed to The Apereo Foundation under one or more contributor license
* agreements. See the NOTICE file distributed with this work for
* additional information regarding copyright ownership.
*
* The Apereo Foundation licenses this file to you under the Educational 
* Community License, Version 2.0 (the "License"); you may not use this file 
* except in compliance with the License. You may obtain a copy of the 
* License at:
*
* http://opensource.org/licenses/ecl2.txt
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.sakaiproject.signup.tool.jsf.organizer;

import org.sakaiproject.signup.tool.jsf.AttendeeWrapper;
import org.sakaiproject.signup.tool.jsf.SignupMeetingWrapper;
import org.sakaiproject.signup.tool.jsf.SignupUIBaseBean;
import org.sakaiproject.user.api.User;

/**
 * <p>
 * This JSF UIBean class will handle information exchanges between Organizer's
 * view comment page:<b>viewComment.jsp</b> and backbone system.
 * </P>
 */
public class ViewCommentSignupMBean extends SignupUIBaseBean {

	private AttendeeWrapper attendeeWraper;

	private String AttendeeRole;

	/**
	 * To initialize this UIBean, which lives in a session scope.
	 * 
	 * @param attwrp
	 *            an AttendeeWrapper object.
	 * @param role
	 *            a stirng value
	 * @param meetingwrp
	 *            a SignupMeetingWrapper object.
	 */
	public void init(AttendeeWrapper attwrp, String role, SignupMeetingWrapper meetingwrp) {
		this.attendeeWraper = attwrp;
		this.AttendeeRole = role;
		this.meetingWrapper = meetingwrp;
	}

	/**
	 * This is a getter method for UI.
	 * 
	 * @return an AttendeeWrapper object.
	 */
	public AttendeeWrapper getAttendeeWraper() {
		return attendeeWraper;
	}

	/**
	 * This is a setter.
	 * 
	 * @param attendeeWraper
	 *            an AttendeeWrapper object.
	 */
	public void setAttendeeWraper(AttendeeWrapper attendeeWraper) {
		this.attendeeWraper = attendeeWraper;
	}

	/**
	 * This is a getter method for UI.
	 * 
	 * @return a string value.
	 */
	public String getAttendeeRole() {
		return AttendeeRole;
	}

	/**
	 * This is a setter.
	 * 
	 * @param attendeeRole
	 *            a string value.
	 */
	public void setAttendeeRole(String attendeeRole) {
		AttendeeRole = attendeeRole;
	}

	/**
	 * Overwrite the default one.
	 * 
	 * @return a SignupMeetingWrapper object.
	 */
	public SignupMeetingWrapper getMeetingWrapper() {
		return meetingWrapper;
	}
	
	/**
	 * show the attendee's Eid (user Id)
	 * @return eid String
	 */
	public String getAttendeeEid(){
		String eid =attendeeWraper.getSignupAttendee().getAttendeeUserId();
		User user = sakaiFacade.getUser(attendeeWraper.getSignupAttendee().getAttendeeUserId());
		if(user !=null){
			eid = user.getEid();
		}

		return eid;
	}

}
