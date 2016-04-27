/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/sam/tags/sakai-10.7/samigo-services/src/java/org/sakaiproject/tool/assessment/osid/assessment/impl/SectionIteratorImpl.java $
 * $Id: SectionIteratorImpl.java 319083 2015-05-20 22:24:13Z enietzel@anisakai.com $
 ***********************************************************************************
 *
 * Copyright (c) 2005, 2006, 2008 The Sakai Foundation
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

package org.sakaiproject.tool.assessment.osid.assessment.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osid.assessment.AssessmentException;
import org.osid.assessment.Section;

public class SectionIteratorImpl
  implements org.osid.assessment.SectionIterator
{
  private Log log = LogFactory.getLog(SectionIteratorImpl.class);
  private Iterator sectionIterator;

  private Iterator sectionIter;

  /**
   * Creates a new ItemIteratorImpl object.
   *
   * @param pitems DOCUMENTATION PENDING
   */
  public SectionIteratorImpl(Set sectionSet)
  {
    this.sectionIter = sectionSet.iterator();
  }

  public SectionIteratorImpl(List sectionList)
  {
    this.sectionIter = sectionList.iterator();
  }

  /* (non-Javadoc)
   * @see osid.assessment.SectionIterator#hasNext()
   */
  public boolean hasNextSection()
    throws AssessmentException
  {
    return sectionIter.hasNext();
  }

  /* (non-Javadoc)
   * @see osid.assessment.SectionIterator#next()
   */
  public Section nextSection()
    throws AssessmentException
  {
    return (Section)sectionIter.next();
  }

}
