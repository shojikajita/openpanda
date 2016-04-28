/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/kernel/tags/sakai-10.7/kernel-impl/src/main/java/org/sakaiproject/user/impl/DirectDbAccess.java $
 * $Id: DirectDbAccess.java 106293 2012-03-27 13:32:29Z aaronz@vt.edu $
 ***********************************************************************************
 *
 * Copyright (c) 2005, 2006, 2008, 2009, 2010 Sakai Foundation
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

package org.sakaiproject.user.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * DirectDbAccess.java 
 * spring won't instantiate abstract class JdbcDaoSupport.
 * this minimal extension allows spring to instantiate the class.
 *
 * created as a supporting class for UVa SAK-1382 (wdn5e 2010.09.22)
 * used by kernel/kernel-impl/src/main/java/org/sakaiproject/user/impl/PrecachingDbUserService.java
 */
public class DirectDbAccess extends JdbcDaoSupport { }
