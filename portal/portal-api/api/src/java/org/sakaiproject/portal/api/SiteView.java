/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/portal/tags/sakai-10.5/portal-api/api/src/java/org/sakaiproject/portal/api/SiteView.java $
 * $Id: SiteView.java 105079 2012-02-24 23:08:11Z ottenhoff@longsight.com $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007, 2008 The Sakai Foundation
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

package org.sakaiproject.portal.api;

/**
 * This interface represents a view of a the Site cloud from a particuar view point.
 * @author ieb
 *
 */
public interface SiteView
{

	public static enum View { ALL_SITES_VIEW, DEFAULT_SITE_VIEW, DHTML_MORE_VIEW, SUB_SITES_VIEW, CURRENT_SITE_VIEW }
	/*
	 DEFAULT_SITE_VIEW
	 
		siteView.setIncludeMyWorksite(true);
		siteView.setPrefix(prefix);
		siteView.setMyWorkspaceSiteId(myWorkspaceSiteId);
		siteView.setIncludeSumary(includeSummary);
		siteView.setExpandSite(expandSite);
		siteView.setResetTools(resetTools);
		siteView.setDoPages(doPages);
		siteView.setToolContextPath(toolContextPath);
		siteView.setLoggedIn(loggedIn);

	*/

	/**
	 * The prefix for creating site URLs. Eg. If "site" then URLs will come out like /portal/site/...
	 * required
	 * @param prefix The prefix to use.
	 */
	void setPrefix(String prefix);

	/**
	 * required
	 * @param toolContextPath
	 */
	void setToolContextPath(String toolContextPath);
	

	/**
	 * gets the representation for the render context
	 * @return
	 */
	Object getRenderContextObject();

	/**
	 * is the SiteView empty.
	 * @return
	 */
	boolean isEmpty();

	/**
	 * @param resetTools
	 */
	void setResetTools(boolean resetTools);

	/**
	 * @param includeSummary
	 */
	void setIncludeSummary(boolean includeSummary);

	/**
	 * @param doPages
	 */
	void setDoPages(boolean doPages);

	/**
	 * @param expandSite
	 */
	void setExpandSite(boolean expandSite);


}
