/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/metaobj/tags/sakai-2.9.0/metaobj-api/api/src/java/org/sakaiproject/metaobj/shared/model/FinderException.java $
 * $Id: FinderException.java 59676 2009-04-03 23:18:23Z arwhyte@umich.edu $
 ***********************************************************************************
 *
 * Copyright (c) 2004, 2005, 2006, 2008 The Sakai Foundation
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

package org.sakaiproject.metaobj.shared.model;

public class FinderException extends PersistenceException {

   /**
    * @param errorCode
    * @param errorInfo
    * @param field
    */
   public FinderException(String errorCode, Object[] errorInfo, String field) {
      super(errorCode, errorInfo, field);
   }

   public FinderException() {
      super("", null, "");
   }

}
