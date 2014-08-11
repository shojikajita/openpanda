/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/common/branches/common-1.1.x/impl/src/java/org/sakaiproject/component/common/manager/TypeablePersistableImpl.java $
 * $Id: TypeablePersistableImpl.java 96489 2011-08-05 23:47:39Z arwhyte@umich.edu $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006 The Sakai Foundation.
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

package org.sakaiproject.component.common.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sakaiproject.api.common.type.Type;
import org.sakaiproject.api.common.type.Typeable;

/**
 * @author <a href="mailto:lance@indiana.edu">Lance Speelmon</a>
 */
public abstract class TypeablePersistableImpl extends PersistableImpl implements Typeable
{
	private static final Log LOG = LogFactory.getLog(TypeablePersistableImpl.class);

	private static final String NULL = "null";

	private static final String DOT = ".";

	protected Type type;

	/**
	 * @see org.sakaiproject.api.common.manager.Typeable#getType()
	 */
	public Type getType()
	{
		LOG.trace("getType()");

		return type;
	}

	/**
	 * @see org.sakaiproject.api.common.manager.Typeable#setType(org.sakaiproject.api.common.type.Type)
	 */
	public void setType(Type type)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("setType(Type " + type + ")");
		}
		if (type == null) throw new IllegalArgumentException("Illegal type argument passed!");

		this.type = type;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		LOG.trace("toString()");

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(", type=");
		if (type != null)
		{
			sb.append(type.getAuthority());
			sb.append(DOT);
			sb.append(type.getDomain());
			sb.append(DOT);
			sb.append(type.getKeyword());
		}
		else
		{
			sb.append(NULL);
		}
		return sb.toString();
	}

}