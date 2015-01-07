/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/rwiki/branches/sakai-2.9.x/rwiki-tool/tool/src/java/uk/ac/cam/caret/sakai/rwiki/tool/service/impl/PrintPageLinkRendererImpl.java $
 * $Id: PrintPageLinkRendererImpl.java 27686 2007-03-23 11:56:40Z ian@caret.cam.ac.uk $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006 The Sakai Foundation.
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package uk.ac.cam.caret.sakai.rwiki.tool.service.impl;

import uk.ac.cam.caret.sakai.rwiki.service.api.PageLinkRenderer;
import uk.ac.cam.caret.sakai.rwiki.tool.bean.ViewBean;
import uk.ac.cam.caret.sakai.rwiki.utils.NameHelper;
import uk.ac.cam.caret.sakai.rwiki.utils.XmlEscaper;

/**
 * A public page link renderer that renders links suitable for use in a public
 * view
 * 
 * @author ieb
 */

public class PrintPageLinkRendererImpl implements PageLinkRenderer
{

	/**
	 * Indicates that the render operation is cachable
	 */
	private boolean cachable = true;

	private boolean useCache = true;

	private boolean withBreadcrumb = true;

	public String localRealm;

	public String localSpace;

	public PrintPageLinkRendererImpl(String localRealm, boolean withBreadcrumb)
	{
		this(localRealm, localRealm, withBreadcrumb);
	}

	public PrintPageLinkRendererImpl(String localSpace, String localRealm,
			boolean withBreadcrumb)
	{
		this.localSpace = localSpace;
		this.localRealm = localRealm;
		this.withBreadcrumb = withBreadcrumb;
	}

	/**
	 * Generates a publiv navigation link
	 */
	public void appendLink(StringBuffer buffer, String name, String view)
	{
		this.appendLink(buffer, name, view, null);
	}

	/**
	 * Generated a print navigation link
	 */
	public void appendLink(StringBuffer buffer, String name, String view,
			String anchor)
	{
		name = NameHelper.globaliseName(name, localSpace);
		ViewBean vb = new ViewBean(name, localRealm);
		if (anchor != null && !"".equals(anchor)) 
		{
			vb.setAnchor(anchor);
		}
		buffer.append("<a href=\""
				+ XmlEscaper.xmlEscape(vb.getPrintViewUrl(withBreadcrumb))
				+ "\">" + XmlEscaper.xmlEscape(view) + "</a>");
	}

	/**
	 * Generates a create link
	 */
	public void appendCreateLink(StringBuffer buffer, String name, String view)
	{
		cachable = false;

		// In public view, pages that dont exist are not links
		buffer.append(XmlEscaper.xmlEscape(view));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see uk.ac.cam.caret.sakai.rwiki.service.api.PageLinkRenderer#isCachable()
	 */
	public boolean isCachable()
	{

		return cachable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see uk.ac.cam.caret.sakai.rwiki.service.api.PageLinkRenderer#canUseCache()
	 */
	public boolean canUseCache()
	{
		return useCache;
	}

	public void setCachable(boolean cachable)
	{
		this.cachable = cachable;

	}

	public void setUseCache(boolean b)
	{
		useCache = b;

	}

	public void appendLink(StringBuffer buffer, String name, String view, String anchor, boolean autoGenerated)
	{
		this.appendLink(buffer, name, view, anchor);
	}

}
