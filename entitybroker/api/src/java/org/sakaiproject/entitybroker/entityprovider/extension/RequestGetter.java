/**
 * $Id: RequestGetter.java 105077 2012-02-24 22:54:29Z ottenhoff@longsight.com $
 * $URL: https://source.sakaiproject.org/svn/entitybroker/tags/sakai-10.6/api/src/java/org/sakaiproject/entitybroker/entityprovider/extension/RequestGetter.java $
 * RequestGetter.java - entity-broker - Apr 8, 2008 8:56:18 AM - azeckoski
 **************************************************************************
 * Copyright (c) 2008 The Sakai Foundation
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
 */

package org.sakaiproject.entitybroker.entityprovider.extension;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Allows for getting to the request and response objects for the current thread
 * 
 * @author Aaron Zeckoski (aaron@caret.cam.ac.uk)
 */
public interface RequestGetter {

   /**
    * @return the current request for this thread or null if none can be found
    */
   public HttpServletRequest getRequest();

   /**
    * @return the current response for this thread or null if none can be found
    */
   public HttpServletResponse getResponse();

}
