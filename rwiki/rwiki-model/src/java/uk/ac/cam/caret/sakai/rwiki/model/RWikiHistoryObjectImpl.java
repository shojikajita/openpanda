/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/rwiki/tags/sakai-10.5/rwiki-model/src/java/uk/ac/cam/caret/sakai/rwiki/model/RWikiHistoryObjectImpl.java $
 * $Id: RWikiHistoryObjectImpl.java 20447 2007-01-18 23:06:20Z ian@caret.cam.ac.uk $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006 The Sakai Foundation.
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/
package uk.ac.cam.caret.sakai.rwiki.model;

import uk.ac.cam.caret.sakai.rwiki.service.api.model.RWikiHistoryObject;

/**
 * @author ieb
 */
public class RWikiHistoryObjectImpl extends RWikiObjectImpl implements
		RWikiHistoryObject
{

	String rwikiobjectid = null;

	public void setRwikiobjectid(String rwikiobjectid)
	{
		this.rwikiobjectid = rwikiobjectid;

	}

	public String getRwikiobjectid()
	{
		return rwikiobjectid;
	}
}
