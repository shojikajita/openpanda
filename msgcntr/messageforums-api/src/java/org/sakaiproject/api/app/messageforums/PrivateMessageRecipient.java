/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/msgcntr/tags/msgcntr-3.0.0/messageforums-api/src/java/org/sakaiproject/api/app/messageforums/PrivateMessageRecipient.java $
 * $Id: PrivateMessageRecipient.java 88696 2011-02-22 18:20:12Z wagnermr@iupui.edu $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2008 The Sakai Foundation
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
package org.sakaiproject.api.app.messageforums;

public interface PrivateMessageRecipient
{
  
  public String getTypeUuid();

  public void setTypeUuid(String typeUuid);
  
  public String getUserId();

  public void setUserId(String userId);
  
  public String getContextId();
  
  public void setContextId(String contextId);

  public Boolean getRead();

  public void setRead(Boolean read);
  
  public Boolean getBcc();
  
  public void setBcc(Boolean bcc);

}

