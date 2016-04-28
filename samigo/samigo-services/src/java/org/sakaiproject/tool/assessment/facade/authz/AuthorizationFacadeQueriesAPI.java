/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/sam/tags/sakai-10.7/samigo-services/src/java/org/sakaiproject/tool/assessment/facade/authz/AuthorizationFacadeQueriesAPI.java $
 * $Id: AuthorizationFacadeQueriesAPI.java 106463 2012-04-02 12:20:09Z david.horwitz@uct.ac.za $
 ***********************************************************************************
 *
 * Copyright (c) 2004, 2005, 2006, 2008 The Sakai Foundation
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

package org.sakaiproject.tool.assessment.facade.authz;
import org.sakaiproject.tool.assessment.data.ifc.authz.AuthorizationIfc;
import org.sakaiproject.tool.assessment.data.ifc.authz.QualifierIfc;

public interface AuthorizationFacadeQueriesAPI
{

  public QualifierIteratorFacade getQualifierParents(String qualifierId);

  public QualifierIteratorFacade getQualifierChildren(String qualifierId);

  public void showQualifiers(QualifierIteratorFacade iter);

  public void addAuthz(AuthorizationIfc a);

  public void addQualifier(QualifierIfc q);

}
