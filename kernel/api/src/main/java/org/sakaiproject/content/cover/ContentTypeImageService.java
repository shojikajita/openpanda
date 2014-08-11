/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/kernel/branches/kernel-1.2.x/api/src/main/java/org/sakaiproject/content/cover/ContentTypeImageService.java $
 * $Id: ContentTypeImageService.java 74613 2010-03-15 08:12:01Z david.horwitz@uct.ac.za $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2008 Sakai Foundation
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

package org.sakaiproject.content.cover;

import org.sakaiproject.component.cover.ComponentManager;

/**
 * <p>
 * ContentTypeImageService is a static Cover for the {@link org.sakaiproject.content.api.ContentTypeImageService ContentTypeImageService}; see that interface for usage details.
 * </p>
 * @deprecated Static covers should not be used in favour of injection or lookup
 * via the component manager. This cover will be removed in a later version of the Kernel
 */
public class ContentTypeImageService
{
	/**
	 * Access the component instance: special cover only method.
	 * 
	 * @return the component instance.
	 */
	public static org.sakaiproject.content.api.ContentTypeImageService getInstance()
	{
		if (ComponentManager.CACHE_COMPONENTS)
		{
			if (m_instance == null)
				m_instance = (org.sakaiproject.content.api.ContentTypeImageService) ComponentManager
						.get(org.sakaiproject.content.api.ContentTypeImageService.class);
			return m_instance;
		}
		else
		{
			return (org.sakaiproject.content.api.ContentTypeImageService) ComponentManager
					.get(org.sakaiproject.content.api.ContentTypeImageService.class);
		}
	}

	private static org.sakaiproject.content.api.ContentTypeImageService m_instance = null;

	public static java.lang.String SERVICE_NAME = org.sakaiproject.content.api.ContentTypeImageService.SERVICE_NAME;

	public static java.lang.String getContentTypeImage(java.lang.String param0)
	{
		org.sakaiproject.content.api.ContentTypeImageService service = getInstance();
		if (service == null) return null;

		return service.getContentTypeImage(param0);
	}

	public static java.lang.String getContentTypeDisplayName(java.lang.String param0)
	{
		org.sakaiproject.content.api.ContentTypeImageService service = getInstance();
		if (service == null) return null;

		return service.getContentTypeDisplayName(param0);
	}

	public static java.lang.String getContentTypeExtension(java.lang.String param0)
	{
		org.sakaiproject.content.api.ContentTypeImageService service = getInstance();
		if (service == null) return null;

		return service.getContentTypeExtension(param0);
	}

	public static boolean isUnknownType(java.lang.String param0)
	{
		org.sakaiproject.content.api.ContentTypeImageService service = getInstance();
		if (service == null) return false;

		return service.isUnknownType(param0);
	}

	public static java.lang.String getContentType(java.lang.String param0)
	{
		org.sakaiproject.content.api.ContentTypeImageService service = getInstance();
		if (service == null) return null;

		return service.getContentType(param0);
	}

	public static java.util.List getMimeCategories()
	{
		org.sakaiproject.content.api.ContentTypeImageService service = getInstance();
		if (service == null) return null;

		return service.getMimeCategories();
	}

	public static java.util.List getMimeSubtypes(java.lang.String param0)
	{
		org.sakaiproject.content.api.ContentTypeImageService service = getInstance();
		if (service == null) return null;

		return service.getMimeSubtypes(param0);
	}
}