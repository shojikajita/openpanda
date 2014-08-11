/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/kernel/branches/kernel-1.2.x/api/src/main/java/org/sakaiproject/email/api/DigestEdit.java $
 * $Id: DigestEdit.java 79506 2010-07-15 17:16:06Z david.horwitz@uct.ac.za $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2008 Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.email.api;

import org.sakaiproject.entity.api.Edit;
import org.sakaiproject.time.api.Time;

/**
 * <p>
 * DigestEdit is a mutable Digest.
 * </p>
 */
public interface DigestEdit extends Digest, Edit
{
	/**
	 * Add another message, in the current time period.
	 * 
	 * @param to
	 *        The to (user id) of the message.
	 * @param subject
	 *        The subject of the message.
	 * @param body
	 *        The subject of the message.
	 */
	void add(String to, String subject, String body);

	/**
	 * Add another message, in the current time period.
	 * 
	 * @param msg
	 *        The message to add.
	 */
	void add(DigestMessage msg);

	/**
	 * Clear all messages from a time period.
	 * 
	 * @param period
	 *        a Time in the time period.
	 */
	void clear(Time period);
}