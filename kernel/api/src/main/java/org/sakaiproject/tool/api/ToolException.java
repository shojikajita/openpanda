/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/kernel/branches/kernel-1.2.x/api/src/main/java/org/sakaiproject/tool/api/ToolException.java $
 * $Id: ToolException.java 51317 2008-08-24 04:38:02Z csev@umich.edu $
 ***********************************************************************************
 *
 * Copyright (c) 2005, 2006, 2008 Sakai Foundation
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

package org.sakaiproject.tool.api;

import javax.servlet.ServletException;

/**
 * <p>
 * ToolException is the ServletException that Sakai Tools throw (or use to wrap) when they run into throw-up-my-hands trouble.
 * </p>
 */
public class ToolException extends ServletException
{
	public ToolException()
	{
		super();
	}

	public ToolException(String message)
	{
		super(message);
	}

	public ToolException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public ToolException(Throwable cause)
	{
		super(cause);
	}
}