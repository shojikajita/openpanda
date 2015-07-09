/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/help/tags/sakai-10.5/help-api/src/java/org/sakaiproject/api/app/help/Source.java $
 * $Id: Source.java 105079 2012-02-24 23:08:11Z ottenhoff@longsight.com $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2008 The Sakai Foundation
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

/**
 * @version $Id: Source.java 105079 2012-02-24 23:08:11Z ottenhoff@longsight.com $
 */

package org.sakaiproject.api.app.help;

import java.util.Map;
import java.util.Set;

public interface Source
{
  /**
   * get attributes
   * @return map of attributes
   */
  public Map getAttributes();

  /**
   * set attributes
   * @param attributes
   */
  public void setAttributes(Map attributes);

  /**
   * get name
   * @return name
   */
  public String getName();

  /**
   * set name
   * @param name
   */
  public void setName(String name);

  /**
   * get url appenders
   * @return set of url appenders
   */
  public Set getUrlAppenders();

  /**
   * set url appenders
   * @param urlAppenders
   */
  public void setUrlAppenders(Set urlAppenders);
}


