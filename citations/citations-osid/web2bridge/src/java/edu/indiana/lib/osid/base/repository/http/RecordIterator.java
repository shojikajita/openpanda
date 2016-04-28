package edu.indiana.lib.osid.base.repository.http;


/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/citations/tags/sakai-10.7/citations-osid/web2bridge/src/java/edu/indiana/lib/osid/base/repository/http/RecordIterator.java $
 * $Id: RecordIterator.java 105079 2012-02-24 23:08:11Z ottenhoff@longsight.com $
 **********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2007, 2008 The Sakai Foundation
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
 * @author Massachusetts Institute of Techbology, Sakai Software Development Team
 * @version
 */
public class RecordIterator extends edu.indiana.lib.osid.base.repository.RecordIterator
{
		private static org.apache.commons.logging.Log	_log = edu.indiana.lib.twinpeaks.util.LogUtils.getLog(RecordIterator.class);
		
    private java.util.Vector vector = new java.util.Vector();
    private int i = 0;

    public RecordIterator(java.util.Vector vector)
    throws org.osid.repository.RepositoryException
    {
        this.vector = vector;
    }

    public boolean hasNextRecord()
    throws org.osid.repository.RepositoryException
    {
        return (i < vector.size());
    }

    public org.osid.repository.Record nextRecord()
    throws org.osid.repository.RepositoryException
    {
        if (i >= vector.size())
        {
            throw new org.osid.repository.RepositoryException(org.osid.shared.SharedException.NO_MORE_ITERATOR_ELEMENTS);
        }
        return (org.osid.repository.Record)vector.elementAt(i++);
    }
}
