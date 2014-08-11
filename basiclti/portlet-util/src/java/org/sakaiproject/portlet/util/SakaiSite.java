/**
 * $URL: https://source.sakaiproject.org/svn/basiclti/branches/basiclti-1.3.x/portlet-util/src/java/org/sakaiproject/portlet/util/SakaiSite.java $
 * $Id: SakaiSite.java 70086 2009-11-09 22:29:00Z arwhyte@umich.edu $
 *
 * Copyright (c) 2005-2009 The Sakai Foundation
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
 */

package org.sakaiproject.portlet.util;

import java.net.URLEncoder;

/**
 * a simple SakaiSite POJO
 */
public class SakaiSite {

        public String id = null;

        public String title = null;

        public String host = null;

        public String session = null; // Session is optional
	
        public String toolId  = null; 

        public String toolTitle  = null; 

        public String toString() {
            return title;
        }

        public String toStringFull() {
            return "title=" + title + " url=" + getUrl() + " toolTitle=" + toolTitle + " toolUrl=" + getToolUrl();
        }

        // TODO: UrlEncode
        public String getUrl() {
	    if ( id == null ) return "null";
            String retval = host + "/portal/worksite/" + URLEncoder.encode(id);
            if (session != null)
                retval = retval + "?sakai.session="
                        + URLEncoder.encode(session);
            return retval;
        }

        // TODO: UrlEncode
        public String getToolUrl() {
            if ( toolId == null ) return "null";
            String retval = host + "/portal/page/" + URLEncoder.encode(toolId);
            if (session != null)
                retval = retval + "?sakai.session="
                        + URLEncoder.encode(session);
            return retval;
        }
}