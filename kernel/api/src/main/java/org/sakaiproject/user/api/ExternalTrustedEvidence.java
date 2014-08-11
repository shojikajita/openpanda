/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/kernel/branches/kernel-1.2.x/api/src/main/java/org/sakaiproject/user/api/ExternalTrustedEvidence.java $
 * $Id: ExternalTrustedEvidence.java 51317 2008-08-24 04:38:02Z csev@umich.edu $
 ***********************************************************************************
 *
 * Copyright (c) 2005, 2006, 2008 Sakai Foundation
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

package org.sakaiproject.user.api;

/**
 * <p>
 * ExternalTrustedEvidence is Authetication evidence made up of a user identifier that has been authenticated by a trusted external source.
 * </p>
 */
public interface ExternalTrustedEvidence extends Evidence
{
	/**
	 * Access the user identifier.
	 * 
	 * @return The user identifier.
	 */
	String getIdentifier();
}