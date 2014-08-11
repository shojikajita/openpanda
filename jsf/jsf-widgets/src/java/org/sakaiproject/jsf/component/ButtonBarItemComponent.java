/**********************************************************************************
* $URL: https://source.sakaiproject.org/svn/jsf/tags/jsf-2.9.0/jsf-widgets/src/java/org/sakaiproject/jsf/component/ButtonBarItemComponent.java $
* $Id: ButtonBarItemComponent.java 92466 2011-05-01 12:51:02Z david.horwitz@uct.ac.za $
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


package org.sakaiproject.jsf.component;

import javax.faces.component.html.HtmlCommandButton;


public class ButtonBarItemComponent extends HtmlCommandButton
{
  
  public ButtonBarItemComponent()
  {
    super();
    this.setRendererType("org.sakaiproject.ButtonBarItem");
  }
}



