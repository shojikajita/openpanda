package edu.indiana.lib.osid.base.repository;

/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/citations/tags/sakai-10.7/citations-osid/web2bridge/src/java/edu/indiana/lib/osid/base/repository/TypeIterator.java $
 * $Id: TypeIterator.java 105079 2012-02-24 23:08:11Z ottenhoff@longsight.com $
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
public abstract class TypeIterator
implements org.osid.shared.TypeIterator
{
    public boolean hasNextType()
    throws org.osid.shared.SharedException
    {
			throw new org.osid.repository.RepositoryException(org.osid.OsidException.UNIMPLEMENTED);
    }

    public org.osid.shared.Type nextType()
    throws org.osid.shared.SharedException
    {
			throw new org.osid.repository.RepositoryException(org.osid.OsidException.UNIMPLEMENTED);
    }
}
